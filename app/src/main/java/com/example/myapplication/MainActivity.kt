package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.annotation.StringRes
import com.example.myapplication.services.category.CategoryMenuActivity
import com.example.myapplication.services.category.CategoryPostActivity

val apiUrl = "http://192.168.1.4:8081/"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        val categoryButton = findViewById<Button>(R.id.category_menu)
//
//
//        categoryButton.setOnClickListener{
//
//            val startCategoryMenu = Intent(this,CategoryMenuActivity::class.java)
//            startActivity(startCategoryMenu)
//        }

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_get)






    }


}