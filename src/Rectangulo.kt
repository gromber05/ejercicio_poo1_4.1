

class Rectangulo(val base: Int, val altura: Int) {

    constructor(base: Int) : this(base, base)

    init {
        require((base > 0) and (altura > 0)) { "El valor introducido debe ser mayor que cero" }
    }

    fun calcularPerimetro(): Int {
        return ((base + altura) * 2)
    }

    fun calcularArea(): Int {
        return (base * altura)
    }

    override fun toString(): String {
        return "Base = ${this.base}cm, Altura = ${this.altura}cm || Perimetro = ${this.calcularPerimetro()}, Área = ${this.calcularArea()}"
    }
}
