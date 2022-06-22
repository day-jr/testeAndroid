package com.example.myapplication.services.category

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.R
import com.example.myapplication.http.HttpHelper
import com.example.myapplication.model.Category
import kotlinx.coroutines.*


class ProfessionalCategoryPostActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_professional_category_post)
        val confirmationTextView = findViewById<TextView>(R.id.post_category_confirmation_text)
        val button = findViewById<Button>(R.id.button_send)
        val categoryName = findViewById<TextView>(R.id.attribute_1)
        confirmationTextView.text = ""


        button.setOnClickListener {
            val path = "professionalcategories"
            val category = Category()
            category.setName(categoryName.text.toString())

            CoroutineScope(Dispatchers.IO).launch {
                var promise = async {
                    val http = HttpHelper()
                    http.post(category.toJson(), path)
                }
                val response = promise.await()
                withContext(Dispatchers.Main) {
                    response.let {

                        if(response.equals(200)){
                            confirmationTextView.text = "Categoria criada com sucesso!"
                        }else{
                            confirmationTextView.text = "Houve um erro durante a requisição"
                        }



                    }
                }
            }
        }
    }
}