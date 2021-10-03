package com.jaebin.testmvp.View

interface ILoginView {
    fun onLoginResult(msg:String)
    fun onEmailAddressError(msg:String)
    fun onPassWordError(msg:String)
    fun onEmptyError(msg:String)
}