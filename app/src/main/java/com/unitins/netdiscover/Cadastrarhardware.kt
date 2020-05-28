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
        var nome: String = "Roteador"
        var descricao: String = "Switch da Intelbras"
        val hardware = Hardware(nome,descricao)
        adicionarUsuario("2",nome, descricao);
    }
    data class Hardware(
        var nome: String? = "",
        var descricao: String? = ""
    )

    private fun adicionarUsuario(UserID: String, nome: String, descricao: String?){
        val hardware = Hardware(nome, descricao)
        database.child("hardwares").child(UserID).setValue(hardware)
    }
}

