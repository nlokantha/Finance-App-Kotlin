package com.c3labs.financeapp.ViewModel

import androidx.lifecycle.ViewModel
import com.c3labs.financeapp.Repository.MainRepository

class MainViewModel(val repository: MainRepository):ViewModel() {
    constructor():this(MainRepository())

    fun loadData() = repository.items
}