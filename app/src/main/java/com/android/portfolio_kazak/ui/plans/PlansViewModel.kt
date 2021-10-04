package com.android.portfolio_kazak.ui.plans

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PlansViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "В мои ближайшие планы входит дальнейшее постепенное изучение фрэймворка Android " +
                "и языка Kotlin. Я очень рада что наконец занимаюсь тем, что мне нравится! Надеюсь," +
                " что в скором времени моё увлечение перерастет в профессию."
    }
    val text: LiveData<String> = _text
}