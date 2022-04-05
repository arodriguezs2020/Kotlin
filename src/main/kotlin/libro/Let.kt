package libro

fun main() {

    print("Introduce tu nombre:")

    val beverage = readLine()
    beverage?.let {
        if (it.isNotBlank()) {
            it.capitalize()
        } else{
            "Buttered Ale"
        }
    }

    var beverage2 = readLine()
    beverage2 = null
    beverage2?.let {

        it.capitalize()
    } ?: println("Ha dado nulo")

    println(beverage)
    println(beverage2)
}