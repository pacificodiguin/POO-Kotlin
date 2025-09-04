class Moto(
    marca: String,
    modelo: String,
    ano: Int,
    val cilindradas: Int): Veiculo(marca, modelo, ano) {

    override fun exibirInformacoes() {
        super.exibirInformacoes()
        println("Cilindradas: $cilindradas cc\n")
    }
    fun empinar(){
        if (velocidadeAtual > 10){
            println("A $marca, $modelo está empinando! Cuidado!")
        } else {
            println("A $marca, $modelo precisa de mais velocidade para empinar")
        }
    }
}