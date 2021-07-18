package com.jaebin.mvppractice.presenter

class testPresenter(val view:testContract.View): testContract.Presenter {


    override fun calculator(x: Int, y: Int, type: String) {
        val result = when(type){
            "plus" ->x+y
            "minus" ->x-y
            else->0
        }

        view.setRes(result)

    }

}