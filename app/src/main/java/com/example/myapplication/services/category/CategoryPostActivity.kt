package com.example.myapplication.services.category

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.R
import com.example.myapplication.http.HttpHelper
import com.example.myapplication.model.Category
import org.jetbrains.anko.doAsync

class CategoryPostActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_post)

        val button = findViewById<Button>(R.id.button_send)
        val categoryName = findViewById<TextView>(R.id.attribute_1)


        button.setOnClickListener{
            val path = "categories"
            val category = Category()
            category.setName(categoryName.text.toString())


            doAsync {
                val http = HttpHelper()
                http.post(category.toJson(),path)
            }
        }
    }
}