

fun main() {

    val rectangulo1 = Rectangulo(1, 1)

    println(rectangulo1.calcularArea())
    println(rectangulo1.calcularPerimetro())

    val rectangulo2 = Rectangulo(5, 6)

    println(rectangulo2.calcularArea())
    println(rectangulo2.calcularPerimetro())

    val rectangulo3 = Rectangulo(10, 15)

    println(rectangulo3.calcularArea())
    println(rectangulo3.calcularPerimetro())

    val rectangulo4 = Rectangulo(10)

    println(rectangulo4.calcularArea())
    println(rectangulo4.calcularPerimetro())
}