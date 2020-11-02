package com.idvmob4.pictionis

import android.content.Context
import android.net.ConnectivityManager

class ConnectionDetectorManager {
        fun isConnectingToInternet(context:Context):Boolean {
            var hasActiveInternet = false
            val connectivity = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            if (connectivity != null)
            {
                val activeNetWork = connectivity.getActiveNetworkInfo()
                if (activeNetWork != null)
                {
                    when (activeNetWork.getType()) {
                        ConnectivityManager.TYPE_WIFI ->hasActiveInternet=true
                        ConnectivityManager.TYPE_MOBILE -> hasActiveInternet = true
                        else -> hasActiveInternet = false
                    }
                }
            }
            return hasActiveInternet
        }
    }
