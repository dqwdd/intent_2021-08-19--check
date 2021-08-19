package com.neppplus.intent_2021_08_19

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    
    val REQ_FOR_NICKNAME = 1000
    val REQ_FOR_PHONE = 1001
    
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        editNicknameBtn.setOnClickListener { 
            
            val myIntent = Intent(this, EditNicknameActivity::class.java)
            startActivityForResult(myIntent, 1000)
//            1000=걍 구별할 숫자임, 암거나 가능
//            숫자에 REQ_FOR_NICKNAME이라 써도 가능
//            그러면 알아보기 쉽다
            
        }

        moveToOtherBtn.setOnClickListener {

//            버튼이 눌리면 > OtherActivity로 이동

//            출발지 : MainActivity > 도착지 : OtherActivity

            val myIntent = Intent(this, OtherActivity::class.java)
            startActivity(myIntent)
        }

        
        sendMessageBtn.setOnClickListener { 
            
//            먼저 전달 할 내용을 변수에 담자
            val inputMessage = messageEdt.text.toString()
            
//            저장한 변수를 들고 메시지 화면으로 이동
            val myIntent = Intent(this, ViewMessageActivity::class.java)
            
//            myIntent에 데이터 추가, ""안은 이름표고 뒤에 , inputMessage가 데이터
            myIntent.putExtra("이름표임", inputMessage)
            
            startActivity(myIntent)
            
            
        }
        
        
    }
}