package com.example.simulacioncrudtrue.Views

import com.example.simulacioncrudtrue.Data.RepositoryClient
import com.example.simulacioncrudtrue.Logic.Controller
import com.example.simulacioncrudtrue.Logic.Interfaces.OperationsInterfaces

class Dialog (var controller: Controller){
    private var listener: OperationsInterfaces? = null

    private var action : Int = 0

    //Relacionamos los metods de nuestra interfaz con el dialogo
    fun setListener(_listener : OperationsInterfaces){
        listener = _listener
    }

    fun show(typeAction : Int){
        listener?.let{
            val posibleName = "CAMBIADO"
            val posibleId = controller.devIdRandom() // Nos da un id aleatorio

            when(typeAction){
                0-> onAccept()
                1->
                    if(posibleId != -1)
                        onEdit(posibleId, posibleName)
                2->
                    if(posibleId != -1)
                        onDelete(posibleId)
            }
        }
    }

    private fun onDelete(id: Int) {
    listener!!.ClientDel(id)
    }

    private fun onEdit(id: Int, name: String) {
        listener!!.ClientUpdate(id, name)
    }

    private fun onAccept() {
        listener!!.ClientAdd(RepositoryClient.incrementarId(), "NUEVO CLIENTE")
    }
}