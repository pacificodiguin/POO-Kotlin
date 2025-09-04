fun main() {

    val numeros = listOf(1, 2, 3, 4, 5)

    // Usando a variável número.
    numeros.forEach { numero ->
        println("O número é: $numero")
    } /* Saida : O número é: 1
                 O número é: 2
                 O número é: 3
                 O número é: 4
                 O número é: 5
      */


    // Usando 'it' (forma mais concisa)
    numeros.forEach {
        println("O número é: $it")
    } /* Saida : O número é: 1
                 O número é: 2
                 O número é: 3
                 O número é: 4
                 O número é: 5
      */

    // Exercício: Adicionar um lista com 5 nomes minúsculos, Depois imprimir cada nome em maiúsculas.
    // Criação da lista
    val nomes = listOf("val", "jonas", "marcos", "pedro", "joao")

    // Usando a variável nome.
    nomes.forEach { nome ->
        println("Nome: ${nome.uppercase()}")
    } /* Saida : Nome: VAL
                 Nome: JONAS
                 Nome: MARCOS
                 Nome: PEDRO
                 Nome: JOAO
      */

    // Usando 'it' (forma mais concisa).
    nomes.forEach {
        println("Nome: ${it.uppercase()}")
    } /* Saida : Nome: VAL
                 Nome: JONAS
                 Nome: MARCOS
                 Nome: PEDRO
                 Nome: JOAO
      */

}