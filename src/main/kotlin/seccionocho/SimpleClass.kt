package seccionocho

class Persona(nombre: String, edad: Int, altura: Double, peso: Double, colorOjos: String, genero: String){

    var nombre: String? = null
    var edad: Int? = null
    var altura: Double? = null
    var peso: Double? = null
    var colorOjos: String? = null
    var genero: String? = null

    init {
        this.nombre = nombre
        this.edad = edad
        this.altura = altura
        this.peso = peso
        this.colorOjos = colorOjos
        this.genero = genero
    }

    fun GetNombre(): String? {
        return this.nombre
    }
}

fun main(args: Array<String>) {
    val person = Persona("Alvaro", 21, 1.72, 65.0, "Cafes", "Hombre")
    println("El nombre es: " + person.GetNombre())
}