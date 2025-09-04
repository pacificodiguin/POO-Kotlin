class Caminhao(
    marca: String,
    modelo: String,
    ano: Int,
    val capacidadeCarga: Double // atributo somente da Classe Caminhão
) : Veiculo(marca, modelo, ano) {

    override fun exibirDetalhes() {
        super.exibirDetalhes()
        println("Capacidade de carga: $capacidadeCarga toneladas")
    }

    override fun exibirDetalhes(mostrarAno: Boolean) {
        super.exibirDetalhes(mostrarAno)
        println("Capacidade de carga: $capacidadeCarga toneladas")
    }
}


