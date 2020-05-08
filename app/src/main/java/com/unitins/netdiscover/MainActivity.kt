package com.unitins.netdiscover

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    var btnLogin = findViewById(R.id.btnLogin) as Button
    var edtLogin = findViewById(R.id.edtEmail) as EditText
    var edtSenha = findViewById(R.id.edtSenha) as EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener(){

        }
    }


}
