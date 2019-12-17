package com.example.project1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.applib2.Lib2

class MainActivity : AppCompatActivity() {
    private var textView:TextView?=null
    private var textView2:TextView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView=findViewById(R.id.test)
        textView2=findViewById(R.id.test2)
        textView2?.text= this.packageName
        textView?.text=Lib2().testLib2()

    }
    fun test(){

    }

    
}
