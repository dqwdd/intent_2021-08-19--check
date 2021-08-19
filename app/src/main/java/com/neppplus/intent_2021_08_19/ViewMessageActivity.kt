package com.neppplus.intent_2021_08_19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_message.*

class ViewMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_message)


//        화면에 들어오자마자 첨부된 데이터 있는지 확인부터 하고 저장하자
        val receivedMessage = intent.getStringExtra("이름표임")
//        intent로 왔으니까 intent 쓰고 스트링값이엇는진 모르지만 겟 스트링으로 받고
//        ""사이는 꼬리표 이름 쓰는거임

//        이제 UI에 반영
        messageTxt.text = receivedMessage


    }
}