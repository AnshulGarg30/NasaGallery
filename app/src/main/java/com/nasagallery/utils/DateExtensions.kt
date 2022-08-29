package com.nasagallery.utils

import java.text.SimpleDateFormat
import java.util.*

fun Date.toDisplayFormat(): String {
    return SimpleDateFormat("dd MMM yy", Locale.getDefault()).format(this)
}