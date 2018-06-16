package com.example.anthony.primeiroaplicativoemkotlin

/*
 @author Anthony José
 @location Francisco Morato - SP
 @date 16/06/2018
*/

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.anthony.primeiroaplicativoemkotlin.R.id.button

class atividadePrincipal : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_atividade_principal)

        val button = findViewById<Button>(R.id.button)

        val valorText = View.OnClickListener {
            //implementa a TextView
            val ShowCountVal = findViewById<TextView>(R.id.textView)

            //obtem o valor da TextView
            val textVal = ShowCountVal.text.toString()

            //converte o valor em Inteiro e soma 1 com ele mesmo a cada evento
            var count: Int = Integer.parseInt(textVal)
            count++

            //TextView obtem o valor convertido e imprime na tela
            ShowCountVal.text = count.toString()
        }
        //define um evento no button
        button.setOnClickListener(valorText)
    }


}
