package com.example.dateactivity.dialog

import android.app.Dialog
import android.app.TimePickerDialog
import android.icu.util.Calendar
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import java.text.DateFormat

class TimePicker : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val calendar = Calendar.getInstance()
        val hour = calendar.get(Calendar.HOUR)
        val minute = calendar.get(Calendar.MINUTE)
        return TimePickerDialog(
            requireActivity(),
            activity as TimePickerDialog.OnTimeSetListener,
            hour,
            minute,
            android.text.format.DateFormat.is24HourFormat(activity)
        )
    }
}