class Carro(tipoV: String, corV: String, alturaV: Double, larguraV: Double)
    : Veiculo(tipoV,corV,alturaV,larguraV) {

    fun trocarStep(){
        println("Trocando o step...\n")
    }

}