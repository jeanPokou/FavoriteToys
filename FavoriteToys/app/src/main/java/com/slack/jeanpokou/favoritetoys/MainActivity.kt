package com.slack.jeanpokou.favoritetoys

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val toysName: Array<String> = ToyBox.getToysName()

        for (s in toysName) {
            tv_toy_names.append(s + "\n\n")
        }

    }
}
