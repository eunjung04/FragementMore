package com.example.fragementmore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragementmore.adapter.MyFragePagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BasicActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setValues()
        setupEvents()
    }

    override fun setValues() {

    }

    override fun setupEvents() {

        //myViewPager.adapter=MyFragePagerAdapter(supportFragmentManager)

    }
}
