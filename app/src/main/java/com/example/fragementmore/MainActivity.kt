package com.example.fragementmore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : BasicActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setValues()
        setupEvents()
    }
}
