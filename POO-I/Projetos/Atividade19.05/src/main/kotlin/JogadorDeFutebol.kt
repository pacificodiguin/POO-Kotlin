import java.time.LocalDate

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
        val anoAtual = LocalDate.now().year
        return anoAtual - anoNascimento
    }

    fun mostrarIdade() {
        println("Idade: ${calculaIdade()} anos")
    }

    fun calculaAposentadoria() {
        val idadeAtual = calculaIdade()
        val idadeAposentadoria = when (posicao.lowercase()) {
            "defesa" -> 40
            "meio-campo", "meio campo", "meio" -> 38
            "atacante" -> 35
            else -> {
                println("Posição desconhecida para cálculo de aposentadoria.")
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
