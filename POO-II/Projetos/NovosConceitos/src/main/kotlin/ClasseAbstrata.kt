abstract class Animal {
    // Atriburo abstrato (deve ser implementado pelas subclasses).
    abstract val nome: String

    // Método abstrato (deve ser implementado pelas subclasses).
    abstract fun fazerSom()

    // Método concreto (herdados pelas subclasses, pode ser sobrescrito).
    fun dormir(){
        println("$nome está dormindo.")
    }

    }

class Cachorro(override val nome: String): Animal(){
    override fun fazerSom() {
        println("Au, Au !")
    }
}
class Gato(override val nome: String): Animal(){
    override fun fazerSom() {
        println("Miau, Miau!")
    }
}

fun main(){
    // Não Podemos Instanciar Animal Diretamente
    // val animal = Animal()

    val cachorro = Cachorro("Rex")
    val gato = Gato("Mingau")

    cachorro.fazerSom() // Saída: Au, Au!
    gato.fazerSom() // Saída: Miau, Miau!

    cachorro.dormir() // Saída: Rex está dormindo.
    gato.dormir() // Saída: Mingau está dormindo.

}