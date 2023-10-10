package com.lespsan543.ejercicio2pmdm

import android.widget.TextView
import android.widget.Toast

class Calculo  {
    var num1=""
    var num2=""
    var operacion = ""
    var pantalla = ""
    var resultado = 0.0

    fun sumar(num1:Double, num2:Double){
        resultado = num1+num2
    }

    fun restar(num1:Double, num2:Double){
        resultado = num1-num2
    }

    fun multiplicar(num1:Double, num2:Double){
        resultado = num1*num2
    }

    fun dividir(num1:Double, num2:Double){
        resultado = num1/num2
    }

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
            MainActivity().mostrarToast()
        }else{
            when (operacion){
                "+" -> sumar(num1.toDouble(),num2.toDouble())
                "-" -> restar(num1.toDouble(),num2.toDouble())
                "x" -> multiplicar(num1.toDouble(),num2.toDouble())
                "/" -> dividir(num1.toDouble(),num2.toDouble())
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