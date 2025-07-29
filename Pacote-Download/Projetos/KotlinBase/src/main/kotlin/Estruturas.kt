fun main() {
    var listaCompras = arrayOf("arroz", "Feijão", "Batata", "Banana", "Leite")
    var indice = 0

    //Estrutura de repetição - while(enquanto)
    while (indice <= 4){
        println(listaCompras[indice])
    indice=indice+1
    }
    while (indice < listaCompras.size){
        println(listaCompras[indice])
        indice++
    }
    //Estrutura For (para)
    // Para p indice de 0 a 4
    for (indice in 0..4){
        println(listaCompras[indice])
    }
    //PErcorrendo o intervalo de inteiros
    for (i in 1..10){
        print("$i ")
    }
    print(("\n"))

    val str: String = "Kotlin é show"
    for(letra in str){
        println(("$letra"))
    }
    print(("\n"))

    for (i in 1..10 step 3){
        print("$i ")
    }
    print(("\n"))

    for (i in 0..20 step 2){
        print("$i ")
    }
    print(("\n"))
}