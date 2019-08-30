package com.sandeep.textmaterial

import android.content.Context
import android.content.ContextWrapper
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            password.isLight = false
            password.error = resources.getString(R.string.floating_error_incorrect_password)
            password.errorColor = ContextCompat.getColor(this, R.color.colorAccent)
        }
    }
    override fun attachBaseContext(newBase: Context?) {
        if (newBase != null) {
            val context = com.sandeep.textmaterial.contextWrapper.ContextWrapper.wrap(newBase, Locale("en"))    //  for RTL testing use "ar"
            super.attachBaseContext(context)
        } else {
            super.attachBaseContext(newBase)
        }
    }
}
