package com.lespsan543.ejercicio2pmdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var textoCalcular : TextView
    lateinit var boton1 : Button
    lateinit var boton2 : Button
    lateinit var boton3 : Button
    lateinit var boton4 : Button
    lateinit var boton5 : Button
    lateinit var boton6 : Button
    lateinit var boton7 : Button
    lateinit var boton8 : Button
    lateinit var boton9 : Button
    lateinit var boton0 : Button
    lateinit var botonSumar : Button
    lateinit var botonRestar : Button
    lateinit var botonDividir : Button
    lateinit var botonMultiplicar : Button
    lateinit var botonIgual : Button
    lateinit var botonCE : Button

    var numeroActual=""
    var numeroAnterior=""
    var operacion = ""
    var pantalla = ""
    var total = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inicializarComponentes()

        inicializarListeners()
    }

    fun inicializarComponentes(){
        textoCalcular = findViewById(R.id.mostrarCalculos)
        boton1 = findViewById(R.id.boton1)
        boton2 = findViewById(R.id.boton2)
        boton3 = findViewById(R.id.boton3)
        boton4 = findViewById(R.id.boton4)
        boton5 = findViewById(R.id.boton5)
        boton6 = findViewById(R.id.boton6)
        boton7 = findViewById(R.id.boton7)
        boton8 = findViewById(R.id.boton8)
        boton9 = findViewById(R.id.boton9)
        boton0 = findViewById(R.id.boton0)
        botonSumar = findViewById(R.id.botonSumar)
        botonRestar = findViewById(R.id.botonRestar)
        botonMultiplicar = findViewById(R.id.botonmultiplicar)
        botonDividir = findViewById(R.id.botonDividir)
        botonIgual = findViewById(R.id.botonIgual)
        botonCE = findViewById(R.id.botonCE)
    }

    fun inicializarListeners(){
        boton1.setOnClickListener { pulsar1() }
        boton2.setOnClickListener { pulsar2() }
        boton3.setOnClickListener { pulsar3() }
        boton4.setOnClickListener { pulsar4() }
        boton5.setOnClickListener { pulsar5() }
        boton6.setOnClickListener { pulsar6() }
        boton7.setOnClickListener { pulsar7() }
        boton8.setOnClickListener { pulsar8() }
        boton9.setOnClickListener { pulsar9() }
        boton0.setOnClickListener { pulsar0() }
        botonSumar.setOnClickListener { pulsarSuma() }
        botonRestar.setOnClickListener { pulsarResta() }
        botonMultiplicar.setOnClickListener { pulsarMultiplicacion() }
        botonDividir.setOnClickListener { pulsarDivision() }
        botonIgual.setOnClickListener { pulsarIgual() }
        botonCE.setOnClickListener { pulsarCE() }
    }

    fun pulsar1(){
        numeroActual+="1"
        pantalla +="1"
        textoCalcular.text = pantalla
    }

    fun pulsar2(){
        numeroActual+="2"
        pantalla += "2"
        textoCalcular.text = pantalla
    }

    fun pulsar3(){
        numeroActual+="3"
        pantalla += "3"
        textoCalcular.text = pantalla
    }

    fun pulsar4(){
        numeroActual+="4"
        pantalla += "4"
        textoCalcular.text = pantalla
    }

    fun pulsar5(){
        numeroActual+="5"
        pantalla += "5"
        textoCalcular.text = pantalla
    }

    fun pulsar6(){
        numeroActual+="6"
        pantalla += "6"
        textoCalcular.text = pantalla
    }

    fun pulsar7(){
        numeroActual+="7"
        pantalla += "7"
        textoCalcular.text = pantalla
    }

    fun pulsar8(){
        numeroActual+="8"
        pantalla += "8"
        textoCalcular.text = pantalla
    }

    fun pulsar9(){
        numeroActual+="9"
        pantalla += "9"
        textoCalcular.text = pantalla
    }

    fun pulsar0(){
        numeroActual+="0"
        pantalla += "0"
        textoCalcular.text = pantalla
    }

    fun pulsarSuma(){
        operacion = "+"
        pantalla += "+"
        numeroAnterior = numeroActual
        numeroActual = ""
        textoCalcular.text = pantalla
    }

    fun pulsarResta(){
        operacion = "-"
        pantalla += "-"
        numeroAnterior = numeroActual
        numeroActual = ""
        textoCalcular.text = pantalla
    }

    fun pulsarMultiplicacion(){
        operacion = "x"
        pantalla += "x"
        numeroAnterior = numeroActual
        numeroActual = ""
        textoCalcular.text = pantalla
    }

    fun pulsarDivision(){
        operacion = "/"
        pantalla += "÷"
        numeroAnterior = numeroActual
        numeroActual = ""
        textoCalcular.text = pantalla
    }

    fun pulsarIgual(){
        when (operacion){
            "+" -> total = numeroAnterior.toDouble()+numeroActual.toDouble()
            "-" -> total = numeroAnterior.toDouble()-numeroActual.toDouble()
            "x" -> total = numeroAnterior.toDouble()*numeroActual.toDouble()
            "/" -> total = numeroAnterior.toDouble()/numeroActual.toDouble()
        }
        pantalla = total.toString()
        numeroActual = total.toString()
        textoCalcular.text = pantalla
    }

    fun pulsarCE(){
        numeroAnterior = ""
        numeroActual = ""
        operacion = ""
        pantalla = ""
        total = 0.0
        textoCalcular.text = pantalla
    }
}