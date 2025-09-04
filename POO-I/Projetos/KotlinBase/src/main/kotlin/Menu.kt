fun main() {
    do {
        println(
            """
        ______________________
        | [1] - Cadastrar    |
        | [2] - Consultar    |
        | [3] - Listar       |
        | [4] - Alterar      |
        | [5] - Remover      |
        | [6] - Sair         |
        ----------------------
        
    """.trimIndent()
        )
        println("Digite a opção desejada: ")
        var opcao = readLine()?.toInt()
        when(opcao){
        1-> println("Chamar função cadastrar.")
        2-> println("Chamar função consultar.")
        3-> println("Chamar função listar.")
        4-> println("Chamar função alterar.")
        5-> println("Chamar função remover.")
        6-> println("Sair.")
        else -> println("Opção Inválida")
        }
    } while (opcao != 6)

    val poltrona = 2
    when (poltrona){

        in 1 .. 10 -> println("Fileira A")
        in 11 .. 20 -> println("Fileira B")
        in 21 .. 30 -> println("Fileira C")
        in 31 .. 40 -> println("Fileira D")

    }
}
