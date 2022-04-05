package seccioncinco

fun main(args:Array<String>) {

    for (elemento in 1..5) {
        println("El valor actual es: $elemento")

        if (elemento == 3) {
            println("Elemento encontrado")
        }
    }
}