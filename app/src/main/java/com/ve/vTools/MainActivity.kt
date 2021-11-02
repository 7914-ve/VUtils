package com.ve.vTools

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.ve.vUtils.LogUtil


class MainActivity : AppCompatActivity() {
    private val TAG = "mySDKTest"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<View>(R.id.button) as Button
        button.setOnClickListener( object : View.OnClickListener {
            override fun onClick(view: View?) {
                LogUtil.d("You clicked module button!!  1234")
            }
        })
    }

}