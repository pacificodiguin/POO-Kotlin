fun main(){
    val paciente = Paciente( "João", 19)

    paciente.adicionarConsulta("Consulta 1 - Exame de Sangue")
    paciente.adicionarConsulta("Consulta 2 - Consulta de Rotina")
    paciente.adicionarConsulta("Consulta 3 - Check up Cardiaco")

    paciente.exibirConsultas()
}