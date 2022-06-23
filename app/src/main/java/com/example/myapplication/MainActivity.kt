package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.annotation.StringRes
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainer
import com.example.myapplication.services.category.CategoryMenuActivity
import com.example.myapplication.services.category.CategoryPostActivity

val apiUrl = "http://dev.ipretty.com.br:8081/"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val categoryButton = findViewById<Button>(R.id.category_menu)


        categoryButton.setOnClickListener{

            val startCategoryMenu = Intent(this,CategoryMenuActivity::class.java)
            startActivity(startCategoryMenu)
        }

//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_category_get)
//
//        //TODO mover isso aq pra activity certa..
//        val categoryName = "testesteste"
//
//        val lista: List<String> = listOf("teste","teste2","teste3")
//        fragmentSucker(lista)

    }

    fun fragmentSucker(name:List<String>) {

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        name.forEach{
            fragmentTransaction.add(R.id.fragment_category_container, CategoryItem.newInstance(it))
        }
        fragmentTransaction.commit()
    }


}