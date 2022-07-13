package com.dc.androidbaseproject

import android.os.Bundle
import androidx.databinding.ViewDataBinding
import androidx.viewbinding.ViewBinding
import com.dc.androidbaseproject.databinding.ActivityMainBinding
import com.dc.base.ui.core.BaseBindingActivity

class MainActivity : BaseBindingActivity<ActivityMainBinding>() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setBindingView(R.layout.activity_main)

    }
}