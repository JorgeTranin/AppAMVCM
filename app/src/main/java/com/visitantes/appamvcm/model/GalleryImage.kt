package com.visitantes.appamvcm.model

data class GalleryImage(
    // java.lang.ClassCastException: com.google.firebase.Timestamp cannot be cast to java.util.Date

    /*val date: Date,*/
    val description: String,
    val imageURL: String,
    val title: String
)