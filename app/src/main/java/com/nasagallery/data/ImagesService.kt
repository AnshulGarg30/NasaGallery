package com.nasagallery.data

import com.nasagallery.models.ImageModel
import com.nasagallery.utils.Result

interface ImagesService {
    suspend fun getImages(): Result<List<ImageModel>>
}