fun main(){

    val idade = 19
    val Convite = "luxo"
    val codigoConvite = "XL1234"

    if (idade< 18){
        println("Negado, Menores de idade nao sao permitido")
        return
    }

    if(Convite != "comum" && Convite != "premium" && Convite != "luxo"){
        println("Negado, Convite invalido")
        return
    }

    val prefixo = when (Convite){
        "comum" -> "XT"
        "premium","luxo" -> "XL"
        else -> ""
    }
    if (!codigoConvite.startsWith(prefixo)){
        println("Negado, Convite invalido")
        return
    }

    println("Welcome!")

}