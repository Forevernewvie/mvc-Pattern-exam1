package com.jaebin.testmvp.Presenter

import com.jaebin.testmvp.View.ILoginView
import com.jaebin.testmvp.model.User

class LoginPresenter (var iLoginView: ILoginView) :ILoginPresenter{

    override fun onLogin(email: String, password: String) {
        val user = User(email,password)
        val loginCode =user.isDataValid()

        if (loginCode==0){
            iLoginView.onEmptyError("이메일을 입력해주세요")
        }else if(loginCode==1){
            iLoginView.onEmailAddressError("잘못된 이메일 형식")
        }else if(loginCode==2){
            iLoginView.onPassWordError("패스워드 길이 6자 이하입니다.")
        }else{
            iLoginView.onLoginResult("로그인 성공")
        }


    }


}