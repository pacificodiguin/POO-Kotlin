class Carro (
    marca: String,
    modelo: String,
    ano: Int,
    val numeroPortas: Int): Veiculo(marca, modelo, ano) {

    override fun exibirInformacoes() {
        super.exibirInformacoes()
        println("Número de portas: $numeroPortas\n")
    }

    fun abrirPortaMalas(){
        println("Porta-Malas do $modelo aberto\n")
    }
}