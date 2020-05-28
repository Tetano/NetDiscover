package com.unitins.netdiscover

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class Cadastrarhardware : AppCompatActivity() {
    private lateinit var database: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastrarhardware)
        database = FirebaseDatabase.getInstance().reference
    }
    data class Hardware(
        var nome: String? = "",
        var descricao: String? = ""
    )

    private fun adicionarUsuario(IDnome: String, nome: String, IDdescricao: String, descricao: String?){

    }
}

