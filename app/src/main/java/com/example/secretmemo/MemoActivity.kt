package com.example.secretmemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memo)


        val shareButton=findViewById<FloatingActionButton>(R.id.floatingActionButton)

        //15일차-apk 파일로 빌드 하기
        // https://codemate.kr/project/%EC%BD%94%EB%AE%A4%EB%8B%88%ED%8B%B0-%EB%AA%A8%EA%B0%81%EC%BD%94-APP-%EB%A9%94%EC%9D%B4%ED%8A%B8-%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C-%EA%B8%B0%EB%B3%B8-%EC%BD%94%ED%8B%80%EB%A6%B0%ED%8E%B8/15.-APK-%ED%8C%8C%EC%9D%BC%EB%A1%9C-%EB%B9%8C%EB%93%9C%ED%95%98%EA%B8%B0

        shareButton.setOnClickListener{
            val sendIntent=Intent().apply{
                val message=findViewById<TextView>(R.id.et_Memo)
                val sendMessage=message.text.toString()
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT,sendMessage)
                type="text/plain"
            }

            val shareIntent=Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)
        }
    }
}