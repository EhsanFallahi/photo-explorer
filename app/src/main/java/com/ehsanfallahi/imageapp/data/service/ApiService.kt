package com.ehsanfallahi.imageapp.data.service

import com.ehsanfallahi.imageapp.data.reponse.SearchImageResponse
import com.ehsanfallahi.imageapp.util.Constant.Companion.API_ACCESS_KEY
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiService {
    //https://api.unsplash.com/search/photos?page=1&per_page=1&query=dog&client_id=u-jQ_f01vFbiSwIq3IUo0ryD9hd14p6B_opKK38QAt0

    @Headers("Accept-Version: v1","Authorization: Client-ID $API_ACCESS_KEY")
    @GET("search/photos")
    fun getSearchesPhotos(
        @Query("query")query:String,
        @Query("page")page:Int,
        @Query("per_page")perPage:Int
    ):Deferred<SearchImageResponse>
}