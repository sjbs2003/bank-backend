package com.example.bank.datasource.mock

import com.example.bank.datasource.BankDataSource
import com.example.bank.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {

    override fun getBanks(): Collection<Bank> {
        TODO("Not yet implemented")
    }
}