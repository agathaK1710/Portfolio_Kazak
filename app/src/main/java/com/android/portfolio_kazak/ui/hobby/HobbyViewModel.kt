package com.android.portfolio_kazak.ui.hobby

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HobbyViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Моё хобби - это фотография. Я очень люблю обрабатывать фото. Но, есть один нюанс," +
                " мне приятнее обрабатывать фото, которые сделала я сама. Потому что разница," +
                " которую видишь на фото до/после приносит нереальное удовольствие. Поэтому я еще " +
                "и фотографирую."
    }
    val text_hobby: LiveData<String> = _text
}