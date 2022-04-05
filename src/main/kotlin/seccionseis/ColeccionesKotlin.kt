package seccionseis

fun main(args: Array<String>) {

    val hasMap = hashMapOf(1 to "Seve", 2 to "Alondra")
    hasMap.put(50, "alo")
    println(hasMap[50])

    val letras = arrayOf("a", "b", "c")
    println(letras[1])

    letras[1] = "z"

    val nums = listOf(0, 1, 2, -12, -24)

    for (elemento in nums) {
        println(elemento)
    }

    /*

    Los arrayOf son mutables: son tanto de lectura como de escritura, se pueden modificar los datos
    Los listOf son immutables: son solo de lectura, no permite modificar ningún dato

     */

}