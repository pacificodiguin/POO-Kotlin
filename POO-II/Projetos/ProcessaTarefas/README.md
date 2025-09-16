# Projeto Processador de Tarefas - POO II

Este é um projeto para gerenciar uma lista de tarefas diárias, conectando a um banco de dados MySQL.

## Como Executar o Projeto

1.  **Clone o repositório.**
2.  **Abra o projeto** no IntelliJ IDEA.
3.  **Crie um banco de dados** no seu MySQL com o nome `atividades`.
4.  **Execute a função `main`**. No primeiro uso, escolha a **opção 1** no menu para criar a tabela `tarefas` automaticamente.

## Estrutura do Banco de Dados

- **Banco de Dados:** `atividades`
- **Tabela:** `tarefas`
- **Script de Criação da Tabela:**
  ```sql
  CREATE TABLE IF NOT EXISTS tarefas (
      id INT PRIMARY KEY AUTO_INCREMENT,
      nome VARCHAR(255) NOT NULL,
      detalhes VARCHAR(255),
      responsavel VARCHAR(255) NOT NULL,
      prioridade INT,
      encerrada BOOLEAN NOT NULL
  );
  ```