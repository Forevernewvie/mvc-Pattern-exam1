package com.jaebin.testmvp.model

interface IUser {
    val email:String
    val passWord:String
    fun isDataValid():Int
}