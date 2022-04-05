package seccionocho

enum class Meses{

    ENE, FEB, MAR, ABR, MAY, JUN, JUL, AGO, SEP, OCT, NOV, DIC

}

fun main(args: Array<String>) {

    val sextoMes = Meses.JUL
    val primerMes = Meses.ENE

    println("Nombre: " + sextoMes.name)
    println("Posición: " + sextoMes.ordinal)
    println("Posición: " + primerMes.ordinal)
    println("Comparar: " + sextoMes.compareTo(primerMes))
    println("Posición: " + primerMes.compareTo(sextoMes))

    println("-------------------------------")
    println("Inicia For")

    for (item in Meses.values()){
        println(item)
    }

}