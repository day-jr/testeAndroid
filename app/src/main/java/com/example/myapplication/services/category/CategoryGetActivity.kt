package com.example.myapplication.services.category

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.myapplication.CategoryItem
import com.example.myapplication.R
import com.example.myapplication.http.HttpHelper
import kotlinx.coroutines.*


class CategoryGetActivity : AppCompatActivity() {
    private lateinit var categoryListConcatenated : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_get)
        val path = "categories"
        val http = HttpHelper()
        val categoriesTextView = findViewById<TextView>(R.id.category_name)

        CoroutineScope(Dispatchers.IO).launch {
            val promise = async {http.get(path)}
            val response = promise.await()

            val categoryNameList = ArrayList<String>()

            for(category in response.content){
                categoryNameList.add(category.name!!)
            }

            withContext(Dispatchers.Main){
                response.let {

                    fragmentSucker(categoryNameList)

                }

            }

        }

    }

    fun fragmentSucker(name: List<String>) {

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        name.forEach {
            fragmentTransaction.add(R.id.fragment_category_container, CategoryItem.newInstance(it))
        }
        fragmentTransaction.commit()
    }
}


