fun main() {

    // DECLARAÇÃO DE LISTA PARA PRODUTOS E VENDAS
    val produtos = mutableListOf<Produto>()
    val vendas = mutableListOf<Venda>()

    // INICIO DO LAÇO DE REPETIÇÃO
    while (true) {
        // MENU INTERATIVO
        println(
            """
                       
                       --- MENU ---
                [1] Cadastrar um produto.
                [2] Mostrar dados do produto.
                [3] Vender um produto.
                [4] Mostrar dados do produto Vendido.
                [5] Sair.
                Entre com a opção desejada:
            """.trimIndent()
        )
        // LEITURA DA OPÇÃO DIGITADA
        val opcao = readLine()
        when (opcao) {
            // OPÇÃO PARA CADASTRO DE PRODUTO
            "1" -> {
                println("Cadastrar um Novo Produto.\n")

                print("Código do Prduto: ")
                val codigo = readLine() ?.toIntOrNull() ?: 0

                // CONSULTA SE O CODIGO DIGITADO JA EXISTE
                if (produtos.any { it.codProd == codigo }) {
                    println("Erro: Já existe um produto com esse código. Voltando ao menu...\n")
                    continue
                }

                print("Nome do produto: ")
                val nome = readLine() ?: ""

                print("Quantidade em estoque: ")
                val estoque = readLine()?.toIntOrNull() ?: 0

                print("Preço (ex: 99.99): ")
                val preco = readLine()?.toFloatOrNull() ?: 0.0f

                // ADICIONAR O OBJETO CRIADO DENTRO DA LISTA DA CLASSE
                val novoProduto = Produto(codigo,nome, estoque, preco)
                produtos.add(novoProduto)

                println("\nProduto cadastrado com sucesso!\n")
            }

            // OPÇÃO PARA EXIBIR OS OBJETOS
            "2" -> {

                // LEITURA DA LISTA PARA VERIFICAR SE TEM OBJETO CRIADO
                if (produtos.isEmpty()) {
                    println("\nNenhum produto cadastrado ainda.\n")
                }
                // CASO TENHA OBJETO ELE EXIBE USANDO UM METODO DA CLASSE
                else {
                    println("\nProdutos disponíveis na loja:\n")
                    for (produto in produtos) {
                        produto.exibirProduto()
                    }
                }
            }
            // OPÇÃO PARA FAZER A VENDA DE UM PRODUTO
            "3" -> {

                print("\nDigite o código do produto para venda: ")
                // LENDO O CODIGO DIGITADO
                val cod = readLine()?.toIntOrNull()
                // FAZENDO A COMPARAÇÃO DE ACORDO COM OS OBJETOS DA LISTA PRODUTOS
                val produto = produtos.find { it.codProd == cod }
                // CASO NÃO EXISTA NENHUM OBJETO COM AQUELE CÓDIGO RETORNA A MENSGEM
                if (produto == null){
                    println("Código inválido. Voltando ao Menu...")
                    continue
                }

                // SE TUDO ESTIVER OK O PROGRAMA RECEBERÁ O VALOR DA QUANTIDADE A SER VENDIDA
                println("Quantidade do produto que deseja vender: ")
                // LENDO A QUANTIDADE DESEJADA
                val qtd = readLine()?.toIntOrNull()?: 0
                // CASO A QUANTIDADE DIGITADA SEJA MAIOR QUE A DO ESTOQUE RETORNA A MENSAGEM
                if (qtd> produto.qtdEstoque){
                    println("Estoque Insuficiente, Estoque Atual: ${produto.qtdEstoque}. Voltando ao Menu...")
                    continue
                }

                // CASO TUDO DÊ CERTO É FEITO A VENDA E DESCONTADO DO ESTOQUE

                // ATUALIZAÇÃO DO ESTOQUE
                produto.qtdEstoque -= qtd

                // CALCULO DO VALOR DA VENDA
                val totalVen = qtd * produto.valorProd

                // ADICIONANDO O OBJETO VENDIDO NA CLASSE VENDA
                val venda = Venda(codProdVen = produto.codProd, qtdVen = qtd, totalVen = totalVen)
                vendas.add(venda)

                println("Venda realizada com sucesso. \n")
                println("Valor da venda: R$%.2f".format(totalVen))
                println("\n")

            }

            // OPÇÃO PARA LISTAR TODAS AS VENDAS
            "4" -> {
                // LENDO A LISTA VENDA PARA BUSCAR VENDAS REGISTRADAS
                if (vendas.isEmpty()){
                    println("Nenhuma Venda Registrada.")
                }
                // EXIBINDO A LISTA DE VENDAS POR UM METODO NA CLASSE VENDA
                else{
                    println("-- Lista de Vendas --")
                    for (venda in vendas){
                        venda.mostrarDadosVenda()
                    }
                }

            }

            // OPÇÃO PARA ENCERRAMENTO DO PROGRAMA
            "5" -> {
                println("Encerrando o programa...")
                break
            }

            // CASO SEJA DIGITADO UMA OPÇÃO FORA DO MENU
            else -> println("Opção inválida. Tente novamente.")
        }
    }
}