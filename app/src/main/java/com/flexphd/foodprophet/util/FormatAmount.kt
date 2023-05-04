package com.dmj.moneytool.presentation.util

import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.*

open class FormatAmount {
    companion object {
        fun amount(amount: Double): String {
            val amountFormatter =
                DecimalFormat("#,##0.00", DecimalFormatSymbols(Locale.getDefault()))
            return if (amount == 0.00) "" else amountFormatter.format(amount)
        }
    }
}