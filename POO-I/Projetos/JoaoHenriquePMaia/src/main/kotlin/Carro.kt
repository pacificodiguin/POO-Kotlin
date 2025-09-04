class Carro(
    marca: String,
    modelo: String,
    ano: Int,
    val capacidadePassageiros: Int // atributo somente da Classe Carro
) : Veiculo(marca, modelo, ano) {

    override fun exibirDetalhes() {
        super.exibirDetalhes()
        println("Capacidade de passageiros: $capacidadePassageiros")
    }

    override fun exibirDetalhes(mostrarAno: Boolean) {
        super.exibirDetalhes(mostrarAno)
        println("Capacidade de passageiros: $capacidadePassageiros")
    }
}


