package com.lespsan543.ejercicio2pmdm

import android.widget.TextView

class Calculo  {
    var num1=""
    var num2=""
    var operacion = ""
    var pantalla = ""
    var resultado = 0.0

    fun pulsar1(textView: TextView){
        num1+="1"
        pantalla +="1"
        textView.text = pantalla
    }

    fun pulsar2(textView: TextView){
        num1+="2"
        pantalla += "2"
        textView.text = pantalla
    }

    fun pulsar3(textView: TextView){
        num1+="3"
        pantalla += "3"
        textView.text = pantalla
    }

    fun pulsar4(textView: TextView){
        num1+="4"
        pantalla += "4"
        textView.text = pantalla
    }

    fun pulsar5(textView: TextView){
        num1+="5"
        pantalla += "5"
        textView.text = pantalla
    }

    fun pulsar6(textView: TextView){
        num1+="6"
        pantalla += "6"
        textView.text = pantalla
    }

    fun pulsar7(textView: TextView){
        num1+="7"
        pantalla += "7"
        textView.text = pantalla
    }

    fun pulsar8(textView: TextView){
        num1+="8"
        pantalla += "8"
        textView.text = pantalla
    }

    fun pulsar9(textView: TextView){
        num1+="9"
        pantalla += "9"
        textView.text = pantalla
    }

    fun pulsar0(textView: TextView){
        num1+="0"
        pantalla += "0"
        textView.text = pantalla
    }

    fun pulsarSuma(textView: TextView){
        if (operacion != "" && num1 != "" && num2 !=""){
            pulsarIgual(textView)
            operacion = "+"
            pantalla += "+"
        }else{
            operacion = "+"
            pantalla += "+"
            num2 = num1
            num1 = ""
        }
        textView.text = pantalla
    }

    fun pulsarResta(textView: TextView){
        if (operacion != "" && num1 != "" && num2 !=""){
            pulsarIgual(textView)
            operacion = "-"
            pantalla += "-"
        }else{
            operacion = "-"
            pantalla += "-"
            num2 = num1
            num1 = ""
        }
        textView.text = pantalla
    }

    fun pulsarMultiplicacion(textView: TextView){
        if (operacion != "" && num1 != "" && num2 !=""){
            pulsarIgual(textView)
            operacion = "x"
            pantalla += "x"
        }else{
            operacion = "x"
            pantalla += "x"
            num2 = num1
            num1 = ""
        }
        textView.text = pantalla
    }

    fun pulsarDivision(textView: TextView){
        if (operacion != "" && num1 != "" && num2 !=""){
            pulsarIgual(textView)
            operacion = "/"
            pantalla += "÷"
        }else{
            operacion = "/"
            pantalla += "÷"
            num2 = num1
            num1 = ""
        }
        textView.text = pantalla
    }

    fun pulsarIgual(textView: TextView){
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

    fun pulsarCE(textView: TextView){
        num2 = ""
        num1 = ""
        operacion = ""
        pantalla = ""
        resultado = 0.0
        textView.text = pantalla
    }
}