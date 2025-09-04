class Carro (
    marca: String,
    modelo: String,
    ano: Int,
    val numeroPortas: Int): Veiculo(marca, modelo, ano) {

    override fun exibirInformacoes() {
        super.exibirInformacoes()
        println("Número de portas: $numeroPortas\n ")
    }

    fun abrirPortaMalas(){
        if (velocidadeAtual < 1){
            println("A $marca, $modelo está com o porta-malas aberto! Cuidado!")
        } else {
            println("A $marca, $modelo precisa estar parado para abrir o porta malas")
        }
    }
}