fun main(){
/*
    //Instanciando (criando) um objeto

    //Atribuindo valores de forma correta usando construtores
    val fiat = Carro("Vermelho",1.55,1.88)

    val ferrari = Carro("Preto", 1.22, 1.97)

    //Mostrando as Propriedades do objeto
    println("A cor do fiat é: ${fiat.cor}")
    println("A altura do fiat é: ${fiat.altura}")
    println("A largura do fiat é: ${fiat.largura}")
    println("\n")
    println("A cor do ferrari é: ${ferrari.cor}")
    println("A altura do ferrari é: ${ferrari.altura}")
    println("A largura do ferrari é: ${ferrari.largura}")
    println("\n")

    //Mostrando as Propriedades do objeto por Metódos
    fiat.mostrarDetalhes()
    ferrari.mostrarDetalhes()

    //Executando os Metódos dos objetos
    fiat.passarMarcha()
    fiat.freiar()
    ferrari.passarMarcha()
    ferrari.freiar()

    //Executando Metódo que Chama o Outro
    fiat.acoesCarro()
    ferrari.acoesCarro()

    val puk = Animal("cachorro", "castanho")
    puk.falar()
    println(puk.raca)

    val tom = Animal("cachorro", "preto")
    tom.falar()
    println(tom.raca)

    Animal("cachorro").falar()


    //Instanciando (criando) um objeto
    //Atribuindo valores de forma correta usando construtores

    val produto1 = Produto ("arroz", 2.65, 35)
    println("${produto1.nome}")
    produto1.estoque()
    produto1.valorTotal()

    val produto2 = Produto("feijao", 5.50, 0)
    println("\n${produto2.nome}")
    produto2.estoque()
    produto2.valorTotal()
    */

    val aluno1 = Aluno("joao", 12345, 7.55f, 8.90f)
    aluno1.mediaNotas()
    aluno1.situacao()

    val aluno2 = Aluno("lucas", 54321, 3.55f, 6.90f)
    aluno2.mediaNotas()
    aluno2.situacao()
}
