package com.example.thirdmonth_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView




        class MainActivity : AppCompatActivity() {

            lateinit var resultNum : TextView
            lateinit var first : EditText
            lateinit var second : EditText
            lateinit var  plus : Button
            lateinit var  minus : Button
            lateinit var  divide : Button
            lateinit var   multi : Button

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                resultNum = findViewById(R.id.numRes)
                first = findViewById(R.id.int_one)
                second = findViewById(R.id.int_two)
                plus = findViewById(R.id.plus)
                minus = findViewById(R.id.minus)
                divide = findViewById(R.id.divide)
                multi = findViewById(R.id.multi)



                plus.setOnClickListener {
                    val res1 = first.text.toString().toInt()
                    val res2 = second.text.toString().toInt()
                    plusFun(res1, res2)
                }

                minus.setOnClickListener {
                    val res1 = first.text.toString().toInt()
                    val res2 = second.text.toString().toInt()
                    minusFun(res1, res2)
                }
                multi.setOnClickListener {
                    val res1 = first.text.toString().toInt()
                    val res2 = second.text.toString().toInt()
                    multiFun(res1, res2)
                }
                divide.setOnClickListener {
                    val res1 = first.text.toString().toInt()
                    val res2 = second.text.toString().toInt()
                    divideFun(res1, res2)
                }
            }


            private fun plusFun(res1: Int, res2: Int) {
                val resPlus = res1 + res2
                resultNum.text = "result is: $resPlus"
            }

            private fun minusFun(res1: Int, res2: Int){
                val resMinus = res1 - res2
                resultNum.text = "result is: $resMinus"
            }

            private fun multiFun(res1: Int, res2: Int){
                val resMulti = res1 * res2
                resultNum.text = "result is: $resMulti"
            }
            private fun divideFun(res1: Int, res2: Int){
                val resDivide = res1 / res2
                resultNum.text = "result is: $resDivide"
            }


    }
