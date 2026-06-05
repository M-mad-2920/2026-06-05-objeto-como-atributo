package org.example.app

class Persona(private var nombre: String, private var apellido: String, private var fecha: Fecha) {
    fun inicializar(nombre: String,apellido: String) {
        this.nombre = nombre
        this.apellido = apellido
    }
    override fun toString(): String {
        return "Persona(nombre='$nombre', apellido='$apellido', fecha='$fecha')"
    }
}