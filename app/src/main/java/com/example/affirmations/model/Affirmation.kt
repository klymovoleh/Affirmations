package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

//Create the Affirmation data class
data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int)
