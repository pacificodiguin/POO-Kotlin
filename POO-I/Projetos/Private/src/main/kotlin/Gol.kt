class Gol : Carro() {
    override fun injentarCombustivel() {
        super.injentarCombustivel()
        println("Injetando combustivel no TurboCompressor do Gol")
    }
}
fun main(){
    val gol = Gol()
    gol.modelo
    gol.acelerar()
    
}