package seccionnueve

fun main(args: Array<String>) {

    try {
        println("Introduce un numero")
        val num1 = readLine()!!.toInt()
        val division = 50 / num1
        println("La division es $division")
    } catch (e: Exception) {
        println("No se pueden hacer divisiones entre 0")
    }

    println("Aplicación finalizada")
}