import kotlin.random.Random
import java.util.Scanner

class Adivinha {
    fun iniciajogo() {
        val numeropensado = Random.nextInt(1, 11)
        println(numeropensado)
        val scanner = Scanner(System.`in`)
        var tentativas = 5

        println("Tente adivinhar o numero da maquina de 1 a 10")

        while (tentativas > 0) {
            println("Digite seu palpite:")
            val numero = scanner.nextInt()

            if (numero == numeropensado) {
                println("Parabens você acertou!!")
                return
            } else {
                tentativas--
                if (numero < numeropensado){
                println("Voce errou, $numero é menor que o número pensado\n")
                } else{
                    println("Você errou, $numero é maior que o número pensado\n")
                }
            }
            if(tentativas > 0){
                println("O seu numero de tentativas restantes são: $tentativas.\n")
            } else{
                println("Você errou, o numero pensado era $numeropensado")
            }
        }

    }
}
