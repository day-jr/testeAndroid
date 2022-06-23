package com.example.myapplication.model.categoryResponseBody

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

//@JsonIgnoreProperties(ignoreUnknown = true)
data class CategoryResponseBody(
     @JsonProperty("content") val content: List<Content>,
     @JsonProperty("empty") val empty: Boolean,
     @JsonProperty("first") val first: Boolean,
     @JsonProperty("last") val last: Boolean,
     @JsonProperty("number") val number: Int,
     @JsonProperty("numberOfElements") val numberOfElements: Int,
     @JsonProperty("pageable") val pageable: Pageable,
     @JsonProperty("size") val size: Int,
     @JsonProperty("sort") val sort: SortX,
     @JsonProperty("totalElements") val totalElements: Int,
     @JsonProperty("totalPages") val totalPages: Int

)