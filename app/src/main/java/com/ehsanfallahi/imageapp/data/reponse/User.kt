package com.ehsanfallahi.imageapp.data.reponse


import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class User(
    @Json(name = "username")
    var username: String
):Parcelable