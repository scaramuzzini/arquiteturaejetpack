package com.oceanbrasil.arquiteturaejetpack

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OceanViewModel : ViewModel() {
    val counter: MutableLiveData<Int> = MutableLiveData(0)

    fun incrementCounter() {
        counter.value = counter.value?.plus(1)
    }
}