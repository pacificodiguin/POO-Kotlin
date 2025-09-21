// Código sem validação
/*
import java.sql.Connection
import java.sql.DriverManager
import java.util.Scanner

fun main() {
    val ler = Scanner(System.`in`)
    var conexao: Connection? = null

    try {
        // A função criaConexao() é chamada para estabelecer a conexão.
        conexao = criaConexao()
        println("Conexão com o banco de dados 'atividades' realizada com sucesso!\n")

        while (true) {
            exibeMenu() // Mostra o menu de opções para o usuário.
            print("Escolha a sua opção: ")
            val opcao = ler.nextInt()

            when (opcao) {
                1 -> criaTabela(conexao)
                2 -> insereTarefa(conexao, ler)
                3 -> encerraTarefa(conexao, ler)
                4 -> excluiTarefa(conexao, ler)
                5 -> listaTarefasAbertas(conexao)
                6 -> listaTarefasEncerradas(conexao)
                7 -> listaTarefasPrioridade(conexao)
                8 -> {
                    println("Saindo do sistema...")
                    conexao.close()
                    break
                }
                else -> println("Opção inválida, tente novamente.")
            }
        }
    } catch (e: Exception) {
        println("Ocorreu um erro fatal na aplicação.")
        e.printStackTrace()
    }
}


fun exibeMenu() {
    println("""
        =========================================
        |          Controle de tarefas          |
        |                                       |
        | [1] - Criar tabela de Tarefas         |
        | [2] - Inserir tarefa                  |
        | [3] - Encerrar tarefa                 |
        | [4] - Excluir tarefa                  |
        | [5] - Listar tarefas abertas          |
        | [6] - Listar tarefas encerradas       |
        | [7] - Listar tarefas por prioridade   |
        | [8] - Sair                            |
        =========================================
    """.trimIndent())
}


private fun criaConexao(): Connection {
    Class.forName("com.mysql.cj.jdbc.Driver")
    return DriverManager.getConnection("jdbc:mysql://localhost/atividades", "root", "")
}


private fun criaTabela(conexao: Connection) {
    val sql = """
        CREATE TABLE IF NOT EXISTS tarefas (
            id INT PRIMARY KEY AUTO_INCREMENT,
            nome VARCHAR(255) NOT NULL,
            detalhes VARCHAR(255),
            responsavel VARCHAR(255) NOT NULL,
            prioridade INT,
            encerrada BOOLEAN NOT NULL
        );
    """.trimIndent()

    conexao.createStatement().use { it.execute(sql) }
    println("Tabela 'tarefas' criada com sucesso ou já existente.\n")
}

private fun insereTarefa(conexao: Connection, ler: Scanner) {

    ler.nextLine() // Limpa o buffer do scanner
    println("\n--- Inserir Nova Tarefa ---")
    print("Nome da tarefa: ")
    val nome = ler.nextLine()
    print("Detalhes: ")
    val detalhes = ler.nextLine()
    print("Responsável: ")
    val responsavel = ler.nextLine()

    // --- VALIDAÇÃO DA PRIORIDADE (MANTIDA) ---
    var prioridade: Int
    while (true) {
        print("Prioridade (1 a 5): ")
        val inputPrioridade = ler.nextInt()
        // Verifica se o número está no intervalo de 1 a 5
        if (inputPrioridade in 1..5) {
            prioridade = inputPrioridade
            break // Sai do loop se o valor for válido
        } else {
            println("Valor inválido! A prioridade deve ser um número entre 1 e 5. Tente novamente.")
        }
    }
    // --- FIM DA VALIDAÇÃO ---

    val sql = "INSERT INTO tarefas (nome, detalhes, responsavel, prioridade, encerrada) VALUES (?, ?, ?, ?, ?)"
    conexao.prepareStatement(sql).use { statement ->
        statement.setString(1, nome)
        statement.setString(2, detalhes)
        statement.setString(3, responsavel)
        statement.setInt(4, prioridade)
        statement.setBoolean(5, false)
        statement.executeUpdate()
        println("Tarefa '$nome' inserida com sucesso!\n")
    }
}


private fun encerraTarefa(conexao: Connection, ler: Scanner) {
    print("Digite o ID da tarefa que deseja encerrar: ")
    val id = ler.nextInt()

    val sql = "UPDATE tarefas SET encerrada = true WHERE id = ?"
    conexao.prepareStatement(sql).use { statement ->
        statement.setInt(1, id)
        val linhasAfetadas = statement.executeUpdate()
        if (linhasAfetadas > 0) {
            println("Tarefa ID $id marcada como encerrada com sucesso!\n")
        } else {
            println("Nenhuma tarefa encontrada com o ID $id.\n")
        }
    }
}


private fun excluiTarefa(conexao: Connection, ler: Scanner) {
    print("Digite o ID da tarefa que deseja excluir: ")
    val id = ler.nextInt()

    val sql = "DELETE FROM tarefas WHERE id = ?"
    conexao.prepareStatement(sql).use { statement ->
        statement.setInt(1, id)
        val linhasAfetadas = statement.executeUpdate()
        if (linhasAfetadas > 0) {
            println("Tarefa ID $id excluída com sucesso!\n")
        } else {
            println("Nenhuma tarefa encontrada com o ID $id.\n")
        }
    }
}


private fun listaTarefasAbertas(conexao: Connection) {
    println("\n--- Tarefas Abertas ---")
    val sql = "SELECT * FROM tarefas WHERE encerrada = false"
    listarTarefas(conexao, sql)
}


private fun listaTarefasEncerradas(conexao: Connection) {
    println("\n--- Tarefas Encerradas ---")
    val sql = "SELECT * FROM tarefas WHERE encerrada = true"
    listarTarefas(conexao, sql)
}


private fun listaTarefasPrioridade(conexao: Connection) {
    println("\n--- Todas as Tarefas por Prioridade ---")
    val sql = "SELECT * FROM tarefas ORDER BY prioridade DESC"
    listarTarefas(conexao, sql)
}


private fun listarTarefas(conexao: Connection, sql: String) {
    conexao.createStatement().use { statement ->
        val resultado = statement.executeQuery(sql)
        var encontrouTarefas = false
        while (resultado.next()) {
            encontrouTarefas = true
            // Supondo que a data class Tarefa está em outro arquivo
            // e tem o construtor correto.
            val tarefa = Tarefa(
                id = resultado.getInt("id"),
                nome = resultado.getString("nome"),
                detalhes = resultado.getString("detalhes"),
                responsavel = resultado.getString("responsavel"),
                prioridade = resultado.getInt("prioridade"),
                encerrada = resultado.getBoolean("encerrada")
            )
            println(tarefa)
        }
        if (!encontrouTarefas) {
            println("Nenhuma tarefa encontrada.")
        }
        println("--------------------------\n")
    }
}
*/

// Código com validação

import java.sql.Connection
import java.sql.DriverManager
import java.util.Scanner

fun main() {
    val ler = Scanner(System.`in`)
    var conexao: Connection? = null

    try {
        // A função criaConexao() é chamada para estabelecer a conexão.
        conexao = criaConexao()
        println("Conexão com o banco de dados 'atividades' realizada com sucesso!\n")

        while (true) {
            exibeMenu() // Mostra o menu de opções para o usuário.
            print("Escolha a sua opção: ")
            val opcao = ler.nextInt()

            when (opcao) {
                1 -> criaTabela(conexao)
                2 -> insereTarefa(conexao, ler)
                3 -> encerraTarefa(conexao, ler)
                4 -> excluiTarefa(conexao, ler)
                5 -> listaTarefasAbertas(conexao)
                6 -> listaTarefasEncerradas(conexao)
                7 -> listaTarefasPrioridade(conexao)
                8 -> {
                    println("Saindo do sistema...")
                    conexao.close()
                    break
                }
                else -> println("Opção inválida, tente novamente.")
            }
        }
    } catch (e: Exception) {
        println("Ocorreu um erro fatal na aplicação.")
        e.printStackTrace()
    }
}

// Exibe o menu principal do controle de tarefas.

fun exibeMenu() {
    println("""
        =========================================
        |          Controle de tarefas          |
        |                                       |
        | [1] - Criar tabela de Tarefas         |
        | [2] - Inserir tarefa                  |
        | [3] - Encerrar tarefa                 |
        | [4] - Excluir tarefa                  |
        | [5] - Listar tarefas abertas          |
        | [6] - Listar tarefas encerradas       |
        | [7] - Listar tarefas por prioridade   |
        | [8] - Sair                            |
        =========================================
    """.trimIndent())
}

//Cria a conexão com o banco de dados MySQL chamado 'atividades'.

private fun criaConexao(): Connection {
    Class.forName("com.mysql.cj.jdbc.Driver")
    return DriverManager.getConnection("jdbc:mysql://localhost/atividades", "root", "")
}

//Cria a tabela 'tarefas' no banco de dados.

private fun criaTabela(conexao: Connection) {
    val sql = """
        CREATE TABLE IF NOT EXISTS tarefas (
            id INT PRIMARY KEY AUTO_INCREMENT,
            nome VARCHAR(255) NOT NULL,
            detalhes VARCHAR(255),
            responsavel VARCHAR(255) NOT NULL,
            prioridade INT,
            encerrada BOOLEAN NOT NULL
        );
    """.trimIndent()

    try {
        conexao.createStatement().use { it.execute(sql) }
        println("Tabela 'tarefas' criada com sucesso ou já existente.\n")
    } catch (e: Exception) {
        println("Erro ao criar a tabela 'tarefas'.")
        e.printStackTrace()
    }
}

//Insere uma nova tarefa no banco de dados.
//O campo 'encerrada' é definido como 'false' por padrão.

private fun insereTarefa(conexao: Connection, ler: Scanner) {
    try {
        ler.nextLine()
        println("\n--- Inserir Nova Tarefa ---")
        print("Nome da tarefa: ")
        val nome = ler.nextLine()
        print("Detalhes: ")
        val detalhes = ler.nextLine()
        print("Responsável: ")
        val responsavel = ler.nextLine()

        // --- VALIDAÇÃO DA PRIORIDADE ---
        var prioridade: Int
        while (true) {
            print("Prioridade (1 a 5): ")
            val inputPrioridade = ler.nextInt()
            // Verifica se o número está no intervalo de 1 a 5
            if (inputPrioridade in 1..5) {
                prioridade = inputPrioridade
                break // Sai do loop se o valor for válido
            } else {
                println("Valor inválido! A prioridade deve ser um número entre 1 e 5. Tente novamente.")
            }
        }
        // --- FIM DA VALIDAÇÃO ---

        val sql = "INSERT INTO tarefas (nome, detalhes, responsavel, prioridade, encerrada) VALUES (?, ?, ?, ?, ?)"
        conexao.prepareStatement(sql).use { statement ->
            statement.setString(1, nome)
            statement.setString(2, detalhes)
            statement.setString(3, responsavel)
            statement.setInt(4, prioridade)
            statement.setBoolean(5, false)
            statement.executeUpdate()
            println("Tarefa '$nome' inserida com sucesso!\n")
        }
    } catch (e: Exception) {
        println("Erro ao inserir tarefa. Verifique se digitou os dados corretamente.")
        e.printStackTrace()
    }
}

// Pede o ID de uma tarefa e a marca como encerrada (true).
private fun encerraTarefa(conexao: Connection, ler: Scanner) {
    try {
        print("Digite o ID da tarefa que deseja encerrar: ")
        val id = ler.nextInt()

        val sql = "UPDATE tarefas SET encerrada = true WHERE id = ?"
        conexao.prepareStatement(sql).use { statement ->
            statement.setInt(1, id)
            val linhasAfetadas = statement.executeUpdate()
            if (linhasAfetadas > 0) {
                println("Tarefa ID $id marcada como encerrada com sucesso!\n")
            } else {
                println("Nenhuma tarefa encontrada com o ID $id.\n")
            }
        }
    } catch (e: Exception) {
        println("Erro ao encerrar tarefa.")
        e.printStackTrace()
    }
}

// Pede o ID de uma tarefa e a exclui do banco de dados.
private fun excluiTarefa(conexao: Connection, ler: Scanner) {
    try {
        print("Digite o ID da tarefa que deseja excluir: ")
        val id = ler.nextInt()

        val sql = "DELETE FROM tarefas WHERE id = ?"
        conexao.prepareStatement(sql).use { statement ->
            statement.setInt(1, id)
            val linhasAfetadas = statement.executeUpdate()
            if (linhasAfetadas > 0) {
                println("Tarefa ID $id excluída com sucesso!\n")
            } else {
                println("Nenhuma tarefa encontrada com o ID $id.\n")
            }
        }
    } catch (e: Exception) {
        println("Erro ao excluir tarefa.")
        e.printStackTrace()
    }
}

// Lista todas as tarefas com o campo 'encerrada' como false.
private fun listaTarefasAbertas(conexao: Connection) {
    println("\n--- Tarefas Abertas ---")
    val sql = "SELECT * FROM tarefas WHERE encerrada = false"
    listarTarefas(conexao, sql)
}

//  Lista todas as tarefas com o campo 'encerrada' como true.
private fun listaTarefasEncerradas(conexao: Connection) {
    println("\n--- Tarefas Encerradas ---")
    val sql = "SELECT * FROM tarefas WHERE encerrada = true"
    listarTarefas(conexao, sql)
}

// Lista todas as tarefas, ordenadas por prioridade (da maior para a menor).
private fun listaTarefasPrioridade(conexao: Connection) {
    println("\n--- Todas as Tarefas por Prioridade ---")
    val sql = "SELECT * FROM tarefas ORDER BY prioridade DESC"
    listarTarefas(conexao, sql)
}

// Função auxiliar genérica para executar uma query SELECT e exibir os resultados.
private fun listarTarefas(conexao: Connection, sql: String) {
    try {
        conexao.createStatement().use { statement ->
            val resultado = statement.executeQuery(sql)
            var encontrouTarefas = false
            while (resultado.next()) {
                encontrouTarefas = true
                val tarefa = Tarefa(
                    id = resultado.getInt("id"),
                    nome = resultado.getString("nome"),
                    detalhes = resultado.getString("detalhes"),
                    responsavel = resultado.getString("responsavel"),
                    prioridade = resultado.getInt("prioridade"),
                    encerrada = resultado.getBoolean("encerrada")
                )
                println(tarefa)
            }
            if (!encontrouTarefas) {
                println("Nenhuma tarefa encontrada.")
            }
            println("--------------------------\n")
        }
    } catch (e: Exception) {
        println("Erro ao listar tarefas.")
        e.printStackTrace()
    }
}