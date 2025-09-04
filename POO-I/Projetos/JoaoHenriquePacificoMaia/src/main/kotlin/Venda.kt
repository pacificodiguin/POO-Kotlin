class Venda(
    val codProdVen: Int,
    val qtdVen: Int,
    val totalVen: Float
) {

    // METODO PARA EXIBIR OS DADOS DO PRODUTO VENDIDO
    fun mostrarDadosVenda(){
        println("Código do Produto Vendido: $codProdVen")
        println("Quantidade do Produto Vendido: $qtdVen")
        println("Valor Total da Venda do Produto: R$%.2f".format(totalVen))

    }


}