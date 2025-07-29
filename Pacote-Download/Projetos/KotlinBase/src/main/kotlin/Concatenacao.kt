fun main() {
/*
    println("Meu nome é José, eu tenho 20 anos e sou Programador Android")

    var nome = "José"
    var idade = 20
    var profissao = "Programador Android"

    //Forma mais simples
    println("Meu nome é " +nome+", eu tenho " +idade+ " anos e sou "+profissao)

    //Forma mais usasdo
    println("Meu nome é $nome, eu tenho $idade anos e sou $profissao")
*/
    //Condicional

    var idade = 15

    //Definindo uma condição
    if(idade <= 4){
        println("Bebê")
    //Definindo uma outra condição
    }else if (idade <= 12){
        println("Criança")
    //Definindo uma outra condição
    } else if(idade <= 17){
        println("Adolescente")
    }else{
        println("Adulto")
    }
}