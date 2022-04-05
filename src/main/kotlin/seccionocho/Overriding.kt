package seccionocho

open class Human(){

    var palabra : String? = null

    open fun saludo(){
        println("Hola a todos")
    }
}

class Perr() : Human(){

    override fun saludo(){
        println("Soy un Perro, Hola a todos")
    }

    fun ladrido(){
        println("Guaauu, guaaaff")
    }
}

fun main(args: Array<String>) {

    val persona = Human()
    var juanito = persona.saludo()

    val perrito = Perr()
    var coco = perrito.saludo()

}