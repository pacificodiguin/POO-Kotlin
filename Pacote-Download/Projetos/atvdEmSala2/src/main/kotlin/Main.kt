fun main() {
    println("--- Sistema do Banco ---")

    print("Informe a agência: ")
    val agencia = readLine() ?: ""
    print("Informe a conta: ")
    val conta = readLine() ?: ""
    print("Informe a senha: ")
    val senha = readLine() ?: ""

    val contaBancaria = ContaBancaria(agencia, conta, senha)

    while (true) {
        println(
            """
            --------------------------------------
            
            ---------------- MENU ----------------
            [1] - Recuperar Saldo
            [2] - Depositar
            [3] - Sacar
            [4] - Extrato por dias
            [5] - Extrato por intervalo de datas
            [6] - Sair
            
            Escolha uma opção: 
            --------------------------------------
            """.trimIndent()
        )
        when (readLine()?.toIntOrNull()) {
            1 -> {
                val saldo = contaBancaria.recuperarSaldo()
                println("Saldo atual: R$%.2f".format(saldo))
            }
            2 -> {
                print("Informe o valor para depósito: ")
                val valor = readLine()?.toDoubleOrNull() ?: 0.0
                contaBancaria.depositar(valor)
            }
            3 -> {
                print("Informe o valor para saque: ")
                val valor = readLine()?.toDoubleOrNull() ?: 0.0
                contaBancaria.sacar(valor)
            }
            4 -> {
                print("Informe o número de dias do extrato: ")
                val dias = readLine()?.toIntOrNull() ?: 0
                contaBancaria.extrato(dias)
            }
            5 -> {
                print("Informe a data de início (ex: 12/05/2025): ")
                val inicio = readLine() ?: ""
                print("Informe a data de fim (ex: 12/05/2025): ")
                val fim = readLine() ?: ""
                contaBancaria.extrato(inicio, fim)
            }
            6 -> {
                println("Encerrando o sistema!")
                break
            }
            else -> println("Opção inválida. Tente novamente.")
        }
    }
}
