class JogadorDeFutebol(
    private var nome: String,
    private var posicao: String,
    private var anoNascimento: Int,
    private var nacionalidade: String,
    private var altura: Double,
    private var peso: Double
) {

    fun imprimeDados() {
        println("Nome: $nome")
        println("Posição: $posicao")
        println("Ano de nascimento: $anoNascimento")
        println("Nacionalidade: $nacionalidade")
        println("Altura: $altura m")
        println("Peso: $peso kg")
    }

    private fun calculaIdade(): Int {
        val anoAtual = 2025
        return anoAtual - anoNascimento
    }

    fun mostrarIdade() {
        println("Idade: ${calculaIdade()} anos")
    }

    fun calculaAposentadoria() {
        val idadeAtual = calculaIdade()
        val idadeAposentadoria = when (posicao) {
            "defesa" -> 40
            "meio-campo" -> 38
            "atacante" -> 35
            else -> {
                println("Posição inválida. Use: defesa, meio-campo ou atacante.")
                return
            }
        }

        val anosFaltando = idadeAposentadoria - idadeAtual
        if (anosFaltando > 0) {
            println("Faltam $anosFaltando anos para se aposentar.")
        } else {
            println("O jogador já pode se aposentar.")
        }
    }
}