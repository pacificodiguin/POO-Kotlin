open class Veiculo(tipoV: String, corV: String, alturaV: Double, larguraV: Double) {

    var tipo: String = ""
    var cor: String = ""
    var altura: Double? = null
    var largura: Double? = null

    init {

        this.tipo = tipoV
        this.cor = corV
        this.altura = alturaV
        this.largura = larguraV

    }

    fun detalhesVeiculo(){
        println("O veículo é um(a) $tipo, tem a cor $cor, tem altura de $altura e a largura de $largura")
    }

    fun primeiraMarchaV(){
        println("Passando a primeira marcha...")
    }
    fun segundaMarchaV(){
        println("Passando a segunda marcha...")
    }

    fun marchas(){
        this.primeiraMarchaV()
        this.segundaMarchaV()
    }

}
