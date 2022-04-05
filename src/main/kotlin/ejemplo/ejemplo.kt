package ejemplo

import seccionocho.Persona


fun main(args: Array<String>) {
    val person = Persona("Alvaro", 21, 1.72, 65.0, "Cafes", "Hombre")
    println("El nombre es: " + person.GetNombre())
}