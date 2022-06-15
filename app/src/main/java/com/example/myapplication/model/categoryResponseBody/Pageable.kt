package com.example.myapplication.model.categoryResponseBody

import com.fasterxml.jackson.annotation.JsonProperty


data class Pageable(
    @JsonProperty("offset") val offset: Int,
    @JsonProperty("pageNumber") val pageNumber: Int,
    @JsonProperty("pageSize") val pageSize: Int,
    @JsonProperty("paged") val paged: Boolean,
    @JsonProperty("sort") val sort: SortX,
    @JsonProperty("unpaged") val unpaged: Boolean
)