package com.example.secretmemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var email = findViewById<EditText>(R.id.et_email)
        var password = findViewById<EditText>(R.id.et_password)




        findViewById<Button>(R.id.btn_submit).setOnClickListener{

            var emailText=email.text.toString()
            var passwordText = password.text.toString()

            if(emailText =="aaa@gmail.com"){
                if(passwordText == "1234"){
                    Log.d("mymemo","통과")
                }
                else{
                    Log.d("mymemo","비밀번호가 틀렸어요")
                }
            }
            else{
                Log.d("mymemo","이메일이 틀렸어요")
            }
        }



    }
}