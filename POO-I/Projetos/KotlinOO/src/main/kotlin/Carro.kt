class Carro ( cor: String, altura: Double, largura: Double ) {

    //Propriedades (Atributos) da Classe Carro
    var cor: String = ""
    var altura: Double? = null
    var largura: Double? = null

    //Usando INIT para a inicialização dos Atributos
    init {
        this.cor = cor
        this.altura = altura
        this.largura = largura
    }

    // Metódos da classe Carro
    fun passarMarcha() {
        println("Passando Mais Uma Marcha...\n")

    }
    fun freiar() {
        println("Freiando...\n")
    }

    fun mostrarDetalhes() {
        println("Cor: $cor, Altura: $altura, Largura: $largura \n")
    }

    fun acoesCarro() {
        this.passarMarcha()
        this.freiar()
    }
}