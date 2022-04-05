package seccionsiete

fun main(args: Array<String>) {
    val resultado = sumar(3,9)
    println(resultado)

    val result = summa(5,8)
    println(result)

    val resulta = maximo(15,19)
    println(resulta)

    val resulta2 = maxx(20,150)
    println(resulta)
}

fun sumar(a: Int, b: Int) : Int {
    return a + b
}
// In line Function
fun summa(a: Int, b: Int) : Int = a + b

fun maximo(num1: Int, num2: Int) : Int {
    if (num1>num2)
        return num1
    else
        return num2
}

fun maxx(num: Int, num2: Int) : Int = if (num>num2) num else num2