import java.util. *

fun main() {

    val scanner = Scanner(System. `in`)

    for (i in 1..3) {

        println("Digite os dados do produto $i")

        println("Coloque o número do produto: ")
        val numeropro = scanner.nextLine()

        println("Coloque a descrição do produto: ")
        val desc = scanner.nextLine()

        println("Coloque a quantidade do produto: ")
        val qtd = scanner.nextInt()

        println("Coloque o preço do produto: ")
        val preco = scanner.nextDouble()
        scanner.nextLine()

        val fatura = Fatura(numeropro,desc,qtd,preco)
        fatura.mostrardetalhes()
    }

}