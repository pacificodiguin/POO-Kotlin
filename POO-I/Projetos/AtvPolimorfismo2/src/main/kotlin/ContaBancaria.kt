class ContaBancaria(
    val agencia: String,
    val conta: String,
    val senha: String,
    var saldo: Double = 0.0,
    var usuarioAutenticado: Boolean = false
) {

    var ultimoDeposito: Double = 0.0
    var ultimoSaque: Double = 0.0
    init {
        usuarioAutenticado = true
        println("Usuário autenticado com sucesso!")
    }

    fun recuperarSaldo(): Double {
        return if (usuarioAutenticado) saldo else 0.0
    }

    fun depositar(valor: Double) {
        if (valor > 0) {
            saldo += valor
            println("Depósito de R$%.2f realizado com sucesso.".format(valor))
            ultimoDeposito = valor
        } else {
            println("Valor inválido para depósito.")
        }
    }
    fun sacar(valor: Double) {
        if (valor > 0){
            println("Valor de saque inválido")
        }
        if (valor <= saldo) {
            saldo -= valor
            println("Saque de R$%.2f realizado com sucesso.".format(valor))
            ultimoSaque = valor
        } else {
            println("Erro: saldo insuficiente. Saldo disponível: R$%.2f".format(saldo))
        }
    }
    fun extrato(dias: Int){
        println("Gerando extrato dos últimos $dias dias...")
        println("Último depósito: R$%.2f".format(ultimoDeposito))
        println("Último Saque: R$%.2f".format(ultimoSaque))
        println("Saldo atual: R$%.2f".format(saldo))
    }

    fun extrato(dataIiicial: String, dataFinal: String) {
        println("Gerando extrato do período de $dataIiicial até $dataFinal...")
        println("Último depósito: R$%.2f".format(ultimoDeposito))
        println("Último Saque: R$%.2f".format(ultimoSaque))
        println("Saldo atual: R$%.2f".format(saldo))
    }


}