package com.lespsan543.ejercicio2pmdm

import android.widget.TextView
import android.widget.Toast

class Calculo  {
    var num1=""
    var num2=""
    var operacion = ""
    var pantalla = ""
    var resultado = 0.0

    fun pulsarNumero(textView: TextView, numero:String){
        num1+=numero
        pantalla +=numero
        textView.text = pantalla
    }

    fun pulsarSigno(textView: TextView,signo:String){
        if (operacion != "" && num1 != "" && num2 !=""){
            pulsarIgual(textView)
            operacion = signo
            pantalla += signo
        }else{
            operacion = signo
            pantalla += signo
            num2 = num1
            num1 = ""
        }
        textView.text = pantalla
    }

    fun pulsarIgual(textView: TextView){
        if (num1=="" && num2=="" && operacion=="" || num2=="" && operacion=="" || num2==""){
            val toast = Toast.makeText(MainActivity(),"Debe introducir 2 números y una operación", Toast.LENGTH_SHORT)
            toast.show()
        }else{
            when (operacion){
                "+" -> resultado = num2.toDouble()+num1.toDouble()
                "-" -> resultado = num2.toDouble()-num1.toDouble()
                "x" -> resultado = num2.toDouble()*num1.toDouble()
                "/" -> resultado = num2.toDouble()/num1.toDouble()
            }
            pantalla = resultado.toString()
            num2 = resultado.toString()
            num1 = ""
            textView.text = pantalla
        }
    }

    fun pulsarCE(textView: TextView){
        num2 = ""
        num1 = ""
        operacion = ""
        pantalla = ""
        resultado = 0.0
        textView.text = pantalla
    }
}