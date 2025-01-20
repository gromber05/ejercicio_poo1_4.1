
class Rectangulo(val base: Int, val altura: Int) {

    constructor(base: Int) : this(base, 0)

    init {
        require((base > 0) and (altura > 0)) { "El valor introducido debe ser mayor que cero" }
    }

    override fun toString(): String {
        return "Base = ${this.base}, Altura = ${this.altura}"
    }

    fun calcularPerimetro(): Int {
        return ((base + altura) * 2)
    }

    fun calcularArea(): Int {
        return (base * altura)
    }
}

fun main() {

    val rectangulos = mutableListOf<Rectangulo>()

    val rectangulo1 = Rectangulo(1, 1)

    println(rectangulo1.calcularArea())
    println(rectangulo1.calcularPerimetro())
}