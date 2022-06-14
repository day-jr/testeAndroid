package com.example.myapplication.services.category

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R
import com.example.myapplication.http.HttpHelper
import org.jetbrains.anko.doAsync

class CategoryGetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_get)

        doAsync {
            val path = "categories"
            val http = HttpHelper()
            http.get(path)
        }

    }
}