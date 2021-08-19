package com.neppplus.intent_2021_08_19

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    
    val REQ_FOR_NICKNAME = 1000
    val REQ_FOR_PHONE = 1001
    
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dialBtn.setOnClickListener {

//            입력한 전화번호를 변수로 저장
            val inputPhoneNum = phoneNumEdt.text.toString()

//            그 번호로 전화 연결 (전제조건 3가지)
//            1. 어디로 전화 걸지 정보(Uri) 완성
            val myUri = Uri.parse("tel:010-5112-3237")
//            2. 완성된 정보로 전화 거는 Intetn
            val myIntent = Intent( Intent.ACTION_DIAL, myUri)
//            3. 실제로 Intent 실행
            startActivity(myIntent)


        }


        editNicknameBtn.setOnClickListener { 
            
            val myIntent = Intent(this, EditNicknameActivity::class.java)
            startActivityForResult(myIntent, 1000)
//            1000=걍 구별할 숫자임, 암거나 가능
//            숫자에 REQ_FOR_NICKNAME이라 써도 가능
//            그러면 알아보기 쉽다
//            startActivityForResult(myIntent, REQ_FOR_NICKNAME)이렇게
            
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

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQ_FOR_NICKNAME) {
            if (resultCode == Activity.RESULT_OK) {
//                2가지 if문 통과 == data 뽑아내자
//                data 보면 ? 처리 되있자나 그래서 밑에 data에도 ? 처리 해야 함
                val newNick = data?.getStringExtra("nick")

                nicknameTxt.text = newNick

            }
        }

    }


}