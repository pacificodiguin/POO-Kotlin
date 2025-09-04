class Produto(
    val nome: String,
    val codigo: String,
    val preco: Double,
    val estoque: Int
) {
    fun exibirProduto() {
        println("Código: $codigo")
        println("Nome: $nome")
        println("Preço: R$ %.2f".format(preco))
        println("Estoque: $estoque unidade(s)\n")
    }
}
