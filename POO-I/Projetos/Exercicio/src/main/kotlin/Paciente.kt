class Paciente(val nome: String, var idade: Int) {

    val historicoconsulta = arrayOfNulls<String>(10)
    var quantidadeconsulta = 0

    // Metódo pra adicionar nova consulta no histórico.
    fun adicionarConsulta(consulta: String) {

        if (quantidadeconsulta < historicoconsulta.size) {
            historicoconsulta[quantidadeconsulta] = consulta
            quantidadeconsulta++

        } else {
            println("Não é possivel adicionar mais consulta. Histórico está cheio!")
        }
    }

    fun exibirConsultas() {
        println("Histórico de Consultas do paciente $nome:")
        if (quantidadeconsulta == 0) {
            println("Nenhuma consulta realizada.")
        } else {
            for (i in 0 until quantidadeconsulta) {
                println("${i + 1}. ${historicoconsulta[i]}")
            }
        }
    }

}