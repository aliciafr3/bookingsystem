package com.example.aufgabe3.viewmodel

import androidx.lifecycle.ViewModel
import com.example.aufgabe3.model.BookingEntry
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class SharedViewModel: ViewModel() {
    private val _bookingsEntries = MutableStateFlow<List<BookingEntry>>(emptyList())
    val bookingsEntries: StateFlow<List<BookingEntry>> = _bookingsEntries

    fun addBookingEntry(entry: BookingEntry) {
        _bookingsEntries.value = _bookingsEntries.value + entry
    }

    fun deleteBookingEntry(entry: BookingEntry) {
        _bookingsEntries.value = _bookingsEntries.value - entry
    }
}