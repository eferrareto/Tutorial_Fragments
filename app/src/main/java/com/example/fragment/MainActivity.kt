package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.add
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {
    lateinit var btnFragment : Button
    lateinit var btnSecond : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnFragment = findViewById(R.id.btnUno)
        btnSecond = findViewById(R.id.btnDos)

        btnFragment.setOnClickListener {

                supportFragmentManager.commit {
                    setReorderingAllowed(true)
                    add<MainFragment>(R.id.fragmentContainer)
                }

        }

        btnSecond.setOnClickListener {
            
                supportFragmentManager.commit {
                    setReorderingAllowed(true)
                    add<SecondFragment>(R.id.fragmentContainer)

                }

        }

    }
}
