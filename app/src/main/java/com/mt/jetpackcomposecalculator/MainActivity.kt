package com.mt.jetpackcomposecalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.mt.jetpackcomposecalculator.calculator.CalculatorViewModel
import com.mt.jetpackcomposecalculator.calculator.MyCalculator
import com.mt.jetpackcomposecalculator.ui.theme.JetpackComposeCalculatorTheme
import com.mt.jetpackcomposecalculator.ui.theme.MediumGrey

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeCalculatorTheme {
                val viewModel = viewModel<CalculatorViewModel>()
                val state = viewModel.state
                MyCalculator(
                    state = state,
                    8.dp,
                    modifier = Modifier.fillMaxSize().background(MediumGrey).padding(16.dp),
                    onAction = viewModel::onAction
                )
            }
        }
    }
}