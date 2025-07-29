fun main(){

    // Definindo Listas Mutáveis Para Carro e Moto
    val carros = mutableListOf<Carro>()
    val motos = mutableListOf<Moto>()

    // Estrutura do Loop Do ... While
    var opcao: Int?

    do {

        // Menu
        println(
            """
            [1] - Criar Objeto Carro.
            [2] - Exibir Informação Carro.
            [3] - Frear Carro.
            [4] - Acelerar Carro.
            [5] - Abrir Porta-Malas do Carro.
            [6] - Criar Objeto Moto.
            [7] - Exibir Informação Moto.
            [8] - Frear Moto.
            [9] - Acelerar Moto.
            [10] - Empinar Moto.
            [11] - Sair.
    """.trimIndent()
        )

        // Recebimento da Opção
        println("Digite a opção desejada: ")
        opcao = readLine()?.toInt()

        // Abertura das Decisões no When
        when(opcao){

            // Opção 1 Para a Criação do Novo Objeto Carro
            1-> {
                println("\nCriar Objeto Carro.")

                // Lendo os dados do usuário
                print("Marca do Carro: ")
                val marca = readLine() ?: ""

                print("Modelo: ")
                val modelo = readLine() ?: ""

                print("Ano: ")
                val ano = readLine()?.toIntOrNull() ?: 0

                print("Número de Portas: ")
                val portas = readLine()?.toIntOrNull() ?: 0

                // Criando um novo objeto com o construtor e adicionando na sua lista
                val novoCarro = Carro(marca, modelo, ano, portas)
                carros.add(novoCarro)

                println("Objeto Carro Criado com sucesso")
            }

            // Opção 2 Para Exibir Todas as Informações do Objeto Carro
            2-> {

                //Ler a lista, caso esteja vazia retorna vazia
                if (carros.isEmpty()) {
                    println("Nenhum carro criado.")
                } else {
                    // Percorre todos os itens da lista e chama o metódo
                        carros.forEach { it.exibirInformacoes( )}
                }
            }

            // Opção 3 Para a Definição do Valor da Frenagem
            3 -> {

                //Ler a lista, caso esteja vazia retorna vazia
                if (carros.isEmpty()) {
                println("Nenhum carro criado.")
                } else {
                print("Digite o valor da frenagem: ")
                val valor = readLine()?.toInt() ?: 0 // Para tratar valores nulos
                    // Lê do Usuário a quantidade a ser freada
                    // Percorre todos os itens da lista e chama o metódo
                carros.forEach { it.frear(valor) }
                }
            }

            // Opção 4 Para a Definição do Valor da Aceleração
            4 -> {

                //Ler a lista, caso esteja vazia retorna vazia
                if (carros.isEmpty()) {
                    println("Nenhum carro criado.")
                } else {
                    print("Digite o valor da aceleração: ")
                    val valor = readLine()?.toInt() ?: 0 // Para tratar valores nulos
                    // Lê do Usuário a quantidade a ser acelerada
                    // Percorre todos os itens da lista e chama o metódo
                    carros.forEach { it.acelerar(valor) }
                }
            }

            // Opção 5 Para Acionar o Metódo Exclusivo da Classe "Carro"
            5 -> {

                //Ler a lista, caso esteja vazia retorna vazia
                if (carros.isEmpty()) {
                    println("Nenhum carro criado.")
                } else {
                    // Percorre todos os itens da lista e chama o metódo
                    carros.forEach { it.abrirPortaMalas() }
                }
            }

            // Opção 6 Para a Criação do Novo Objeto Moto
            6 -> {

                // Lendo os dados do usuário
                println("\nCriar Objeto Moto.")

                print("Marca da Moto: ")
                val marca = readLine() ?: ""

                print("Modelo: ")
                val modelo = readLine() ?: ""

                print("Ano: ")
                val ano = readLine()?.toIntOrNull() ?: 0

                print("Cilindrada: ")
                val cilindrada = readLine()?.toIntOrNull() ?: 0

                // Criando um novo objeto com o construtor e adicionando na sua lista
                val novaMoto = Moto(marca, modelo, ano, cilindrada)
                motos.add(novaMoto)

                println("Objeto Moto Criado com sucesso")
            }

            // Opção 7 Para Exibir Todas as Informações do Objeto Moto
            7 -> {

                //Ler a lista, caso esteja vazia retorna vazia
                if (motos.isEmpty()) {
                    println("Nenhuma moto criada.")
                } else {
                    // Percorre todos os itens da lista e chama o metódo
                    motos.forEach { it.exibirInformacoes() }
                }
            }

            // Opção 8 Para a Definição do Valor da Frenagem
            8 -> {

                //Ler a lista, caso esteja vazia retorna vazia
                if (motos.isEmpty()) {
                    println("Nenhuma moto criada.")
                } else {
                    print("Digite o valor da frenagem: ")
                    val valor = readLine()?.toInt() ?: 0 // Para tratar valores nulos
                    // Lê do Usuário a quantidade a ser freada
                    // Percorre todos os itens da lista e chama o metódo
                    motos.forEach { it.frear(valor) }
                }
            }

            // Opção 9 Para a Definição do Valor da Aceleração
            9 -> {

                //Ler a lista, caso esteja vazia retorna vazia
                if (motos.isEmpty()) {
                    println("Nenhuma moto criada.")
                } else {
                    print("Digite o valor da aceleração: ")
                    val valor = readLine()?.toInt() ?: 0 // Para tratar valores nulos
                    // Lê do Usuário a quantidade a ser acelerada
                    // Percorre todos os itens da lista e chama o metódo
                    motos.forEach { it.acelerar(valor) }
                }
            }

            // Opção 10 Para Acionar o Metódo Exclusivo da Classe "Moto"
            10 -> {

                //Ler a lista, caso esteja vazia retorna vazia
                if (motos.isEmpty()) {
                    println("Nenhuma moto criada.")
                } else {
                    // Percorre todos os itens da lista e chama o metódo
                    motos.forEach { it.empinar() } // Se a velocidade for maior que 10, imprime que está empinando. Caso contrário, diz que precisa acelerar mais.
                }
            }

            // Opção 11 Para o Encerramento do Programa
            11 -> println("Saindo do programa...")

        }
    } while (opcao != 11) // Garante que qualquer valor fora do intervalo seja tratado
}