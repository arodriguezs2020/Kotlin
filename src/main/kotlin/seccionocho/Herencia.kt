package seccionocho

open class Humano(){

    protected var palabra : String? = null

    fun saludo(){
        println("Hola a todos")
    }
}

class Perro() : Humano(){
    fun ladrido(){
        println("Guaauu, guaaaff")
    }

    fun getPalabra(){
        super.palabra
    }
}

class Gato(){
    fun maullido(){
        println("Miiiiaaaaaaauuu")
    }
}

fun main(args: Array<String>) {

    val persona = Humano()
    var juanito = persona.saludo()

    val perrito = Perro()
    var coco = perrito.saludo()

}