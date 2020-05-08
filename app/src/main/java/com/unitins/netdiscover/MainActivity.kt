package com.unitins.netdiscover

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnLogin = findViewById(R.id.btnLogin) as Button
        var edtLogin = findViewById(R.id.edtEmail) as EditText
        var edtSenha = findViewById(R.id.edtSenha) as EditText
        btnLogin.setOnClickListener(){

            if(btnLogin.text.toString().equals("vinicius")){
                Toast.makeText(this,"Bottão pressionado",Toast.LENGTH_LONG).show();
            }

        }


    }


}
