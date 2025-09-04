class Animal (especie: String, cor: String) {

    var raca: String = ""
    var fala: String = ""

    init {
        if (especie == "cachorro") {
            fala = "au"

        } else if (especie == "gato") {
            fala = "miau"

        } else fala = ""
    }

    init {
        if (especie == "cachorro" && cor == "preto"){
            raca = "Pastor Alemão"
        } else if (especie == "cachorro" && cor == "castanho"){
            raca = "Yorkshire"
        } else raca = "Vira-Lata"
    }

    fun falar() {
        println(fala)
    }



}