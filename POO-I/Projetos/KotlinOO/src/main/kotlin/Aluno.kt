class Aluno(nome: String, matricula: Int, nota1: Float, nota2: Float ) {

    var nome: String = ""
    var matricula: Int = 0
    var  nota1: Float = 0.00f
    var  nota2: Float = 0.00f
//Inicializando as variáveis
    init {
        this.nome = nome
        this.matricula = matricula
        this.nota1 = nota1
        this.nota2 = nota2
    }
//Metódo para calcular a media
    fun mediaNotas(){
        println("A média do aluno(a) $nome é: ${(this.nota1 + this.nota2)/2}")
    }
//Metódo para visualizar a situação do aluno
    fun situacao() {
        val media = (this.nota1 + this.nota2) / 2
        if (media >= 7) {
            println("A situação do aluno(a) $nome é: Aprovado")
        } else println("A situação do aluno(a) $nome é: Reprovado")

    }

}