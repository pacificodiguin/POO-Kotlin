fun main(){
    /*
    // Mutável
    var nome = "Antônio"
    println(nome)

    nome ="Cleber"
    println(nome)

    nome = "Maria"
    println(nome)

    // Imutável
    val idade = 29
    println(idade)
    idade = 50
    */

    /*
    // 1. Variável Imutável (não pode ser reatribuída)
    val nome: String = "João"  // String - Tipo de dado: Texto
    println(nome)  // Saída: João

    // Tentativa de reatribuição (causaria erro de compilação)
    // nome = "Maria"  // Erro: Val cannot be reassigned

    // 2. Variável Mutável (pode ser reatribuída)
    var idade: Int = 25  // Int - Tipo de dado: Número inteiro
    println(idade)  // Saída: 25
    idade = 30  // Atribuição permitida para variáveis mutáveis
    println(idade)  // Saída: 30

    // 3. Tipo Numérico
    val altura: Double = 1.75  // Double - Tipo de dado: Número de ponto flutuante (64 bits)
    println(altura)  // Saída: 1.75

    val peso: Float = 70.5F  // Float - Tipo de dado: Número de ponto flutuante (32 bits)
    println(peso)  // Saída: 70.5

    // 4. Tipo Booleano
    val isActive: Boolean = true  // Boolean - Tipo de dado: Verdadeiro ou falso
    println(isActive)  // Saída: true

    // 5. Tipo Caractere
    val letra: Char = 'A'  // Char - Tipo de dado: Um único caractere
    println(letra)  // Saída: A

    // 6. Tipo Lista (Coleção)
    val lista: List<String> = listOf("João", "Maria", "Pedro")  // List - Tipo de dado: Coleção de elementos ordenados (não mutável)
    println(lista)  // Saída: [João, Maria, Pedro]

    // 7. Tipo Conjunto (Set) - Coleção sem duplicação
    val conjunto: Set<Int> = setOf(1, 2, 3, 3)  // Set - Tipo de dado: Conjunto de elementos (não permite duplicação)
    println(conjunto)  // Saída: [1, 2, 3]

    // 8. Tipo Mapa (Map) - Coleção de pares chave-valor
    val mapa: Map<String, Int> = mapOf("João" to 25, "Maria" to 30)  // Map - Tipo de dado: Coleção de pares chave-valor
    println(mapa)  // Saída: {João=25, Maria=30}

    // 9. Tipo Nullable (pode armazenar null)
    val nomeNullable: String? = null  // String? - Tipo de dado: String que pode ser nulo
    println(nomeNullable)  // Saída: null

    // 10. Função de Tipo (Função como valor)
    val somar: (Int, Int) -> Int = { a, b -> a + b }  // Função de tipo - Uma função que soma dois inteiros
    println(somar(3, 4))  // Saída: 7

    */

    // Inferência
    val nomeCompleto = "Maria da Silva"
    println(nomeCompleto)

    // Explicíto
    val idade: Long = 9223372036854775807
    println(idade)

    val nome: String = "José da Silva"
    println(nome)

    val distancia = 2147483747
    println(distancia)

    val dinheiro = 2.55f
    println(dinheiro)

    val lucro = 2.123456789101112
    println(lucro)




}