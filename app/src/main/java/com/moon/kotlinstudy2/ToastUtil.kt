package com.moon.kotlinstudy2

import android.widget.Toast

 //코틀린의 최상위 함수, 클래스 외부에 선언하여 패키지의 전역적으로 사용가능
fun toastShort(str:String){
     //둘가 같음 원래 Companion 키워드가 있어야함
    Toast.makeText(MainApplication.Companion.getContext(),str,Toast.LENGTH_SHORT).show()
}
fun toastLong(str:String){
    //위에서 Companion이 생략되었지만 정상동작함
    Toast.makeText(MainApplication.getContext(),str,Toast.LENGTH_LONG).show()
}
class ToastUtil {
}