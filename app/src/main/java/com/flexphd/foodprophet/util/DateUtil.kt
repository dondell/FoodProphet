package com.dmj.moneytool.presentation.util

import java.text.SimpleDateFormat
import java.util.*

open class DateUtil {

    open fun currentTimeToLong(): Long {
        return System.currentTimeMillis()
    }

    open fun convertDateToLong(date: String): Long {
        val df = SimpleDateFormat("yyyy.MM.dd HH:mm")
        return df.parse(date).time
    }

    companion object {
        fun convertLongToDateTime(date: Long): String {
            val date = Date(date)
            val format = SimpleDateFormat("yyyy.MM.dd HH:mm")
            return format.format(date)
        }
        fun convertLongToDateTime(date: Long, format: String): String {
            val date = Date(date)
            val format = SimpleDateFormat(format)
            return format.format(date)
        }
        fun convertLongToTime(date: Long): String {
            val date = Date(date)
            val format = SimpleDateFormat("HH:mm a")
            return format.format(date)
        }
    }
}