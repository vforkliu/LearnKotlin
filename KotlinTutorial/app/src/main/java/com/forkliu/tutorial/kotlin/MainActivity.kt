package com.forkliu.tutorial.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.tv_hello).setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        })
    }
}
