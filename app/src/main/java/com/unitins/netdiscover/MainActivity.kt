package com.unitins.netdiscover


import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext


class MainActivity : AppCompatActivity() {
    lateinit var auth: FirebaseAuth
    var database = FirebaseDatabase.getInstance()
    var context = this
    override fun onCreate(savedInstanceState: Bundle?) {

        var edtEmail = findViewById<EditText>(R.id.edtEmail)
        var edtSenha = findViewById<EditText>(R.id.edtSenha)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
          auth = FirebaseAuth.getInstance()

        btnLogin.setOnClickListener{
            loginUser()
        }
        btnRegistro.setOnClickListener{
            registerUser()
        }
    }

private fun registerUser() {
    val email = edtEmail.text.toString()
    val password = edtSenha.text.toString()

    if (email.isNotEmpty() && password.isNotEmpty()) {
        CoroutineScope(Dispatchers.IO).launch {
            try {
                auth.createUserWithEmailAndPassword(email, password).await()
                withContext(Dispatchers.Main) {
                    checkLoggedInState()
                }
            } catch (e: Exception) {
                withContext(Dispatchers.Main) {
                    Toast.makeText(this@MainActivity, e.message, Toast.LENGTH_LONG).show()
                    print(email);
                }
            }
            edtEmail.text.clear()
            edtSenha.text.clear()
        }
    }
}
    private fun checkLoggedInState(){
        if(auth.currentUser == null){
            Toast.makeText(this,"Você não está logado",Toast.LENGTH_LONG)

        }
        else{
            Toast.makeText(this,"Você está logado",Toast.LENGTH_LONG)
            Toast.makeText(this,"Botão login pressionado",Toast.LENGTH_LONG).show();
            val intent = Intent(context,Menu::class.java);
            startActivity(intent);
            finish();
        }
    }



    private fun  loginUser() {
        val email = edtEmail.text.toString()
        val password = edtSenha.text.toString()
        if (email.isNotEmpty() && password.isNotEmpty()) {
            CoroutineScope(Dispatchers.IO).launch {
                try {
                    auth.signInWithEmailAndPassword(email, password).await()
                    withContext(Dispatchers.Main) {
                        checkLoggedInState()
                    }
                } catch (e: Exception) {
                    withContext(Dispatchers.Main) {
                        Toast.makeText(this@MainActivity, e.message, Toast.LENGTH_LONG).show()
                        print(email);

                    }
                }
                edtEmail.text.clear()
                edtSenha.text.clear()

            }
        }
    }
}


