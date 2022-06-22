package com.example.myapplication.services.category

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.R

class ProfessionalCategoryMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_professional_category_menu)
        val buttonPost = findViewById<Button>(R.id.button_category_post)
        val buttonGetAll = findViewById<Button>(R.id.button_category_get)

        buttonPost.setOnClickListener{
            val postCategory = Intent(this, CategoryPostActivity::class.java)
            startActivity(postCategory)
        }

        buttonGetAll.setOnClickListener{
            val getAllCategories = Intent(this, CategoryGetActivity::class.java)
            startActivity(getAllCategories)
        }
    }




}