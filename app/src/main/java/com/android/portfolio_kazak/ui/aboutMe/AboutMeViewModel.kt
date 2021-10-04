package com.android.portfolio_kazak.ui.aboutMe

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AboutMeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Привет! Меня зовут Агата, мне 19 лет. Я являюсь студенткой 3 курса факультета " +
                "прикладной математики и информатики БГУ."
    }
    val text: LiveData<String> = _text
}