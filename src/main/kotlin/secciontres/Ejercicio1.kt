package secciontres

fun main(args: Array<String>) {
    println("Ingrese cantidad de artículos")
    val cantidad = readLine()!!.toInt()
    println("Ingrese su costo unitario")
    val costo = readLine()!!.toInt()
    val resultado = costo * cantidad
    println("Total a pagar es: $resultado €")
}