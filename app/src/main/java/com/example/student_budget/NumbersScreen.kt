package com.example.student_budget


import androidx.compose.foundation.layout.Column

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.text.input.TextFieldValue

@Composable
fun NumbersScreen() {

    var incomeValue by remember { mutableStateOf(TextFieldValue("0")) }
    var expenseValue by remember { mutableStateOf(TextFieldValue("0")) }

    val income = incomeValue.text.toIntOrNull() ?: 0
    val expenses = expenseValue.text.toIntOrNull() ?: 0

    val allowanceValue = income - expenses

    Column {

        TextField(
            value = incomeValue,
            onValueChange = {
                incomeValue = it
            },
            label = { Text("Income") }
        )

        TextField(
            value = expenseValue,
            onValueChange = {
                expenseValue = it
            },
            label = { Text("Fixed Expenses") }
        )

        Text("Allowance: $allowanceValue")
    }
}




