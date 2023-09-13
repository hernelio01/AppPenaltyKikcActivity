package com.hernelio.apppenaltysactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.hernelio.apppenaltysactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var imagenes: ImageView
    lateinit var texto: TextView
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
        imagenes = binding.imageView
        texto = binding.textView3
        setContentView(binding.root)
    }

    fun aleatorio():String{
        val valor = (1..3).random()
        return when{

            valor ==1 ->"Izquierda"
            valor ==2 ->"Centro"
            valor ==3 ->"Derecha"
            else -> "cero"
        }

    }

    fun izquierda(view: View){
        var resultado = aleatorio()
        var izquierda = "Izquierda"

        imagenes.setImageResource(R.drawable.penal)
        if (resultado.equals(izquierda)){
            imagenes.setImageResource(R.drawable.izquierda)
            texto.setText("ATAJADO")
        }else{
            imagenes.setImageResource(R.drawable.gol)
            texto.setText("GOOOOOL¡")
        }


    }
    fun centro(view: View){
        var resultado = aleatorio()
        var Centro = "Centro"
        imagenes.setImageResource(R.drawable.penal)
        if (resultado.equals(Centro)){
            imagenes.setImageResource(R.drawable.centro)
            texto.setText("ATAJADO")
        }else{
            imagenes.setImageResource(R.drawable.gol)
            texto.setText("GOOOOOL¡")
        }


    }
    fun derecha(view: View){
        var resultado = aleatorio()
        var Derecha = "Derecha"
        imagenes.setImageResource(R.drawable.penal)
        if (resultado.equals(Derecha)){
            imagenes.setImageResource(R.drawable.derecha)
            texto.setText("ATAJADO")
        }else{
            imagenes.setImageResource(R.drawable.gol)
            texto.setText("GOOOOOL¡")
        }


    }
    fun reset(view: View){
        imagenes.setImageResource(R.drawable.penal)
        texto.setText("COBRAR PENAL")
    }

}