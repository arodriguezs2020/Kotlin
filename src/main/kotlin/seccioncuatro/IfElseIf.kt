package seccioncuatro

fun main(args: Array<String>) {

    print("¿Qué calificación obtuvo en variables?")
    val calivariables : Int = readLine()!!.toInt()

    print("¿Qué calificación obtuvo en operacionesMatematicas?")
    val caliOperacionMatematica : Int = readLine()!!.toInt()

    print("¿Qué calificación obtuvo en operacionesLogicos?")
    val caliOperadorLogicos : Int = readLine()!!.toInt()

    print("¿Qué calificación obtuvo en condiciones?")
    val caliCondiciones : Int = readLine()!!.toInt()

    val promedio = (calivariables + caliOperacionMatematica + caliOperadorLogicos + caliCondiciones) / 4

    if (promedio == 10) {
        println("Tu resultado es sobresaliente, Felicidades!!! Tu calificación es $promedio")
    } else if (promedio == 9) {
        println("Tu resultado es bueno. Tu calificación es $promedio")
    }else {
        val t = (6..8)
        if (t.first <= promedio && promedio <= t.last) {
            println("Tu resultado es suficiente. Tu calificación es $promedio")
        } else {
            println("Tu resultado es insuficiente. Tu calificación es $promedio")
        }
    }
}