package id.genetik.kotlin.photoapp.models

import java.io.Serializable

/**
 * Created by gama on 6/7/17.
 * Addin Gama Bertaqwa
 * addingama@gmail.com
 */
data class Photo(val id: String,
                 val likes: Int,
                 val favorites: Int,
                 val tags : String,
                 val previewURL: String,
                 val webformatURL: String) : Serializable {

}