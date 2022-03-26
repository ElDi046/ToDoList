package edu.tec.challenge.data

import java.text.SimpleDateFormat
import java.util.*

object TareaProvider {
    val timeStamp: String = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
    fun getData():List<Tarea>{
        return listOf(Tarea("Terminar tarea","Terminar tarea de Android","10", timeStamp),
            Tarea("Estudiar","Estudiar para examen de criptología","9",timeStamp),
            Tarea("Salud","Comprar cubrebocas","8",timeStamp),
            Tarea("Laboratorio 3","Terminar laboratorio de criptología","9",timeStamp),
            Tarea("Mandado","Comprar comida y comida para fiesta","5",timeStamp),
            Tarea("Comprar mascota","Comprar comida para el pez","5",timeStamp),
            Tarea("Venta","Anunciar venta de teclado","4",timeStamp),
            Tarea("Venta","Aunciar venta de teclado","3",timeStamp),
            Tarea("Arreglo","Mandar arreglar control de televisión","2",timeStamp))

    }
}