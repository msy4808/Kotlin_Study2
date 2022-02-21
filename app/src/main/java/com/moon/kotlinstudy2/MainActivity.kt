package com.moon.kotlinstudy2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button)
        val numberIn = findViewById<EditText>(R.id.number)

        btn.setOnClickListener {
            val number = numberIn.text.toString().toInt()

            if(number % 2 == 0) { //코틀린의 if문 JAVA와 크게 다르지 않음
                Toast.makeText(this,"${number}는 2의 배수 입니다...",Toast.LENGTH_SHORT).show()
            }else if(number % 3 == 0) {
                Toast.makeText(this,"${number}는 3의 배수 입니다...",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this,"${number}...",Toast.LENGTH_SHORT).show()
            }
            when(number){ //코틀린의 when문은 switch문과 비슷하지만 break문을 넣지 않아도 그 한구문만 실행되며 {}로 묶어 사용하면 2줄이상의 코드도 사용 가능함
                4 -> btn.text = "실행 -4"
                9,18 -> { // ,를 이용하여 in처럼 범위가 아니라 특정한 값을 따로 지정하여 코드를 작성할 수 있음
                    btn.text = "실행 -9"
                }
                in 5..8 -> { //in 키워드로 범위로 지정해 해당 범위의 값이면 {}안에 코드를 실행함. 순서는 맞출 필요가 없이 중간에 들어가도 정상 동작함(근데 맞추는게 보기좋음)
                    btn.text = "실행 -5"
                }
                else -> btn.text = "실행"
            }
        }
    }
}