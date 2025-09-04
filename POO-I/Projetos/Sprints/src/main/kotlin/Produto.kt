class Produto (
    val codigoP: String,
    val nomeP: String,
    val precoP: Double
) {
    fun mostrarP(){
        println("Código do Produto $precoP, Nome do Produto $nomeP e o R$ %.2f".format(precoP))

    }
}
