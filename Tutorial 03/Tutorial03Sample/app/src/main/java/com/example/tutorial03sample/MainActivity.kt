package com.example.tutorial03sample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.example.tutorial03sample.models.Calculator

lateinit var edtNumber1:EditText
lateinit var edtNumber2:EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtNumber1 = findViewById(R.id.edt_Number1)
        edtNumber2 = findViewById(R.id.edt_Number2)

    }

    fun buttonClick(v:View){
        var ans = 0.0
        val calculator = Calculator(
            edtNumber1.text.toString().toDouble(),
            edtNumber2.text.toString().toDouble())
        when(v.id){
            R.id.btn_Plus -> ans = calculator.add()
            R.id.btn_Minus -> ans = calculator.subtract()
            R.id.btn_Multiply -> ans = calculator.multiply()
            R.id.btn_Divide -> ans = calculator.divide()
        }
        println(ans)//this will print the output on the terminal

        val intent = Intent(this, DisplayActivity::class.java)
        intent.putExtra("answer", ans)
        startActivity(intent)
        finish()
    }
}