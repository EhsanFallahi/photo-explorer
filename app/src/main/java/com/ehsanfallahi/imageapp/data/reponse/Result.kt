package com.ehsanfallahi.imageapp.data.reponse


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Result(
    @Json(name = "description")
    var description: String,
    @Json(name = "id")
    var id: String,
    @Json(name = "links")
    var links: Links,
    @Json(name = "urls")
    var urls: Urls,
    @Json(name = "user")
    var user: User,
    @Json(name = "width")
    var width: Int
)