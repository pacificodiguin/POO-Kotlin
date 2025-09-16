/*
import java.sql.Connection
import java.sql.DriverManager
import java.util.Scanner

// Adicione sua data class Conta aqui, se ela não estiver em outro arquivo.
data class Conta(
    val numero: Int,
    val cliente: String,
    val saldo: Double
)

//Função principal que gerencia o fluxo do programa e o menu.

fun main() {
    val ler = Scanner(System.`in`)
    var conexao: Connection? = null

    try {
        // Carrega o Driver JDBC e cria a conexão fora do menu
        Class.forName("com.mysql.cj.jdbc.Driver")
        conexao = criaConexao()
        println("Conexão com o banco de dados realizada com sucesso!\n")

        // Loop do menu
        while (true) {
            exibeMenu() // Mostra as opções para o usuário
            val option = ler.nextInt()

            // As funções são chamadas de dentro do menu
            when (option) {
                1 -> criaTabela(conexao)
                2 -> insereConta(conexao, ler)
                3 -> buscaContas(conexao)
                4 -> {
                    println("Obrigado por usar o Digital Bank!")
                    conexao.close() // Fechando a conexão na saída normal
                    break
                }
                else -> println("Opção inválida! Tente novamente.")
            }
        }

    } catch (e: Exception) {
        // AGORA, QUALQUER ERRO NAS FUNÇÕES PRIVADAS VAI CAIR AQUI E ENCERRAR O PROGRAMA
        e.printStackTrace()
        println("Ocorreu um erro na operação com o banco de dados e o programa será encerrado.")
    }
    // O BLOCO FINALLY FOI REMOVIDO
}

//Imprime o menu de opções no console, conforme o layout solicitado.

fun exibeMenu() {
    println("""
            =========================================
            |      Bem vindo ao Digital Bank!       |
            |                                       |
            | [1] - Criar Tabela de Conta           |
            | [2] - Inserir Conta                   |
            | [3] - Buscar Contas                   |
            | [4] - Sair                            |
            |                                       |
            =========================================
             Escolha a sua opção:
    """.trimIndent())
}


// ESTRUTURA DAS 4 FUNÇÕES SOLICITADAS

// 1. Estabelece e retorna uma conexão com o banco de dados MySQL.
private fun criaConexao(): Connection {
    return DriverManager.getConnection("jdbc:mysql://localhost/digitalbank", "root", "")
}

// 2. Cria a tabela 'conta' no banco de dados se ela não existir.
private fun criaTabela(conexao: Connection) {
    val sql = """
        CREATE TABLE IF NOT EXISTS conta (
            numero INT PRIMARY KEY AUTO_INCREMENT,
            cliente VARCHAR(255) NOT NULL,
            saldo DOUBLE NOT NULL
        );
    """.trimIndent()

    conexao.createStatement().use { statement ->
        statement.execute(sql)
        println("Tabela 'conta' criada com sucesso ou já existente.\n")
    }
}

// 3. Solicita os dados de uma nova conta ao usuário e a insere no banco.
private fun insereConta(conexao: Connection, ler: Scanner) {
    println("\n--- Inserir Nova Conta ---")

    ler.nextLine()

    print("Digite o nome do cliente: ")
    val cliente = ler.nextLine()

    print("Digite o saldo inicial: ")
    val saldo = ler.nextDouble()

    val sql = "INSERT INTO conta (cliente, saldo) VALUES (?, ?)"

    conexao.prepareStatement(sql).use { statement ->
        statement.setString(1, cliente)
        statement.setDouble(2, saldo)

        statement.executeUpdate()
        println("Conta de '$cliente' inserida com sucesso!\n")
    }
}

// 4. Busca todas as contas registradas na tabela e as exibe no console.
private fun buscaContas(conexao: Connection) {
    val sql = "SELECT * FROM conta;"

    conexao.createStatement().use { statement ->
        val resultado = statement.executeQuery(sql)

        println("\n--- Contas Cadastradas ---")
        var encontrouContas = false
        while (resultado.next()) {
            encontrouContas = true
            val conta = Conta(
                numero = resultado.getInt("numero"),
                cliente = resultado.getString("cliente"),
                saldo = resultado.getDouble("saldo")
            )
            println(conta)
        }
        if (!encontrouContas) {
            println("Nenhuma conta encontrada.")
        }
        println("--------------------------\n")
    }
}
*/

import java.sql.Connection
import java.sql.DriverManager
import java.util.Scanner

//Função principal que gerencia o fluxo do programa e o menu.

fun main() {
    val ler = Scanner(System.`in`)
    var conexao: Connection? = null

    try {
        // Carrega o Driver JDBC e cria a conexão fora do menu
        Class.forName("com.mysql.cj.jdbc.Driver")
        conexao = criaConexao()
        println("Conexão com o banco de dados realizada com sucesso!\n")

        // Loop do menu
        while (true) {
            exibeMenu() // Mostra as opções para o usuário
            val option = ler.nextInt()

            // As funções são chamadas de dentro do menu
            when (option) {
                1 -> criaTabela(conexao)
                2 -> insereConta(conexao, ler)
                3 -> buscaContas(conexao)
                4 -> {
                    println("Obrigado por usar o Digital Bank!")
                    break
                }
                else -> println("Opção inválida! Tente novamente.")
            }
        }

    } catch (e: Exception) {
        e.printStackTrace()
        println("Não foi possível conectar com o banco de dados.")
    } finally {
        conexao?.close()
    }
}

//Imprime o menu de opções no console, conforme o layout solicitado.

fun exibeMenu() {
    println("""
            =========================================
            |      Bem vindo ao Digital Bank!       |
            |                                       |
            | [1] - Criar Tabela de Conta           |
            | [2] - Inserir Conta                   |
            | [3] - Buscar Contas                   |
            | [4] - Sair                            |
            |                                       |
            =========================================
             Escolha a sua opção:
    """.trimIndent())
}


// ESTRUTURA DAS 4 FUNÇÕES SOLICITADAS

// 1. Estabelece e retorna uma conexão com o banco de dados MySQL.
private fun criaConexao(): Connection {
    return DriverManager.getConnection("jdbc:mysql://localhost/digitalbank", "root", "")
}

// 2. Cria a tabela 'conta' no banco de dados se ela não existir.

private fun criaTabela(conexao: Connection) {
    // Adicionado AUTO_INCREMENT para a coluna 'numero'
    val sql = """
        CREATE TABLE IF NOT EXISTS conta (
            numero INT PRIMARY KEY AUTO_INCREMENT,
            cliente VARCHAR(255) NOT NULL,
            saldo DOUBLE NOT NULL
        );
    """.trimIndent()

    try {
        conexao.createStatement().use { statement ->
            statement.execute(sql)
            println("Tabela 'conta' criada com sucesso ou já existente.\n")
        }
    } catch (e: Exception) {
        println("Erro ao criar a tabela.")
        e.printStackTrace()
    }
}

// 3. Solicita os dados de uma nova conta ao usuário e a insere no banco.

private fun insereConta(conexao: Connection, ler: Scanner) {
    try {
        println("\n--- Inserir Nova Conta ---")

        ler.nextLine()

        print("Digite o nome do cliente: ")
        val cliente = ler.nextLine()

        print("Digite o saldo inicial: ")
        val saldo = ler.nextDouble()

        val sql = "INSERT INTO conta (cliente, saldo) VALUES (?, ?)"

        conexao.prepareStatement(sql).use { statement ->
            statement.setString(1, cliente)
            statement.setDouble(2, saldo)

            statement.executeUpdate()
            println("Conta de '$cliente' inserida com sucesso!\n")
        }
    } catch (e: Exception) {
        println("Erro ao inserir conta.")
        e.printStackTrace()
    }
}

// 4. Busca todas as contas registradas na tabela e as exibe no console.

private fun buscaContas(conexao: Connection) {
    val sql = "SELECT * FROM conta;"

    try {
        conexao.createStatement().use { statement ->
            val resultado = statement.executeQuery(sql)

            println("\n--- Contas Cadastradas ---")
            var encontrouContas = false
            while (resultado.next()) {
                encontrouContas = true
                val conta = Conta(
                    numero = resultado.getInt("numero"),
                    cliente = resultado.getString("cliente"),
                    saldo = resultado.getDouble("saldo")
                )
                println(conta)
            }
            if (!encontrouContas) {
                println("Nenhuma conta encontrada.")
            }
            println("--------------------------\n")
        }
    } catch (e: Exception) {
        println("Erro ao buscar as contas.")
        e.printStackTrace()
    }
}