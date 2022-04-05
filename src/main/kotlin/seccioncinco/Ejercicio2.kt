package seccioncinco

fun main(args: Array<String>) {

    var contadorPares : Int = 0
    var contadorImpares : Int = 0


    for (numero in 1..200){
        if (numero % 2 == 0) {
            println("El número $numero es par")
            contadorPares++
        } else{
            println("El número $numero es impar")
            contadorImpares++
        }
    }

    println("------------------------------------")
    println("El numero completo de numeros pares es: $contadorPares")
    println("El numero completo de numeros impares es: $contadorImpares")
}