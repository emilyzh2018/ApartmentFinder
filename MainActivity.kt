package com.example.apartmentfinder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loginscreen)

        findViewById<Button>(R.id.Loginbtn).setOnClickListener {



            val username = findViewById<EditText>(R.id.Usernametxt).text.toString()
            val password = findViewById<EditText>(R.id.Passwordtxt).text.toString()

            LoginUser(username, password)
            //todo
        }




    }

    }
private fun LoginUser(username: String, password: String) {
//todo
       /* if (username != null) {
            Toast.makeText(username," Logging in", Toast.LENGTH_SHORT).show()

        } else {

            Toast.makeText(this,"Error Logging in", Toast.LENGTH_SHORT).show()

        }*/
    }





