package com.example.myapplication.model.categoryResponseBody

import com.fasterxml.jackson.annotation.JsonProperty

data class Content(
    @JsonProperty("childrenCategories") val childrenCategories: List<Any>?,
    @JsonProperty("idCategory") val idCategory: String?,
    @JsonProperty("imageUrl") val imageUrl: String?,
    @JsonProperty("name") val name: String?,
    @JsonProperty("ownerCategory") val ownerCategory: Any?
){
    override fun toString(): String {
        return "idCategory=${idCategory}\nname=${name}\n"
    }
}



