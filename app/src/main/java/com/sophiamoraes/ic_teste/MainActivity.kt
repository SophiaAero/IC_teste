package com.sophiamoraes.ic_teste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val emailEditText : EditText = findViewById(R.id.emailEditText)
        val EnterButton : Button = findViewById(R.id.EnterButton)
        EnterButton.setOnClickListener {
            val bemail: String = emailEditText.text.toString()
            if(bemail.length != 5){
                Toast.makeText(this,R.string.email_entry_error, Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this,bemail,Toast.LENGTH_SHORT).show()
            }
        }
    }



}