package com.example.simulacioncrudtrue.Logic.Interfaces

interface OperationsInterfaces {
    fun ClientAdd(id : Int, name : String)
    fun ClientDel(id : Int)
    fun ClientUpdate(id : Int, name : String)
}