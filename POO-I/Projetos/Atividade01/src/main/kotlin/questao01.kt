fun Converte(anos: Int): Unit{

    // Valores de Conversão

    val meses = anos * 12
    val dias = anos * 365
    val horas = dias * 24
    val minutos = horas * 60
    val segundos = minutos *60

    // Respostas

    println("$anos anos equivalem a:")
    println("$meses meses:")
    println("$dias dias:")
    println("$horas horas:")
    println("$minutos minutos:")
    println("$segundos segundos:")
}

fun letras(texto: String): Int {
    // Mostrar a quantidade de string
        return texto.length
}

fun main() {

    /*
    // Chamada da Função

    val Converter = Converte(5)

    // Exiber valores

    println(Converter)
    */

    // Contador dos caracteres

    val resultados = letras("Kotlim Multiplataforma")
    println("A Quantidade de caracteres é: $resultados")
}