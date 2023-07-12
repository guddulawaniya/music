
package com.example.koltinlogindesign

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class registration_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        var yournme : (TextInputEditText) = findViewById(R.id.youname)
        var mobilenumber : (TextInputEditText) = findViewById(R.id.mobile)
        var emailid : (TextInputEditText) = findViewById(R.id.email)
        var password : (TextInputEditText) = findViewById(R.id.password)
        var signupbutton : (Button) = findViewById(R.id.signupbutton)

        signupbutton.setOnClickListener(){
            if (yournme.text.toString().isNotEmpty() and mobilenumber.text.toString().isNotEmpty() and emailid.text.toString().isNotEmpty() and password.text.toString().isNotEmpty())
            {
                val intent = Intent(this@registration_activity,login_activity::class.java)
                val sharedPreferences = getSharedPreferences("logindetails", MODE_PRIVATE).edit()
                sharedPreferences.putString("email",emailid.text.toString())
                sharedPreferences.putString("pass",password.text.toString())
                sharedPreferences.commit()
                startActivity(intent)
            }
        }

        val sh = getSharedPreferences("logindetails", MODE_PRIVATE);
        var email = sh.getString("email",null);
        if (email != null) {
                val intent = Intent(this@registration_activity,MainActivity::class.java)
                startActivity(intent)
                finish()
        }



    }
}