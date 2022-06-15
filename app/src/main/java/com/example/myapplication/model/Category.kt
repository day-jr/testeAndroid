package com.example.myapplication.model

import com.google.gson.Gson


class Category {

    private var idCategory = ""
    private var name = ""
    private var imageUrl = null
    private var ownerCategory = null
    private var childrenCategories = null


    public fun getName(): String {
        return this.name
    }

    public fun setName(name: String) {
        this.name = name
    }


    fun toJson(): String {
        return Gson().toJson(this)
    }

    override fun toString(): String {
        return "Category(name='$name')"
    }


}