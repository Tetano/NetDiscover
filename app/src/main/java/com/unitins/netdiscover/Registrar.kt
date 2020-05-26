package com.unitins.netdiscover

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class Registrar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar)
    }
}
//btnLogin.setOnClickListener(){
//    if(edtLogin.text.toString()==("")){
//        Toast.makeText(this,"Botão login pressionado", Toast.LENGTH_LONG).show();
//        val intent = Intent(context,Dashboard::class.java);
//        startActivity(intent);
//        finish();
//    }
//
//}
//
//btnRegistro.setOnClickListener(){
//    if(edtLogin.text.toString()==("")){
//        Toast.makeText(this,"Botão Registrar-se pressionado", Toast.LENGTH_LONG).show();
//    }
//
//}