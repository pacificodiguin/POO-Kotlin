fun main() {

    val produtos = mutableListOf<Produto>()
    val carrinho = mutableListOf<Produto>()

    while (true) {
        println("\n--- MENU ---")
        println("1. Cadastrar novo produto.")
        println("2. Ver produtos na loja.")
        println("3. Pesquisar produtos na loja.")
        println("4. Ver carrinho de produtos.")
        println("5. Sair.")
        print("Escolha uma opção: ")
        val opcao = readLine()

        when (opcao) {
            "1" -> {
                println("\nCadastro de Produto.")

                print("Nome do produto: ")
                val nome = readLine() ?: ""

                print("Descrição: ")
                val descricao = readLine() ?: ""

                print("Preço (ex: 99.99): ")
                val preco = readLine()?.toDoubleOrNull() ?: 0.0

                print("Quantidade em estoque: ")
                val estoque = readLine()?.toIntOrNull() ?: 0

                val novoProduto = Produto(nome, descricao, preco, estoque)
                produtos.add(novoProduto)

                println("Produto cadastrado com sucesso!")
            }

            "2" -> {
                println("\nProdutos disponíveis na loja:")

                if (produtos.isEmpty()) {
                    println("Nenhum produto cadastrado ainda.")
                } else {
                    for (produto in produtos) {
                        produto.exibirProduto()
                    }
                }
            }
            "3" -> {
                print("\nDigite o nome do nome do produto: ")
                val busca = readLine()?.lowercase() ?: ""

                val encontrados = produtos.filter {
                    it.nome.lowercase().contains(busca)
                }

                if (encontrados.isEmpty()) {
                    println("Nenhum produto encontrado com o nome \"$busca\".")
                } else {
                    println("Produto(s) encontrado(s):")
                    for ((index, produto) in encontrados.withIndex()) {
                        println("[$index]")
                        produto.exibirProduto()
                    }

                    print("Digite o número do produto que deseja adicionar ao carrinho: ")
                    val escolha = readLine()?.toIntOrNull()

                    if (escolha != null && escolha in encontrados.indices) {
                        val produtoSelecionado = encontrados[escolha]
                        carrinho.add(produtoSelecionado)
                        println("Produto \"${produtoSelecionado.nome}\" adicionado ao carrinho.")
                    } else {
                        println("Escolha inválida.")
                    }
                }
            }

            "4" -> {
                println("\nCarrinho de Compras:")

                if (carrinho.isEmpty()) {
                    println("O carrinho está vazio.")
                } else {
                    var total = 0.0
                    for (produto in carrinho) {
                        produto.exibirProduto()
                        total += produto.preco
                    }
                    println("Total: R$ %.2f".format(total))
                }
            }

            "5" -> {
                println("Encerrando o programa...")
                break
            }

            else -> println("Opção inválida. Tente novamente.")
        }
    }
}
