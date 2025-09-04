open class Veiculo(val marca: String, val modelo: String, private val ano: Int) {

    // Metodo sem argumento
    open fun exibirDetalhes() {
        println("Marca: $marca, Modelo: $modelo")
    }

    // Metodo com argumento (sobrecarga)
    open fun exibirDetalhes(mostrarAno: Boolean) {
        print("Marca: $marca, Modelo: $modelo")
        if (mostrarAno) {
            print(", Ano: $ano")
        }
        println()
    }

    // Metodo para verificar se o veiculo e antigo
    fun Antigo(): Boolean {
        return ano < 2000
    }

}

