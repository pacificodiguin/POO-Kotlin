fun main() {

    var impressora: Impressora? = null
    var texto: String = ""
    var numeroInt: Int = 0
    var numeroDouble: Double = 0.0

    while (true) {
        println("""
        ---------------------------------------------------------------------------------------------
        |                                                                                           |
        |                             --- Menu da Impressora ---                                    |
        |  [1] - Criar objeto Impressora.                                                           |
        |  [2] – Executar o método imprimir() do objeto Impressora - que recebe parâmetro String.   |
        |  [3] – Executar o método imprimir() do objeto Impressora - que recebe parâmetro Int.      |
        |  [4] – Executar o método imprimir() do objeto Impressora - que recebe parâmetro Double.   |
        |  [5] - Sair.                                                                              |
        |                                                                                           |
        ---------------------------------------------------------------------------------------------
        
        Entre com a opção desejada:   
    """.trimIndent())
        when (readLine()?.toIntOrNull()) {
            1 -> {
                impressora = Impressora()
                println("Objeto Impressora criado")
            }
            2 -> {
                print("Digite um texto: ")
                texto = readLine() ?: ""
                if (impressora != null) {
                    impressora.imprimir(texto)
                } else {
                    println("Crie o objeto impressora primeiro! Retornando ao menu...")
                }
            }
            3 -> {
                print("Digite um número inteiro: ")
                numeroInt = readLine()?.toIntOrNull() ?: 0
                if (impressora != null) {
                    impressora.imprimir(numeroInt)
                } else {
                    println("Crie o objeto impressora primeiro! Retornando ao menu...")
                }
            }
            4 -> {
                print("Digite um número decimal: ")
                numeroDouble = readLine()?.toDoubleOrNull() ?: 0.0
                if (impressora != null) {
                    impressora.imprimir(numeroDouble)
                } else {
                    println("Crie o objeto impressora primeiro! Retornando ao menu...")
                }
            }
            5 -> {
                println("Encerrando o programa.")
                break
            }
            else -> {
                println("Opção inválida. Tente novamente.")
            }
        }
    }
}