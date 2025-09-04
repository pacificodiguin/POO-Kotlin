class Produto (nome: String, preco: Double, qtd: Int) {

    var nome: String = ""
    var preco: Double? = null
    var qtd: Int? = null
    var valor: Double? = null

    // Inicializando as variáveis no construtor
    init {
        this.nome = nome
        this.preco = preco
        this.qtd = qtd
    }

    // Função para calcular o valor total em estoque
    fun valorTotal() {
        if (preco != null && qtd != null) {
            valor = preco!! * qtd!!
            println("O valor total em estoque é: $valor reais")
        } else {
            println("Valores de preço ou quantidade inválidos!")
        }
    }

    // Função para verificar a disponibilidade do estoque
    fun estoque() {
        if (qtd != null && qtd!! > 0) {
            println("Produto disponível")
        } else {
            println("Produto indisponível")
        }
    }
}

