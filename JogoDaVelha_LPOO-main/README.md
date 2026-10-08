# ❌⭕ Jogo da Velha (Tic-Tac-Toe) - Checkpoint 1

Projeto desenvolvido para a disciplina de **LPOO (Linguagem de Programação Orientada a Objetos)**. O objetivo é implementar um jogo da velha interativo em Java via terminal, aplicando conceitos fundamentais de Orientação a Objetos e boas práticas de arquitetura.

## 🏗️ Arquitetura do Projeto

O projeto foi estruturado buscando a separação de responsabilidades e desacoplamento de código:

- **`Main`**: Ponto de entrada da aplicação.
- **`GameMaster`**: Orquestrador do jogo. Responsável pelo fluxo principal, alternância de turnos e interação de I/O com o utilizador via `Scanner`.
- **`Tabuleiro`**: Encapsula a matriz 3x3, valida jogadas e contém a lógica otimizada de detecção de vitória (linhas, colunas e diagonais) e empate.
- **`Jogador`**: Classe POJO que representa o jogador (nome e símbolo).

## 🚀 Como Executar

### Pré-requisitos
- Git
- Java JDK 17 ou superior.

### Passo a passo
1. Clona o repositório:
   ```bash
   git clone https://github.com/S0bral/JogoDaVelha_LPOO.git

2. Entre na pasta onde estão localizados os arquivos do jogo e de os seguintes comandos:

   ```bash
   cd src
   javac Main.java
   java Main
        
