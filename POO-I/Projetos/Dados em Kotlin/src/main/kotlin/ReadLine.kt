import java.util. *
fun  main(){
    /*
    println("Entre com seu nome: ")
    var nome = readLine()
    println("O tamanho do seu nome é ${nome?.length}")

    println("\nEntre com sua Idade: ")
    var number = readLine()
    println("O numero da sua idade multiplicado por 5 é ${number!!.toInt() * 5}")

    println("\nEntre com sua Idade: ")
    var number = readLine()
    println("O numero da sua idade multiplicado por 5 é ${number?.toInt()?.times(5)}")
    */

    /*
    println("Digite:")

    do {
        var line = readLine()
        if (line == "fim"){
            println("Fechando programa")
            break
        }
        println("Entrada de Informação: $line")
    }while (true)


    val reader = Scanner(System.`in`)

    print("Entre com um número inteiro: ")
    var numero: Int= reader.nextInt()
    println("Você entrou com o número $numero")
    */

    val reader = Scanner(System.`in`)

    print("Entre com um número inteiro: ")
    var numero: Float = reader.nextFloat()
    println("Você entrou com o número $numero")
}