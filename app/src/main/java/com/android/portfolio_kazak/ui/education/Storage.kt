package com.android.portfolio_kazak.ui.education

import com.android.portfolio_kazak.R

object Storage {
    fun getData(): List<EducationItem> = listOf(
        EducationItem(
            "Беняконская средняя школа",
            "2008-2017",
            R.drawable.school),

        EducationItem(
            "Минский государственный областной лицей, ФизМат",
            "2017-2019",
            R.drawable.lyceum
        ),

        EducationItem(
            "Белорусский государственный университет, ФПМИ",
            "2019 (сейчас на 3 курсе)",
            R.drawable.university
        )
    )
}