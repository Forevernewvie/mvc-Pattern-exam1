package com.jaebin.mvppractice.presenter

import com.jaebin.mvppractice.model.foo

class testPresenter(val view:testContract.View): testContract.Presenter {


    override fun calculator(x: Int, y: Int, type: String) {
        val  result = foo.getData(x,y,type)
        view.setRes(result)

    }

}