package com.jaebin.testmvp.model

import android.text.TextUtils
import android.util.Patterns
import java.util.regex.Pattern

class User(override val email:String, override val passWord: String):IUser {

    override fun isDataValid(): Int {
        return if(TextUtils.isEmpty(email)){
            0
        }else if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            1
        }else if(passWord.length<=6){
            2
        }else{
            -1
        }
    }



}


