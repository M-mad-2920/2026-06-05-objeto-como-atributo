package org.example.app

class Fecha(private var ano: Int, private var mes: Int, private var dia: Int) {
    fun inicializar(ano: Int, mes: Int, dia: Int) {
        this.ano = ano
        this.mes = mes
        this.dia = dia
    }
    override fun toString(): String {
        return "Fecha(año='$ano', mes='$mes', día='$dia')"
    }
}