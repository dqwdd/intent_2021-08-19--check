package com.neppplus.intent_2021_08_19

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nickname.*

class EditNicknameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nickname)


        okBtn.setOnClickListener {

//            입력한 닉네임 저장
            val inputNickname = nicknameEdt.text.toString()

//            이전 화면으로 데이터를 들고 복귀
            val resultIntent = Intent()
            resultIntent.putExtra("nick", inputNickname)

//            OK버튼을 눌렀다는 명시를 해줘야 함 + 돌아갈 데이터 세팅도 같이 해줘야 함
            setResult( Activity.RESULT_OK, resultIntent )
            finish()

        }


    }
}