package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.JsonWriter
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.http.HttpHelper
import com.example.myapplication.model.Category
import com.google.gson.Gson
import org.jetbrains.anko.doAsync


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button_send)
        val categoryName = findViewById<TextView>(R.id.attribute_1)

        button.setOnClickListener() {
            val category = Category()

            category.setName(categoryName.text.toString())



            doAsync {
                val http = HttpHelper()
                http.post(category.toJson())
            }
        }


    }


}