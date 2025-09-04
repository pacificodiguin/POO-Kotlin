import kotlin.math.PI

class Circulo(cor: String, val raio: Double): Figura(cor) {

    override fun calcularArea(): Double = PI * raio * raio

    override fun descrever(): String =
        "${super.descrever()} | Raio: $raio| Área: %.2f".format(calcularArea())

}
