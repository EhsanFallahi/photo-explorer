package com.ehsanfallahi.imageapp.data.reponse


import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class SearchImageResponse(
    @Json(name = "results")
    var results: List<Result>,
    @Json(name = "total")
    var total: Int,
    @Json(name = "total_pages")
    var totalPages: Int
):Parcelable