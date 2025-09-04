class Retangulo(cor: String, val largura: Double, val altura: Double): Figura(cor) {

    override fun calcularArea(): Double = largura * altura

    override fun descrever(): String =
        "${super.descrever()} | Altura: $altura | Largura: $largura | Área: %.2f".format(calcularArea())
}