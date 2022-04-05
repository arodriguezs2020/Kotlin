package secciondos

fun main(args: Array<String>) {
    val name : String? // Se le pone para evitar un error por la llegada de un null
    name = "Seve"

    print(name!!) // Obliga a que llegue un valor
}