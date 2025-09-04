fun main(){
    val minhaConta = ContaBancaria("12345-6", 1000.00)

    println("Numero da conta: ${minhaConta.getNumeroConta()}")
    println("Saldo da conta: ${minhaConta.getSaldo()}")

    minhaConta.depositar(500.00)
    minhaConta.sacar(200.00)
    println("A conta está integrada? ${minhaConta.verificarIntegridade()}")
}
