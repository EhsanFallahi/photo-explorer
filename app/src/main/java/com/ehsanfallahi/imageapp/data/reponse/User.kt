package com.ehsanfallahi.imageapp.data.reponse


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class User(
    @Json(name = "username")
    var username: String
)