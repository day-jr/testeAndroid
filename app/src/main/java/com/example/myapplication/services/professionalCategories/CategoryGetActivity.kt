package com.example.myapplication.services.category

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.myapplication.R
import com.example.myapplication.http.HttpHelper
import kotlinx.coroutines.*


class ProfessionalCategoryGetActivity : AppCompatActivity() {
    private lateinit var professionalCategoryListConcatenated : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_professional_category_get)
        val path = "professionalcategories"
        val http = HttpHelper()
        val long : Float = 0F
        val lat : Float = 0F
        val radius : Float = 0F
        val categoriesTextView = findViewById<TextView>(R.id.CategoriesTextView)

        CoroutineScope(Dispatchers.IO).launch {
            val promise = async {http.getNearby(path,long,lat,radius)}
            val response = promise.await()

            professionalCategoryListConcatenated = ""
            for(category in response.content){
                professionalCategoryListConcatenated+= category
            }

            withContext(Dispatchers.Main){
                response.let {
                    categoriesTextView.text = professionalCategoryListConcatenated
                }

            }

        }

    }
}


