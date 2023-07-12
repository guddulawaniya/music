package com.example.koltinlogindesign

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Display.Mode
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class login_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        var loginemail : (TextInputEditText) = findViewById(R.id.loginemail)
        var password : (TextInputEditText) = findViewById(R.id.passlogin)
        var loginbutton : (Button) = findViewById(R.id.loginbutton)

        loginbutton.setOnClickListener(){
            val  sh = getSharedPreferences("logindetails", MODE_PRIVATE)
            var email = sh.getString("email",null);
            var pass = sh.getString("pass",null);

            loginbutton.setOnClickListener(){
                if (loginemail.text.toString().equals(email) and password.text.toString().equals(pass))
                {
                    var intent =  Intent(this@login_activity , MainActivity::class.java)
                    Toast.makeText(applicationContext,"login Successfully users",Toast.LENGTH_SHORT).show()
                    startActivity(intent)
                    finish()
                }
                else
                {
                    Toast.makeText(applicationContext,"Invalid email and password",Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}