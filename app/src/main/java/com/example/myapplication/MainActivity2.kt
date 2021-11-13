package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val ar=intent.getStringArrayExtra("array")
        for(i in 0..ar!!.size-1)
            Log.d("TAG", ar[i])
        Toast.makeText(this,"${ar[0]}",Toast.LENGTH_SHORT).show()
    }
}