import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Carro 1
    println("Informe os dados do Carro 1:")
    print("Marca: ")
    val marca1 = scanner.nextLine()
    print("Modelo: ")
    val modelo1 = scanner.nextLine()
    print("Ano: ")
    val ano1 = scanner.nextLine().toInt()
    print("Capacidade de passageiros: ")
    val cap1 = scanner.nextLine().toInt()
    val carro1 = Carro(marca1, modelo1, ano1, cap1)

    // Carro 2
    println("\nInforme os dados do Carro 2:")
    print("Marca: ")
    val marca2 = scanner.nextLine()
    print("Modelo: ")
    val modelo2 = scanner.nextLine()
    print("Ano: ")
    val ano2 = scanner.nextLine().toInt()
    print("Capacidade de passageiros: ")
    val cap2 = scanner.nextLine().toInt()
    val carro2 = Carro(marca2, modelo2, ano2, cap2)

    // Caminhão 1
    println("\nInforme os dados do Caminhão 1:")
    print("Marca: ")
    val marca3 = scanner.nextLine()
    print("Modelo: ")
    val modelo3 = scanner.nextLine()
    print("Ano: ")
    val ano3 = scanner.nextLine().toInt()
    print("Capacidade de carga (toneladas): ")
    val carga1 = scanner.nextLine().toDouble()
    val caminhao1 = Caminhao(marca3, modelo3, ano3, carga1)

    // Caminhão 2
    println("\nInforme os dados do Caminhão 2:")
    print("Marca: ")
    val marca4 = scanner.nextLine()
    print("Modelo: ")
    val modelo4 = scanner.nextLine()
    print("Ano: ")
    val ano4 = scanner.nextLine().toInt()
    print("Capacidade de carga (toneladas): ")
    val carga2 = scanner.nextLine().toDouble()
    val caminhao2 = Caminhao(marca4, modelo4, ano4, carga2)

    // Exibindo os dados
    println("\n=== Detalhes dos Veículos ===")
    println("\nCarro 1:")
    carro1.exibirDetalhes(true)
    carro1.exibirDetalhes(false)
    println("É antigo? ${if (carro1.ehAntigo()) "Sim" else "Não"}")

    println("\nCarro 2:")
    carro2.exibirDetalhes(true)
    carro2.exibirDetalhes(false)
    println("É antigo? ${if (carro2.ehAntigo()) "Sim" else "Não"}")

    println("\nCaminhão 1:")
    caminhao1.exibirDetalhes(true)
    caminhao1.exibirDetalhes(false)
    println("É antigo? ${if (caminhao1.ehAntigo()) "Sim" else "Não"}")

    println("\nCaminhão 2:")
    caminhao2.exibirDetalhes(true)
    caminhao2.exibirDetalhes(false)
    println("É antigo? ${if (caminhao2.ehAntigo()) "Sim" else "Não"}")
}
