# Projeto Digital Bank - POO II

Este projeto é um sistema bancário simples em Kotlin que se conecta a um banco de dados MySQL para gerenciar contas.

## Como Executar

1.  **Clone o repositório.**
2.  **Abra o projeto** no IntelliJ IDEA.
3.  **Crie um banco de dados** no seu MySQL com o nome `digitalbank`.
4.  **Execute a função `main`**. Na primeira vez, use a **opção 1** do menu para que o programa crie a tabela `conta` para você.

## Estrutura do Banco de Dados

-   **Nome do Banco:** `digitalbank`
-   **Script de Criação da Tabela:**
    ```sql
    CREATE TABLE IF NOT EXISTS conta (
        numero INT PRIMARY KEY AUTO_INCREMENT,
        cliente VARCHAR(255) NOT NULL,
        saldo DOUBLE NOT NULL
    );
    ```