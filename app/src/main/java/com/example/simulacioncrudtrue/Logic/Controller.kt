package com.example.simulacioncrudtrue.Logic

import com.example.simulacioncrudtrue.Data.RepositoryClient
import kotlin.random.Random

class Controller() {
    private var myListClient: MutableList<Client>

    init{
        myListClient = RepositoryClient.listClient.toMutableList()
    }
    //Le pasa un cliente y lo añade a la lista
    fun ClientAddController(cli: Client){
        myListClient.add(cli)
    }

    //Se le pasa un id y si coincide con alguno de la lista lo elimina
    fun ClientDelController(id: Int) : Boolean = myListClient.removeAll{it.id == id}

    // Se le pasa un ide y el nombre, si coincide se busca en la lista
    // Se le pasa el nombre modificado y cambiara el correspondiente al ID
    fun ClientEditController(id: Int, name: String): Boolean{
        val findClient: Client? = myListClient.find { it.id == id }
        //Devuelve si encuentra el cliente(puede ser nulo) si coincide retorna el cliente con el nuevo nombre
        //Si no devuelve un false
        return findClient?.let {
            it.name = name
            true
        } ?: false
    }

    //Muestra la lista entera en un string
    fun showData() = myListClient.toString()

    //Funcion en la cual el cliente nos pasa un id
    fun devClient (pos: Int) = myListClient.find { it.id == pos }

    //Nos pasa un id random si la lista esta vacia devuelve menos uno y si existe lo selecciona
    fun devIdRandom() : Int{
        return if (myListClient.size == 0){
            -1
        }else {
            val p = Random.nextInt(0, myListClient.size)
            myListClient[p].id
        }
    }
}