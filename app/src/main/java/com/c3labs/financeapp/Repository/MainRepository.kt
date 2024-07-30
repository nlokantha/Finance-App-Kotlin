package com.c3labs.financeapp.Repository

import com.c3labs.financeapp.Domain.ExpenseDomain

class MainRepository {
    val items = mutableListOf(
        ExpenseDomain("Restaurant",573.12,"img1","17 jun 2024 19:15"),
        ExpenseDomain("McDonald",77.82,"img2","17 jun 2024 19:15"),
        ExpenseDomain("Cinema",23.47,"img3","17 jun 2024 19:15"),
        ExpenseDomain("McDonald",341.12,"img1","17 jun 2024 19:15")
    )
}