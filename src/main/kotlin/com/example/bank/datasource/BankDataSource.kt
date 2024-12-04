package com.example.bank.datasource

import com.example.bank.model.Bank

interface BankDataSource {

    fun getBanks(): Collection<Bank>
}