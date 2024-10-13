package com.example.simulacioncrudtrue.Views

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.simulacioncrudtrue.Logic.Controller
import com.example.simulacioncrudtrue.Logic.Interfaces.OperationsInterfaces
import com.example.simulacioncrudtrue.R

class SecondActivity : AppCompatActivity(), OperationsInterfaces {

    private lateinit var buttonAddClient: Button
    private lateinit var buttonEditClient: Button
    private lateinit var buttonDeleteClient: Button
    private lateinit var buttonBackToMain: Button

    private lateinit var controller: Controller
    private lateinit var dialog: Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        controller = Controller()
        dialog = Dialog(controller)
        dialog.setListener(this)

        buttonAddClient = findViewById(R.id.button_add_client)
        buttonEditClient = findViewById(R.id.button_edit_client)
        buttonDeleteClient = findViewById(R.id.button_delete_client)
        buttonBackToMain = findViewById(R.id.botonMain)

        buttonAddClient.setOnClickListener {
            Log.d(TAG, "Botón de añadir cliente pulsado")
            dialog.show(0)
        }

        buttonEditClient.setOnClickListener {
            Log.d(TAG, "Botón de editar cliente pulsado")
            dialog.show(1)
        }

        buttonDeleteClient.setOnClickListener {
            Log.d(TAG, "Botón de eliminar cliente pulsado")
            dialog.show(2)
        }

        // Navegar de vuelta a MainActivity
        buttonBackToMain.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    companion object {
        const val TAG = "---SecondActivity---"
    }

    override fun ClientAdd(id: Int, name: String) {
        Log.d(TAG, "Cliente añadido: ID=$id, Nombre=$name")
    }

    override fun ClientDel(id: Int) {
        Log.d(TAG, "Cliente eliminado: ID=$id")
    }

    override fun ClientUpdate(id: Int, name: String) {
        Log.d(TAG, "Cliente actualizado: ID=$id, Nombre=$name")
    }
}
