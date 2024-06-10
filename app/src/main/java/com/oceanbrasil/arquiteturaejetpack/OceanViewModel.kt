package com.oceanbrasil.arquiteturaejetpack

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OceanViewModel : ViewModel() {
    var counter: MutableLiveData<Int> = MutableLiveData(0)
        private set
//git clone https://github.com/scaramuzzini/arquiteturaejetpack
    fun incrementCounter() {
        counter.value = counter.value?.plus(1)
    }
}