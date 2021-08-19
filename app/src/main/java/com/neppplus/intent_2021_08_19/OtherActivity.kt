package com.neppplus.intent_2021_08_19

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_other.*

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        returnToMainBtn.setOnClickListener {
//            val myIntent1 = Intent(this, MainActivity::class.java)
//            startActivity(myIntent1)

//            이전 화면 복귀 : 현재 화면을 종료
            finish()
            
        }

    }
}