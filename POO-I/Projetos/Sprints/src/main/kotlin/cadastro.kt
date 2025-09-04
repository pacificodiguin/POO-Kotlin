fun main() {

        val produtos = mutableListOf<Produto>()


        for (i in 1..3) {
            println("Digite o código do Produto $i:")
            val codigoP = readLine() ?: ""

            println("Digite o nome do Produto $i:")
            val nomeP = readLine() ?: ""

            println("Digite o valor do Produto $i:")
            val precoP = readLine() ?.toDoubleOrNull() ?: 0.0


            val novoProduto = Produto(codigoP, nomeP, precoP)
            produtos.add(novoProduto)

            println("Produto cadastrado com sucesso!\n")
        }


        println("Lista de Produtos Cadastrados:")
        for (produto in produtos) {
            produto.mostrarP()
        }
}

