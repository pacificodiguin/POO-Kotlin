class ContaBancaria(
    private val numeroConta: String,
    private var saldo: Double
) {
    fun getNumeroConta(): String{
        return numeroConta
    }
    fun getSaldo(): Double{
        return saldo
    }
    fun depositar(valor: Double){
        if (valor>0){
            saldo += valor
            println("Depósito de $valor realixado com sucesso. Novo saldo: $saldo")

        }else{
            println("Valor de depósito inválido.")
        }
    }
    fun sacar(valor: Double){
        if(valor> 0 && valor <= saldo){
            saldo -= valor
            println("Saque de $valor realizado com sucesso. Novo saldo: $saldo")
        }else{
            println("Saldo Insuficiente ou valor inválido para o saque.")
        }
    }
    internal fun verificarIntegridade(): Boolean{
        return saldo >= 0
    }
}
