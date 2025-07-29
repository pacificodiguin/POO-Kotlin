import kotlin.math.max

open class Veiculo(val marca: String, val modelo: String, val ano: Int){

    var velocidadeAtual: Int = 0

    open fun acelerar(incremento: Int){
        if (incremento > 0){
            velocidadeAtual += incremento
            println("$marca, $modelo acelerando. Velocidade atual: $velocidadeAtual km/h")
        } else{
            println("Incremento inválido para acelerar")
        }
    }
    open fun frear(decremento: Int){
        if ( decremento > 0){

            val velocidadeAntiga = velocidadeAtual
            velocidadeAtual = max(0, velocidadeAtual - decremento)
            if (velocidadeAtual < velocidadeAntiga){
                println("$marca, $modelo freando. Velocidade atual: $velocidadeAtual km/h")
            } else if (velocidadeAntiga == 0){
            println("$marca, $modelo já está parado.")
            }
        } else {
        println("Decremento inválido para frear.")
        }
    }
    open fun exibirInformacoes(){
        println("\n---- Informações do Veículo ----")
        println("Marca: $marca")
        println("Modelo: $modelo")
        println("Ano: $ano")
        println("Velocidade Atual: $velocidadeAtual km/h")

    }
}