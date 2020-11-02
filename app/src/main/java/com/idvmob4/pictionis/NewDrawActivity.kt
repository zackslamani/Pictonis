package com.idvmob4.pictionis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN
import com.idvmob4.pictionis.PainActivity

class NewDrawActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val myPainActivity = PainActivity(this)
        // No XML file; just one custom view created programmatically.
        // Request the full available screen for layout.
        myPainActivity.systemUiVisibility = SYSTEM_UI_FLAG_FULLSCREEN
        myPainActivity.contentDescription = getString(R.string.canvasContentDescription)
        setContentView(myPainActivity)
    }
}