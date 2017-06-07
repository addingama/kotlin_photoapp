package id.genetik.kotlin.photoapp.api

import id.genetik.kotlin.photoapp.models.PhotoList
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by gama on 6/7/17.
 * Addin Gama Bertaqwa
 * addingama@gmail.com
 */
interface PhotoAPI {
    @GET("?key=5569682-1e1e532aa5934676c82347965&q=nature&image_type=photo")
    fun getPhotos() : Call<PhotoList>
}