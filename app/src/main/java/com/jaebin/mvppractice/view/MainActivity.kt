package com.jaebin.mvppractice.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.jaebin.mvppractice.databinding.ActivityMainBinding
import com.jaebin.mvppractice.presenter.testContract
import com.jaebin.mvppractice.presenter.testPresenter

class MainActivity : AppCompatActivity(), testContract.View {

    private lateinit var testPresenter: testPresenter
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        testPresenter = testPresenter(this)
        binding.plsuBtn.setOnClickListener {
            testPresenter.calculator(getNum1().toInt(),getNum2().toInt(),binding.plsuBtn.text.toString())
        }
        binding.minusBtn.setOnClickListener {
            testPresenter.calculator(getNum1().toInt(),getNum2().toInt(),binding.minusBtn.text.toString())
        }

    }

    override fun getNum1(): String = binding.op1.text.toString()
    override fun getNum2(): String =binding.op2.text.toString()
    override fun setRes(result: Int) { binding.result.text = result.toString()}


}