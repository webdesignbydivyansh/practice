package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a= arrayOf("cfc vhjvb","vghv bhb","vhj yvjh")
//        a.add("")
//        a.add("")
//        a.add("")
        val i= Intent(this,MainActivity2::class.java)
        i.putExtra("array",a)
        startActivity(i)
    }
}