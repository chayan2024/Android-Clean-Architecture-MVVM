package com.example.data.entitites

import com.google.gson.annotations.SerializedName


data class MovieData(@SerializedName("id") val id: Int,
                     @SerializedName("description") val description: String,
                     @SerializedName("image") val image: String,
                     @SerializedName("backgroundUrl") val backgroundUrl: String,
                     @SerializedName("title") val title: String,
                     @SerializedName("category") val category: String,)
