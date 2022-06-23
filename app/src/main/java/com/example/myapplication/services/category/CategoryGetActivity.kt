package com.example.myapplication.services.category

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.myapplication.R
import com.example.myapplication.http.HttpHelper
import kotlinx.coroutines.*


class CategoryGetActivity : AppCompatActivity() {
    private lateinit var categoryListConcatenated : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test)
        val path = "categories"
        val http = HttpHelper()
        val categoriesTextView = findViewById<TextView>(R.id.textView)

        CoroutineScope(Dispatchers.IO).launch {
            val promise = async {http.get(path)}
            val response = promise.await()

            categoryListConcatenated = ""
            for(category in response.content){
                categoryListConcatenated+= category.name
            }

            withContext(Dispatchers.Main){
                response.let {


                    categoriesTextView.text = categoryListConcatenated
                }

            }

        }

    }
}


