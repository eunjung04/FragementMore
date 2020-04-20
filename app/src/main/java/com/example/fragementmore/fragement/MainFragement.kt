package com.example.fragementmore.fragement

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragementmore.R
import kotlinx.android.synthetic.main.fragement.*

class MainFragment : Fragment() {
    @@ -17,4 +18,18 @@ class MainFragment : Fragment() {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

//        액티비티의 onCreate에 대응되는 함수.
        okBtn.setOnClickListener {

            val inputMsg = messageEdt.text.toString()

            contentTxt.text = inputMsg
        }
    }

}