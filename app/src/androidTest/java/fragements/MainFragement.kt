package fragements

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.test.espresso.action.AdapterViewProtocol
import com.example.fragementmore.BasicActivity
import com.example.fragementmore.R
import java.util.zip.Inflater

class MainFragement : Fragement() {

    override  fun onCreatView(
        inflater: LayoutInflater,
        container : ViewGroup?,
        savedInstanceState : Bundle?

    ): View? {

        return inflater.inflate(R.layout.fragement,container,false)
    }
}

f