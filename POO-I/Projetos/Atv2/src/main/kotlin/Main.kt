import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)
    var jogador: JogadorDeFutebol? = null

    while (true) {
        println("""
        ------------------------------------------------------    
        |                     MENU                           |
        |  [1] - Criar objeto jogador                        | 
        |  [2] - Imprimir dados do jogador                   |
        |  [3] - Calcular e mostrar idade do jogador         | 
        |  [4] - Calcular e mostrar tempo para aposentadoria |
        |  [5] - Sair                                        |
        ------------------------------------------------------
        Escolha uma opção:    
        """.trimIndent())

        when (scanner.nextLine().trim()) {
            "1" -> {
                print("Nome: ")
                val nome = scanner.nextLine()

                print("Posição (defesa, meio-campo, atacante): ")
                val posicao = scanner.nextLine()

                print("Ano de nascimento: ")
                val ano = scanner.nextLine().toInt()
                if (ano > 2025) {
                    println("Ano inválido. Deve ser menor ou igual a 2025.")
                    continue
                }

                val idade = 2025 - ano
                if (idade > 100) {
                    println("Esse jogador já morreu, provavelmente...")
                    continue
                } else if (idade > 50) {
                    println("O jogador já está aposentado.")
                    continue
                }

                print("Nacionalidade: ")
                val nacionalidade = scanner.nextLine()

                print("Altura (m): ")
                val altura = scanner.nextLine().toDouble()

                print("Peso (kg): ")
                val peso = scanner.nextLine().toDouble()

                jogador = JogadorDeFutebol(nome, posicao, ano, nacionalidade, altura, peso)
                println("Jogador criado com sucesso!")
            }

            "2" -> jogador?.imprimeDados() ?: println("Crie um jogador primeiro.")
            "3" -> jogador?.mostrarIdade() ?: println("Crie um jogador primeiro.")
            "4" -> jogador?.calculaAposentadoria() ?: println("Crie um jogador primeiro.")
            "5" -> {
                println("Saindo do Programa...")
                break
            }
            else -> println("Opção inválida. Tente novamente.")
        }
    }
}
