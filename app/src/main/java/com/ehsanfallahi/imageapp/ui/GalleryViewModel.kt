package com.ehsanfallahi.imageapp.ui

import androidx.lifecycle.ViewModel
import com.ehsanfallahi.imageapp.data.repository.ImageAppRepository
import javax.inject.Inject

class GalleryViewModel @Inject
constructor(val imageAppRepository: ImageAppRepository)
    :ViewModel(){

}