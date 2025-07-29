class Produto(
    val codProd: Int,
    val nomeProd: String,
    var qtdEstoque: Int,
    val valorProd: Float
) {

    // METODO PARA EXIBIR OS DADOS DO PRODUTO
    fun exibirProduto() {
        println("Código: $codProd")
        println("Nome: $nomeProd")
        println("Estoque: ${qtdEstoque} unidade(s)")
        println("Preço: R$%.2f".format(valorProd))
    }
}