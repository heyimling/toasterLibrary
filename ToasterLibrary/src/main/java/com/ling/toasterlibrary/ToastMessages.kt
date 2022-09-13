package com.ling.toasterlibrary

import android.content.Context
import android.widget.Toast

class ToastMessages {
    fun toast(c: Context, msg: String) {
        Toast.makeText(c, msg, Toast.LENGTH_LONG).show()
    }

    fun fixedToast(c: Context) {
        Toast.makeText(c, "This is a new function", Toast.LENGTH_LONG).show()
    }
}