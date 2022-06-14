package com.example.myapplication.model

import com.google.gson.Gson


class Category {
    private var name = ""

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