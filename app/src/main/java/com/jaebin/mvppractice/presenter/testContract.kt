package com.jaebin.mvppractice.presenter

interface testContract {

    interface View{
        fun getNum1():String
        fun getNum2() : String
        fun setRes(result : Int)
    }

    interface Presenter{
        fun calculator(x:Int,y:Int,type:String)
    }

}