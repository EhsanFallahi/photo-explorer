package com.ehsanfallahi.imageapp.data.reponse


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SearchImageResponse(
    @Json(name = "results")
    var results: List<Result>,
    @Json(name = "total")
    var total: Int,
    @Json(name = "total_pages")
    var totalPages: Int
)