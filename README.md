# Copa GC

## Descrição do Projeto
O sistema **Copa GC** é uma solução de gerenciamento de campeonatos de futebol, desenvolvida para organizar seleções, registrar partidas e acompanhar a artilharia de forma automatizada via console.

## Integrantes
* Integrante 1 (João Vitor)
* Integrante 2 (José Fernando)
* Integrante 3 (Elias Manuel)

## Estrutura de Pacotes
O sistema está organizado na seguinte estrutura de diretórios e classes:
* `src/model/`: Contém as classes de modelo de dados (`Selecao.java`, `Partida.java`).
* `src/service/`: Contém a classe central com as regras de negócio e listas (`Copa.java`).
* `src/util/`: Contém a classe responsável por popular o sistema com dados fictícios (`CargaInicial.java`).
* `src/`: (Raiz) Contém o ponto de entrada do sistema e o menu interativo (`Main.java`).

## Como Executar
Para rodar o projeto, compile as classes e execute o `Main`:

1. Abra o terminal na pasta raiz do projeto.
2. Compile o código: `javac src/model/*.java src/service/*.java src/util/*.java src/Main.java`
3. Execute o sistema: `java -cp src Main`

## Tecnologias Utilizadas
* Java (Linguagem principal)
* Git/GitHub (Versionamento e controle de fluxo)