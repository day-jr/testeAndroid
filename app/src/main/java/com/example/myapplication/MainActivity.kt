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

val apiUrl = "http://192.168.1.4:8081/"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val categoryButton = findViewById<Button>(R.id.category_menu)


        categoryButton.setOnClickListener {

            val startCategoryMenu = Intent(this, CategoryMenuActivity::class.java)
            startActivity(startCategoryMenu)
        }



    }




}