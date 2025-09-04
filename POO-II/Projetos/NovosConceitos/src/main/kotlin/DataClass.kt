
    data class Pessoa(val nome: String, val idade: Int)

    fun main(){

        // Criando Objetos:
        val pessoa1 = Pessoa("Alice", 30)
        val pessoa2 = Pessoa("Alice", 30)
        val pessoa3 = Pessoa("Bob", 25)

        // Imprimindo com toString() (gerando automaticamente).
        println(pessoa1) // Saída: Pessoa(nome=Alice, idade=30).

        // Comparando com equals() (gerando automaticamente).
        println("pessoa1 == pessoa2: ${pessoa1 == pessoa2}") // Saída: pessoa1 == pessoa2: true
        println("pessoa1 == pessoa3: ${pessoa1 == pessoa3}") // Saída: pessoa1 == pessoa3: false

        // Usando hashCode() (gerando automaticamente).
        println("Hash de pessoa1: ${pessoa1.hashCode()}") // Saída: 1963861438
        println("Hash de pessoa2: ${pessoa2.hashCode()}") // Saída: 1963861438
        println("Hash de pessoa3: ${pessoa3.hashCode()}") // Saída: 2075940

        // Desestruturação com componentN() (gerando automaticamente).
        val (nome, idade) = pessoa1
        println("Nome: $nome, Idade: $idade") // Saída: Nome: Alice, Idade: 30

        // Cópia com copy() (gerando automaticamente).
        // Crie uma nova pessoa com o mesmo nome, mas idade modificada para 31
        val pessoa4 = pessoa1.copy(idade = 31)
        println(pessoa4) // Saída: Pessoa(nome=Alice, idade=31)

        // Crie uma nova pessoa idêntica
        val pessoa5 = pessoa1.copy()
        println(pessoa5) // Saída: Pessoa(nome=Alice, idade=30)

    }