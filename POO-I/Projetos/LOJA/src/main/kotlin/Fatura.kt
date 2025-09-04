class Fatura(
    val numero: String,
    val descPro: String,
    var quatdPro: Int,
    var precoPro: Double

) {

    fun totalFatura(): Double{
        return if(quatdPro > 0 && precoPro > 0)
            quatdPro*precoPro else 0.0
    }

    fun mostrardetalhes(){
        println("O Número do Produto é $numero, a Descrição é $descPro, a Quantidade é $quatdPro, o Preço é $precoPro e o Preço da Fatura é ${totalFatura()}")
    }
}