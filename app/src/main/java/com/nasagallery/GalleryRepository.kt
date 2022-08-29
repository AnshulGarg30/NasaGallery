package com.nasagallery

import com.nasagallery.data.ImagesService
import com.nasagallery.models.ImageModel
import com.nasagallery.utils.Result

class GalleryRepository(private val imagesService: ImagesService) {
    suspend fun getImages(): Result<List<ImageModel>> = imagesService.getImages()
}