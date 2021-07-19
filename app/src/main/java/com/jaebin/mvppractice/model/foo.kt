package com.jaebin.mvppractice.model

object foo {


    fun getData(x: Int, y: Int, type: String): Int {
        val result = when(type){
            "plus" ->return x+y
            "minus" ->return x-y
            else->0
        }

        return 0
    }

}