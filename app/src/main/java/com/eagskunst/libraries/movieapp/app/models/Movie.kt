package com.eagskunst.libraries.movieapp.app.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by eagskunst in 8/12/2019.
 */
@Parcelize
data class Movie(val id: Int,
                 val photoUrl: String?,
                 val name: String?,
                 val rating: Float = 0f,
                 val description: String?,
                 val actors: List<Actor>?,
                 val studio: String?,
                 val genres: String?,
                 val releaseDate: String?,
                 val isFavorite: Boolean = false
                 ) : Parcelable