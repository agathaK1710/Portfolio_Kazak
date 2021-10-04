package com.android.portfolio_kazak.ui.education

import androidx.annotation.DrawableRes

data class EducationItem(
    val name: String,
    val year: String,
    @DrawableRes val image: Int
)
