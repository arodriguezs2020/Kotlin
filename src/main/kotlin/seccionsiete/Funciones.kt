package seccionsiete

fun suma(num1: Int, num2 : Int) : Int {
    val suma = num1 + num2
    return suma
}

fun sinParametro() : Unit {
    println("Hola, soy un método sin parámetros")
}

fun main(args: Array<String>) {
    val resultado = suma(1,5)

    println(resultado)
    sinParametro()
}