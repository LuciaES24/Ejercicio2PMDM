package com.lespsan543.ejercicio2pmdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

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

    var calculo = Calculo()

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
        boton1.setOnClickListener { calculo.pulsar1(textoCalcular) }
        boton2.setOnClickListener { calculo.pulsar2(textoCalcular) }
        boton3.setOnClickListener { calculo.pulsar3(textoCalcular) }
        boton4.setOnClickListener { calculo.pulsar4(textoCalcular) }
        boton5.setOnClickListener { calculo.pulsar5(textoCalcular) }
        boton6.setOnClickListener { calculo.pulsar6(textoCalcular) }
        boton7.setOnClickListener { calculo.pulsar7(textoCalcular) }
        boton8.setOnClickListener { calculo.pulsar8(textoCalcular) }
        boton9.setOnClickListener { calculo.pulsar9(textoCalcular) }
        boton0.setOnClickListener { calculo.pulsar0(textoCalcular) }
        botonSumar.setOnClickListener { calculo.pulsarSuma(textoCalcular) }
        botonRestar.setOnClickListener { calculo.pulsarResta(textoCalcular) }
        botonMultiplicar.setOnClickListener { calculo.pulsarMultiplicacion(textoCalcular) }
        botonDividir.setOnClickListener { calculo.pulsarDivision(textoCalcular) }
        botonIgual.setOnClickListener { calculo.pulsarIgual(textoCalcular) }
        botonCE.setOnClickListener { calculo.pulsarCE(textoCalcular) }
    }

}