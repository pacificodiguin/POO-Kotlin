fun main() {

    var retangulo: Retangulo? = null
    var circulo: Circulo? = null
    var continuar = true

    do {
        println(
            """
            ---------------------------
            Escolha uma Opção
            [1] Criar Objeto Retângulo.
            [2] Criar Objeto Círculo.
            [3] Descrever Objeto Retângulo.
            [4] Descrever Objeto Círculo.
            [0] Sair

            ---------------------------
        """.trimIndent()
        )

        print("Digite a opção desejada: ")
        val opcao = readLine()?.toIntOrNull()

        when (opcao) {
            1 -> {
                print("Digite a cor: ")
                val cor = readLine()?.trim()
                print("Digite a largura: ")
                val largura = readLine()?.toDoubleOrNull()
                print("Digite a altura: ")
                val altura = readLine()?.toDoubleOrNull()

                if (!cor.isNullOrEmpty() && largura != null && altura != null) {
                    retangulo = Retangulo(cor, largura, altura)
                    println("Área do retângulo: %.2f".format(retangulo.calcularArea()))
                } else {
                    println("Entrada inválida.")
                }
            }

            2 -> {
                print("Digite a cor: ")
                val cor = readLine()?.trim()
                print("Digite o raio: ")
                val raio = readLine()?.toDoubleOrNull()

                if (!cor.isNullOrEmpty() && raio != null) {
                    circulo = Circulo(cor, raio)
                    println("Área do círculo: %.2f".format(circulo.calcularArea()))
                } else {
                    println("Entrada inválida.")
                }
            }

            3 -> {
                if (retangulo != null) {
                    println(retangulo.descrever())
                } else {
                    println("Retângulo ainda não foi criado.")
                }
            }

            4 -> {
                if (circulo != null) {
                    println(circulo.descrever())
                } else {
                    println("Círculo ainda não foi criado.")
                }
            }

            0 -> continuar = false

            else -> println("Opção inválida.")
        }

    } while (continuar)
}

