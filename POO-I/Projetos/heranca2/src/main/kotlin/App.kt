fun main(){

    val carros = mutableListOf<Carro>()
    val motos = mutableListOf<Moto>()
    var opcao: Int?

    do {
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

        println("Digite a opção desejada: ")
        opcao = readLine()?.toInt()
        when(opcao){
            1-> {
                println("\nCriar Objeto Carro.")

                print("Marca do Carro: ")
                val marca = readLine() ?: ""

                print("Modelo: ")
                val modelo = readLine() ?: ""

                print("Ano: ")
                val ano = readLine()?.toIntOrNull() ?: 0

                print("Número de Portas: ")
                val portas = readLine()?.toIntOrNull() ?: 0

                val novoCarro = Carro(marca, modelo, ano, portas)
                carros.add(novoCarro)

                println("Objeto Carro Criado com sucesso")
            }

            2-> {

                if (carros.isEmpty()) {
                    println("Nenhum carro criado.")
                } else {
                    carros.forEach { it.exibirInformacoes( )}
                }
            }

            3 -> {
                if (carros.isEmpty()) {
                    println("Nenhum carro criado.")
                } else {
                    print("Digite o valor da frenagem: ")
                    val valor = readLine()?.toInt() ?: 0
                    carros.forEach { it.frear(valor) }
                }
            }
            4 -> {
                if (carros.isEmpty()) {
                    println("Nenhum carro criado.")
                } else {
                    print("Digite o valor da aceleração: ")
                    val valor = readLine()?.toInt() ?: 0
                    carros.forEach { it.acelerar(valor) }
                }
            }

            5 -> {
                if (carros.isEmpty()) {
                    println("Nenhum carro criado.")
                } else {
                    carros.forEach { it.abrirPortaMalas() }
                }
            }

            6 -> {
                println("\nCriar Objeto Moto.")

                print("Marca da Moto: ")
                val marca = readLine() ?: ""

                print("Modelo: ")
                val modelo = readLine() ?: ""

                print("Ano: ")
                val ano = readLine()?.toIntOrNull() ?: 0

                print("Cilindrada: ")
                val cilindrada = readLine()?.toIntOrNull() ?: 0

                val novaMoto = Moto(marca, modelo, ano, cilindrada)
                motos.add(novaMoto)

                println("Objeto Moto Criado com sucesso")
            }

            7 -> {
                if (motos.isEmpty()) {
                    println("Nenhuma moto criada.")
                } else {
                    motos.forEach { it.exibirInformacoes() }
                }
            }

            8 -> {
                if (motos.isEmpty()) {
                    println("Nenhuma moto criada.")
                } else {
                    print("Digite o valor da frenagem: ")
                    val valor = readLine()?.toInt() ?: 0
                    motos.forEach { it.frear(valor) }
                }
            }

            9 -> {
                if (motos.isEmpty()) {
                    println("Nenhuma moto criada.")
                } else {
                    print("Digite o valor da aceleração: ")
                    val valor = readLine()?.toInt() ?: 0
                    motos.forEach { it.acelerar(valor) }
                }
            }

            10 -> {
                if (motos.isEmpty()) {
                    println("Nenhuma moto criada.")
                } else {
                    motos.forEach { it.empinar() }
                }
            }

            11 -> println("Saindo do programa...")

        }
    } while (opcao != 11)
}