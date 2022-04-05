package secciondos

fun main(args: Array<String>) {
    var num1 : Int = 5
    val num3 : Int = 10
    var strgnumero : String = "19"

    num1 = strgnumero.toInt()

    println(num1)

    var num2 : Float? = 12.5f

    num2 = num3.toFloat()
    println(num2)

    val doble : Double = num3.toDouble()

    strgnumero = doble.toString()
}