package seccioncinco

fun main(args: Array<String>) {
    println("Multiplos de 8");
    for (elemento in 1..400){
        if (elemento % 8 == 0){
            println(elemento)
        }
    }
}