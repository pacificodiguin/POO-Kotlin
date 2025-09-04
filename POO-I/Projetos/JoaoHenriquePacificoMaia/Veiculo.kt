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

    fun ehAntigo(): Boolean {
        return ano < 2000
    }

}

