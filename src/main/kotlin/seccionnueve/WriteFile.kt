package seccionnueve

import java.io.FileReader
import java.io.FileWriter

fun main(args: Array<String>) {
    println("Opcion 1 para leer\nOpcion 2 para escribir")
    val option = readLine()!!.toInt()
    when(option) {
        1 -> leerFile()
        2 -> {
            println("Escribe tu texto")
            val texto: String = readLine()!!.toString()
            writeFile(texto)
        }
    }
}

fun writeFile(texto: String) {
    try {
        val file = FileWriter("prueba.txt", true)
        file.write(texto + "\n")
        file.close()
        println("se ha guardado correctamente")
    } catch (ex: Exception)  {
        println(ex.message)
    }
}

fun leerFile() {
    try {
        val leer = FileReader("prueba.txt")
        var caracter: Int?
        do {
            caracter = leer.read()
            print(caracter.toChar())
        } while (caracter != -1)
    } catch (ex: Exception) {
        println(ex.message)
    }
}