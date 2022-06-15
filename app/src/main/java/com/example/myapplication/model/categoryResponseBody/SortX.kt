package com.example.myapplication.model.categoryResponseBody

import com.fasterxml.jackson.annotation.JsonProperty

data class SortX(
    @JsonProperty("empty") val empty: Boolean,
    @JsonProperty("sorted") val sorted: Boolean,
    @JsonProperty("unsorted") val unsorted: Boolean
)