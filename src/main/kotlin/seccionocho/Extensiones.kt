package seccionocho

fun ArrayList<String>.intercambiar(indice1: Int, indice2: Int){

    val temporal = this.get(indice1)
    this.set(indice1, this.get(indice2))
    this.set(indice2, temporal)

}

fun main(args: Array<String>){

    val arrayList = ArrayList<String>()

    arrayList.add("Seve")
    arrayList.add("Alo")
    arrayList.add("Dian")
    println(arrayList)

    arrayList.intercambiar(0,1)
    println(arrayList)

}