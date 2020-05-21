package com.unitins.netdiscover

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnLogin = findViewById<Button>(R.id.btnLogin)
        var edtLogin = findViewById<EditText>(R.id.edtEmail);
        var edtSenha = findViewById<EditText>(R.id.edtSenha);
        var btnRegistro = findViewById<Button>(R.id.btnRegistro);

        var context = this;

        btnLogin.setOnClickListener(){
            if(edtLogin.text.toString()==("")){
                Toast.makeText(this,"Botão login pressionado",Toast.LENGTH_LONG).show();
                val intent = Intent(context,Dashboard::class.java);
                startActivity(intent);
                finish();
            }

        }

        btnRegistro.setOnClickListener(){
            if(edtLogin.text.toString()==("")){
                Toast.makeText(this,"Botão Registrar-se pressionado",Toast.LENGTH_LONG).show();
            }

        }


    }


}
