package secciondos

fun main(args: Array<String>) {
    println("introduce el valor del lado:")
    val numero = readLine()!!.toInt()

    val perimetro = numero * 4

    println("El valor del perímetro es $perimetro")
}