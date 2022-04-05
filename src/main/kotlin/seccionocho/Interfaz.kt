package seccionocho

interface Operacion{

    fun sum(num1: Int, num2: Int): Int
    fun fiv(num1: Int, num2: Int)
    fun multiplicar(num1: Int, num2: Int) : Int {
        return num1 * num2
    }
}

abstract class Oper : Operacion{
    override fun sum(num1: Int, num2: Int): Int {
        return (num1 + num2) * 3
    }

    override fun fiv(num1: Int, num2: Int) {
        println("la división es: " + num1/num2)
    }

}

fun main(args: Array<String>) {
    /*var operacion = Oper()
    var miOperacion = operacion.multiplicar(5,7)

    println(miOperacion)*/

    // En una clase abstracta no se pueden definir instancias de ella
}