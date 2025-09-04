open class Carro(){
    var modelo = ""

    protected open fun injentarCombustivel(){
        println("Injeção de Combustivel")
    }
    fun acelerar(){
        injentarCombustivel()
        println("Acelerar carro $modelo")
    }
}
