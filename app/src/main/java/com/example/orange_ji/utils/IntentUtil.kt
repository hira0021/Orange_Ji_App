package com.example.orange_ji.utils

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle

object IntentUtil {
    fun createIntent(context: Context, destinationActivity: Class<*>, extras: Bundle? = null): Intent {
        val intent = Intent(context, destinationActivity)
        extras?.let { intent.putExtras(it) }
        return intent
    }

    fun startActivity(activity: Activity, destinationActivity: Class<*>, extras: Bundle? = null) {
        val intent = createIntent(activity, destinationActivity, extras)
        activity.startActivity(intent)
    }

    fun startActivityForResult(
        activity: Activity,
        destinationActivity: Class<*>,
        requestCode: Int,
        extras: Bundle? = null
    ) {
        val intent = createIntent(activity, destinationActivity, extras)
        activity.startActivityForResult(intent, requestCode)
    }
}