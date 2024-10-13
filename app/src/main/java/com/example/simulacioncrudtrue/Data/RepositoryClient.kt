package com.example.simulacioncrudtrue.Data

import com.example.simulacioncrudtrue.Logic.Client

class RepositoryClient {
    companion object{
        var primary = 100

        //Esto siempre se cargara al iniciar la aplicacion
        val listClient : List<Client> = listOf (
            Client(incrementarId(), "Tony"),
            Client(incrementarId(), "Beatriz"),
            Client(incrementarId(), "Alba"),
            Client(incrementarId(), "Maria")
        )

        fun incrementarId() = primary++ //Metodo que al llamarlo inrementa el id
    }
}