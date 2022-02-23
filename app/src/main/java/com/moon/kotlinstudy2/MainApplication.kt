package com.moon.kotlinstudy2

import android.app.Application
import android.content.Context

class MainApplication : Application() {
    init {
        instance = this //MainApplication 클래스가 초기화될때 instance를 초기화해줌

    }

    companion object{
         lateinit var instance:MainApplication //늦은 초기화를 위해 iateinit 선언

        fun getContext():Context {
            return instance.applicationContext
        }
    }
}