fun sum(a: Int, b: Int): Int {
    return a + b
}

fun helloWolrd(nome: String){
    println("Olá, $nome")
}
fun hiwolrd(nome: String): String{
    return "Olá, $nome"
}
fun wolrd(){
    println("Olá, mundo")
}
fun hiwolrd1(): String{
    return "Olá, mundo"
}
fun main(){
    val result = sum(1,2)
    println(result)

    helloWolrd("Kotlin")

    val msg = hiwolrd("Kotlin")
    println(msg)

    wolrd()

    val msg1 = hiwolrd1()
    println(msg1)
}