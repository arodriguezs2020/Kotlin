package seccionocho

class Externa{

    private val nombre: String? = null

    inner class Anidada{

        fun mostrar(){
            println(nombre)
        }
    }
}

// Añadiendo la palabra inner a la clase anidada podremos acceder a la variable privada

fun main(args: Array<String>) {
    var externa = Externa()
    /*var anidada = Externa.Anidada()
    anidada.mostrar()*/
}