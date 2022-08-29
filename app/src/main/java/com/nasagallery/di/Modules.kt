package com.nasagallery.di

import com.nasagallery.GalleryRepository
import com.nasagallery.data.AssetImageService
import com.nasagallery.data.ImagesService
import com.nasagallery.ui.ImageListingViewModel
import com.nasagallery.utils.FileUtils
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val applicationModule = module {
    //Application Level dependencies goes here
    single {
        FileUtils()
    }
}

val serviceModules = module {
    //Service Layer dependencies goes here
    single<ImagesService> {
        AssetImageService(get(), get())
    }
}

val repositoryModules = module {
    //Repositories dependencies goes here
    single {
        GalleryRepository(get())
    }
}

val viewModelModules = module {
    //ViewModels dependencies goes here
    viewModel {
        ImageListingViewModel(get())
    }
}