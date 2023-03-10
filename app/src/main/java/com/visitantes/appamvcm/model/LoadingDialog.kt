package com.visitantes.appamvcm.model

import android.app.Activity
import android.app.AlertDialog
import com.visitantes.appamvcm.R

class LoadingDialog(val activity: Activity) {

    private lateinit var isDialog: AlertDialog

    fun startLoading() {
        val inflater = activity.layoutInflater
        val dialogView = inflater.inflate(R.layout.loading_item, null)
        val builder = AlertDialog.Builder(activity)
        builder.setView(dialogView)
        builder.setCancelable(false)

        isDialog = builder.create()
        isDialog.show()
    }
}