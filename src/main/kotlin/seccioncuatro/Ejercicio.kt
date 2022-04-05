package seccioncuatro

fun main(args: Array<String>) {

    println("Introduce el primer número:")
    val num1 = readLine()!!.toInt()

    println("Introduce el segundo número:")
    val num2 = readLine()!!.toInt()

    if (num1 > num2){
        val suma = num1 + num2
        val resta = num1 - num2

        println("La suma de los dos números es: $suma")
        println("La resta de los dos números es: $resta")

    } else{
        val producto = num1 * num2
        val division = num1 / num2

        println("El producto de los dos números es: $producto")
        println("La división de los dos números es: $division")
    }

}