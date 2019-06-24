package com.mario_antolovic.calculatorapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import java.security.KeyStore

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buNumberEvent(view: View) {
        if (isnewOP) {
            etShowNumber.setText("")
        }
        isnewOP = false


        val buSelect = view as Button

        var btClickValue: String = etShowNumber.text.toString()

        when (buSelect.id) {
            bu0.id -> {
                btClickValue += "0"
            }
            bu1.id -> {
                btClickValue += "1"
            }
            bu1.id -> {
                btClickValue += "1"
            }
            bu2.id -> {
                btClickValue += "2"
            }
            bu3.id -> {
                btClickValue += "3"
            }
            bu4.id -> {
                btClickValue += "4"
            }
            bu5.id -> {
                btClickValue += "5"
            }
            bu6.id -> {
                btClickValue += "6"
            }
            bu7.id -> {
                btClickValue += "7"
            }
            bu8.id -> {
                btClickValue += "8"
            }
            bu9.id -> {
                btClickValue += "9"
            }
            buDot.id -> {
                btClickValue += "."
            }
            buPlusMins.id -> {

                btClickValue = "-" + btClickValue
            }


        }
        etShowNumber.setText(btClickValue)
    }

    var op = "*"
    var oldNumber = ""
    var isnewOP = true

    fun buOpEvent(view: View) {
        val buSelect = view as Button

        when (buSelect.id) {
            btnMul.id -> {
                op="*"
            }
            btnDiv.id -> {
              op="/"
            }
            btnSub.id -> {
           op = "-"
            }
            btnSum.id -> {
           op = "+"
            }

        }

        oldNumber = etShowNumber.text.toString()
        isnewOP=true
    }
    fun btnEqualEvent (view:View) {
        var newNumber = etShowNumber.text.toString()
        var finalNmb  : Double?=null
        when(op) {
            "*"->{
                finalNmb=oldNumber.toDouble() *newNumber.toDouble()
            }
            "/"->{
                finalNmb=oldNumber.toDouble() /newNumber.toDouble()
            }
            "+"->{
                finalNmb=oldNumber.toDouble() +newNumber.toDouble()
            }
            "-"->{
                finalNmb=oldNumber.toDouble() -newNumber.toDouble()
            }
        }
        etShowNumber.setText(finalNmb.toString())
        isnewOP=true
    }
    fun buPercent (view:View) {
        val number : Double=etShowNumber.text.toString().toDouble()/100
        etShowNumber.setText(number.toString())
        isnewOP=true

    }
    fun btnClean (view:View) {
        etShowNumber.setText("0")
        isnewOP=true
    }
}
