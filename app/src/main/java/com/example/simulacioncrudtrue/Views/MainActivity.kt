package com.example.simulacioncrudtrue.Views

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.simulacioncrudtrue.Data.RepositoryClient
import com.example.simulacioncrudtrue.Logic.Interfaces.OperationsInterfaces
import com.example.simulacioncrudtrue.R

class MainActivity : AppCompatActivity(), OperationsInterfaces {
    //Creamos los botones diciendo el tipo que hemos puesto en el diseño
    private lateinit var myButtonAdd: ImageView
    private lateinit var myButtonEdit: ImageView
    private lateinit var myButtonDelete: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge() //Permite poner la pantalla en modo pantalla completa
        setContentView(R.layout.activity_main)
        //ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
        // val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
        //v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
        //insets

        Log.d(TAG, "Esto es un ejemplo del Log")
        start()
    }

    private fun start() {
        //Funcion de cuando empieza la aplicacion debe encontrar los botones que hemos creado
        myButtonAdd = findViewById(R.id.iv_add)
        myButtonEdit = findViewById(R.id.iv_edit)
        myButtonDelete = findViewById(R.id.iv_del)

        //Funciones con lambda para que al pulsar esos botones tengan una funcion
        myButtonAdd.setOnClickListener{ //Se ponen llaves para directamente hacerles la logica
            Log.d(TAG, "He pulsado el boton MAS")
        }
        myButtonEdit.setOnClickListener{
            Log.d(TAG, "He pulsado el boton EDITAR")
        }
        myButtonDelete.setOnClickListener{
            Log.d(TAG, "He pulsado el boton BORRAR")
        }
    }

    companion object{
        const val TAG = "---SALIDA---"
    }

    //Importamos los metodos de la interfaz que hemos implementado en la clase
    override fun ClientAdd(id: Int, name: String) {
        TODO("Not yet implemented")
    }

    override fun ClientDel(id: Int) {
        TODO("Not yet implemented")
    }

    override fun ClientUpdate(id: Int, name: String) {
        TODO("Not yet implemented")
    }
}