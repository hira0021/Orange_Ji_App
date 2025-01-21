package com.example.orange_ji.utils

import android.app.Dialog
import android.content.Context
import com.example.orange_ji.R

class LoadingDialogUtil(context: Context) {
    private val loadingDialog = Dialog(context)

    fun showDialog() {
        loadingDialog.setContentView(R.layout.dialog_loading)
        loadingDialog.setCancelable(false)
        loadingDialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
        loadingDialog.create()
        loadingDialog.show()
    }

    fun dismissDialog() {
        try {
            loadingDialog.dismiss()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}