package com.example.secretmemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val email = findViewById<EditText>(R.id.et_email)
        val password = findViewById<EditText>(R.id.et_password)




        findViewById<Button>(R.id.btn_submit).setOnClickListener{

            val emailText=email.text.toString()
            val passwordText = password.text.toString()
            val tv_enter=findViewById<TextView>(R.id.tv_enter)

            if(emailText =="aaa@gmail.com"){
                if(passwordText == "1234"){
                    Log.d("mymemo","통과")
                    val intent= Intent(this, MemoActivity::class.java)
                    startActivity(intent)
                    this.finish()

                }
                else{
                    Log.d("mymemo","비밀번호가 틀렸어요")
                    tv_enter.setText("비밀번호가 틀렸어요. 다시 입력해주세요")
                }
            }
            else{
                Log.d("mymemo","이메일이 틀렸어요")
            }
        }



    }
}