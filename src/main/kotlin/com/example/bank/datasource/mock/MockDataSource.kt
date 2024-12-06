package com.example.bank.datasource.mock

import com.example.bank.datasource.BankDataSource
import com.example.bank.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {

    val banks = listOf(
        Bank("9188", 1.0, 11),
        Bank("8810", 6.1, 0),
        Bank("6140", 0.0, 13)
    )

    override fun retrieveBanks(): Collection<Bank> {
        return banks
    }
}