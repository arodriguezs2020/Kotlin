package secciondos

fun main(args: Array<String>) {

    println("¿Cuál es tu nombre?")
    val nombre = readLine()

    println("Buenos dias " + nombre)

    println("¿Cuál es tu edad?")
    val edad : Int = readLine()?.toInt() ?: -1
    val edad2 : Int = readLine()!!.toInt()
    println(edad)

}