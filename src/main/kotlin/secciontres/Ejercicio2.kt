package secciontres

fun main(args: Array<String>) {
    println("Introduzca el primer numero")
    val num1 = readLine()!!.toInt()
    println("Introduzca el segundo numero")
    val num2 = readLine()!!.toInt()
    println("Introduzca el tercer numero")
    val num3 = readLine()!!.toInt()
    println("Introduzca el cuarto numero")
    val num4 = readLine()!!.toInt()

    val resultado1 = num1 + num2
    val resultado2 = num3 * num4

    println("El resultado de la suma de el primer numero y el segundo es: $resultado1")
    println("El resultado del producto del tercer numero y el cuarto es: $resultado2")

}