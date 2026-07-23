# Persistência com JPA e Hibernate

[![Java](https://img.shields.io/badge/Java-17-blue.svg)](https://adoptium.net/)
[![JPA](https://img.shields.io/badge/JPA-3.0-green.svg)](https://jakarta.ee/specifications/persistence/)
[![Hibernate](https://img.shields.io/badge/Hibernate-6.x-brightgreen.svg)](https://hibernate.org/)

## Sobre o Projeto

Este repositório documenta meu aprendizado no curso **"Persistência com JPA e Hibernate"** da Alura. O projeto tem como foco o estudo e a aplicação prática do padrão JPA (Java Persistence API) e do framework Hibernate, que é uma das implementações mais populares dessa especificação.

O objetivo principal é compreender como mapear objetos Java para tabelas em um banco de dados relacional de forma transparente, utilizando as anotações e configurações fornecidas pelo JPA e Hibernate para realizar operações de CRUD (Create, Read, Update, Delete) e consultas avançadas.

## Tecnologias Utilizadas

- **Java** - Linguagem de programação utilizada no projeto.
- **JPA (Java Persistence API)** - Especificação padrão para mapeamento objeto-relacional (ORM) em Java.
- **Hibernate** - Framework ORM que implementa a especificação JPA.
- **Banco de Dados** - Sistema gerenciador de banco de dados utilizado para persistência (não especificado no repositório, comumente MySQL ou PostgreSQL).
- **Maven** - Ferramenta de gerenciamento de dependências e build do projeto.
- **IDE** - Ambiente de desenvolvimento integrado, como IntelliJ IDEA (sugerido pela presença da pasta `.idea`).

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- **src/main** - Contém o código-fonte principal da aplicação.
    - Pacotes e classes Java que representam as entidades, DAOs (Data Access Objects) e a lógica de persistência.
- **pom.xml** - Arquivo de configuração do Maven, onde são declaradas as dependências do projeto, incluindo as bibliotecas do JPA, Hibernate e o driver do banco de dados.
- **.gitignore** - Arquivo que especifica quais arquivos e pastas devem ser ignorados pelo controle de versão Git.

## Funcionalidades e Conceitos Abordados

Com base no histórico de commits, o projeto explora os seguintes tópicos:

- **Importação e Configuração da Interface JPA:** Configuração inicial do projeto para utilizar a API JPA, permitindo a interação com o banco de dados.
- **Mapeamento Objeto-Relacional:** Criação de entidades Java mapeadas para tabelas no banco de dados, utilizando anotações como `@Entity`, `@Table`, `@Id` e `@GeneratedValue`.
- **Operações de Persistência:** Implementação de operações básicas para salvar, atualizar, buscar e remover objetos do banco de dados (CRUD).
- **Consultas e Filtros:** Desenvolvimento de consultas mais elaboradas utilizando a linguagem JPQL (Java Persistence Query Language) e o Criteria API, permitindo filtrar resultados com base em critérios específicos.

## Como Utilizar Este Repositório

1.  **Clone o repositório** para sua máquina local:
    ```bash
    git clone https://github.com/Gabriel-Castro4/Persistencia-com-JPA-e-Hibernate.git
    ```
2.  **Importe o projeto** para sua IDE de preferência (recomenda-se IntelliJ IDEA ou Eclipse).
3.  **Configure o banco de dados:**
    *   Certifique-se de ter um SGBD instalado e em execução.
    *   Crie um banco de dados para a aplicação.
    *   Atualize as configurações de conexão no arquivo `persistence.xml` (geralmente localizado em `src/main/resources/META-INF`), inserindo a URL, usuário e senha corretos.
4.  **Execute as classes** contendo o método `main` para testar as operações de persistência e consultas.
5.  **Acompanhe o progresso** através dos commits, cada um representando um avanço nos estudos.

## Principais Aprendizados

Este projeto proporcionou a aplicação prática de conceitos fundamentais para o desenvolvimento de aplicações com persistência de dados em Java, incluindo:

- A importância do mapeamento objeto-relacional para simplificar o acesso a dados.
- Como configurar e utilizar o JPA e Hibernate em um projeto Java com Maven.
- A criação e o uso de entidades JPA para representar tabelas do banco de dados.
- A realização de operações de persistência e a construção de consultas JPQL para recuperar dados de forma flexível.

## Referências

- [Documentação Oficial da JPA](https://jakarta.ee/specifications/persistence/)
- [Documentação do Hibernate](https://hibernate.org/documentation/)
- [Alura - Curso de Persistência com JPA e Hibernate](https://www.alura.com.br/)

## Autor

**Gabriel Castro**
- GitHub: [@Gabriel-Castro4](https://github.com/Gabriel-Castro4)
