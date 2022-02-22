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
//                Toast.makeText(this,"${number}는 2의 배수 입니다...",Toast.LENGTH_SHORT).show()
                toastShort("${number}는 2의 배수 입니다...")   //최상위 함수는 어디서든 바로 사용가능!!!!!!!!
            }else if(number % 3 == 0) {
//                Toast.makeText(this,"${number}는 3의 배수 입니다...",Toast.LENGTH_SHORT).show()
                toastShort("${number}는 3의 배수 입니다...")//최상위 함수는 어디서든 바로 사용가능!!!!!!!!
            }else{
//                Toast.makeText(this,"${number}...",Toast.LENGTH_SHORT).show()
                toastShort("${number}...")//최상위 함수는 어디서든 바로 사용가능!!!!!!!!
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

        //코틀린에서 for문 사용법

        val collection = mutableListOf<String>("처음", "두번째", "세번째")
        for(item in collection){ //코틀린에서 for문 사용법(컬렉션(list) 혹은 배열에 대한 for문)
            println(item)
        }

        for((index, value) in collection.withIndex()){ //list의 인덱스값이 필요한 경우 사용법 withIndex()를 통해 접근가능
            println("${index} 번째 데이터는 ${value}입니다")
        }

        for (i in 10..15){ //코틀린에서 for문 사용법. 코틀린은 .. 을 통해 범위를 표현 할 수 있음
            println(i)
        }

        //코틀린에서 while문 사용법

        var x = 30

        while(x < 34){ //JAVA와 거의 차이 X
//            if(x == 30) continue //continue 키워드도 JAVA와 동일하게 사용가능(30일 경우 건너뛰어 30이 출력X)
            println(x)
            x++
        }

        do { //JAVA에서 do블럭 내에 변수는 while문에서 접근이 안되지만 코틀린은 do안에서 선언된 변수도 while문에서 접근 가능
            var y = 50
            println(y)
            y++
        }while(y  < 50)

        //레이블이란 JAVA에선 반복문을 빠져나가는데 break문을 쓰는데 중첩 반복문처럼 여러개가 중첩된 상황에선 코드흐름을 따라가기가 힘듬. 그래서 코틀린에선 레이블이란 기능을 지원함
        //지정할 레이블 이름 뒤에 @를 붙여 레이블을 선언

//        loop@ while(true){ //레이블 지정
//            var i = 0
//
//            if(i == 1){
//                break@loop //break문 뒤에 레이블 이름을 붙여서 해당하는 레이블(반복문)을 지정해서 빠져나감
//            }else{
//                ++i
//            }
//        }
//
//        loop1@ while(true){
//            for(i in 1.. 100){
//                for(i in 2..100){
//                    break@loop1 //여러개가 중첩된 상황에서도 레이블을 통해 모든 반복문을 한번에 탈출 가능
//                }
//            }
//        }

    }
}