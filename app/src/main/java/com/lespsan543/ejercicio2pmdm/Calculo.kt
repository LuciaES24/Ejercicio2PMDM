package com.lespsan543.ejercicio2pmdm

import android.widget.TextView

class Calculo  {
    /**
     * @param num1 string que guarda el número actual que se está tecleando y guardará el
     * segundo número que se vaya a introducir
     * @param num2 string que guarda el número una vez se ha pulsado un operador
     * @param operacion string que guarda el último operador que se seleccione
     * @param pantalla string que guarda la cadena completa de los botones que se cliqueen
     * @param resultado double que guardará el resultado total de la operación
     */
    var num1=""
    var num2=""
    var operacion = ""
    var pantalla = ""
    var resultado = 0.0

    /**
     * Función para realizar la suma
     */
    fun sumar(num1:Double, num2:Double){
        resultado = num2+num1
    }

    /**
     * Función para realizar la resta
     */
    fun restar(num1:Double, num2:Double){
        resultado = num2-num1
    }

    /**
     * Función para realizar la multiplicación
     */
    fun multiplicar(num1:Double, num2:Double){
        resultado = num2*num1
    }

    /**
     * Función para realizar la división
     */
    fun dividir(num1:Double, num2:Double){
        resultado = num2/num1
    }

    /**
     * Función que guardará el número seleccionado cada vez que se pulse
     */
    fun pulsarNumero(textView: TextView, numero:String){
        num1+=numero
        pantalla +=numero
        textView.text = pantalla
    }

    /**
     * Función que se llevará a cabo cuando se pulse algún signo (+,-,/,x)
     */
    fun pulsarSigno(textView: TextView,signo:String){
        //Si ya se han introducido los 2 números y la operación y se pulsa otra trás el segundo número
        //se muestra el resultado y la nueva operación a la espera de introducir otro número
        if (operacion != "" && num1 != "" && num2 !=""){
            operar(textView)
            operacion = signo
            pantalla += signo
        }//Si se pulsa una operación seguida de otra, sesustituirá la primera por la nueva introducida
        else if (operacion!="" && num2 !=""){
            pantalla = pantalla.substring(0,pantalla.length-1)
            operacion = signo
            pantalla += operacion
        }//Si se introduce correctamente se guardará la operación con normalidad
        else{
            operacion = signo
            pantalla += signo
            num2 = num1
            num1 = ""
        }
        textView.text = pantalla
    }

    /**
     * Función que realizará los cálculos según la operación que se haya seleccionado
     */
    fun operar(textView: TextView){
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

    /**
     * Función para el botón CE que reiniciará todos los valores
     */
    fun pulsarCE(textView: TextView){
        num2 = ""
        num1 = ""
        operacion = ""
        pantalla = ""
        resultado = 0.0
        textView.text = pantalla
    }
}