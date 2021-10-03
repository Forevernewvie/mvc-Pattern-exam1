package com.jaebin.testmvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.jaebin.testmvp.Presenter.ILoginPresenter
import com.jaebin.testmvp.Presenter.LoginPresenter
import com.jaebin.testmvp.View.ILoginView

class MainActivity : AppCompatActivity(),ILoginView {

    private lateinit var loginPresenter: ILoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        loginPresenter = LoginPresenter(this)
        findViewById<Button>(R.id.btn_login).setOnClickListener {
            loginPresenter.onLogin(findViewById<EditText>(R.id.email).text.toString(),
                findViewById<EditText>(R.id.pwd).text.toString()
            )

        }
    }

    override fun onLoginResult(msg: String) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
    }

    override fun onEmailAddressError(msg: String) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
    }

    override fun onPassWordError(msg: String) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
    }

    override fun onEmptyError(msg: String) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
    }


}