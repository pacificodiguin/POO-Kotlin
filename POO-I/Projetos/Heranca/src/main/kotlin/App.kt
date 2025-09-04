fun main() {
    val moto = Moto("Moto", "preta",1.68, 1.55)
    moto.detalhesVeiculo()
    moto.marchas()
    moto.grau()

    val carro =  Carro("Carro", "Azul", 1.75, 1.80)
    carro.detalhesVeiculo()
    carro.marchas()
    carro.trocarStep()
}