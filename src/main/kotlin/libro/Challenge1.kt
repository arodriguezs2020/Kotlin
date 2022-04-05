package libro

fun main(args: Array<String>) {
    // Puede adquirir un dragón o un minotauro, los cuales pueden montar
    var hasSteed = 0
    var heroe = "Estragon"
    var nombrePub = "Cuerno del Unicornio"
    var nombreTab = "Estevan"
    var menu = ArrayList<String>()

    menu.add("hidromiel")
    menu.add("vino")
    menu.add("LaCroix")

    println("Buenas caballero. En que le podría ayudar")
    println("¿Necesitas estabilizar un corcel?")
    println("1. Si, gracias!")
    println("2. No, gracias!")
    hasSteed = readLine()?.toInt() ?: -1
    println("Genial! Tengo un dragón y un minotauro ¿Cual quieres?")
    println("1. Dragón")
    println("2. Minotauro")
    var corcel = readLine()?.toInt() ?: -1
    println("¡Excelente! ¿De cuanto oro dispones?")
    var oro : Int = readLine()?.toInt() ?: -1
    println("¡Perfecto! Serán 20 de oro")
    oro -= 20
    println("¿Quieres tomar algo?")
    readLine()
    println("¡Excelente!. Tengo ${menu.toString()} ¿Qué vas a querer?")
    println("1. Hidromiel")
    println("2. Vino")
    println("3. LaCroix")
    var tomar = readLine()?.toInt() ?: -1
    println("Vale. Serán 2 piezas de oro")
    println("Vale. Muchas gracias!")
    oro -= 2

    println("$heroe termina con $oro de oro. A tomado ${menu[tomar - 1]}")
    if (hasSteed == 1){
        when (corcel) {
            1 -> {
                println("$heroe ha elegido como corcel un dragón")
            }
            2 -> {
                println("$heroe ha elegido como corcel un minotauro")
            }
            else -> {
                println("El corcel elegido no corresponde con dragon ni con un minotauro")
            }
        }
    } else{
        println("$heroe no ha elegido ningún corcel")
    }
}