package seccioncuatro

fun main(args: Array<String>) {

    println(8 > 15)
    println(5 == 5)
    println(5 != 5)
    println(2 > 3 && 5 < 20)
    println(2 > 3 || 5 < 20)

    val num = 50

    println(num >= 0 && num <= 50) // and

    println(num > 100 || num < 60) // or

    val num2 : Boolean = true
    println(!num2)
}