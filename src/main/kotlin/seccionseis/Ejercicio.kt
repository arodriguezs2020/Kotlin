package seccionseis

fun main(args: Array<String>) {

    val array1 = ArrayList<Int>()
    val array2 = ArrayList<Int>()
    val array3 = ArrayList<Int>()

    println("Carga valor del primer array:")
    val numero : String = readLine().toString()
    println("Carga valor del segundo array:")
    val numero2 : String = readLine().toString()

    for (indice in numero.indices){
        val num = numero[indice].digitToInt()
        val num2 = numero2[indice].digitToInt()
        val suma = num + num2
        array1.add(num)
        array2.add(num2)
        array3.add(suma)
    }

    println(array3)
}