# ❌⭕ Jogo da Velha (LPOO) - Terminal Edition

Um jogo da velha clássico desenvolvido em Java para execução direta no terminal (CLI - Command Line Interface), criado para a disciplina de Linguagem de Programação Orientada a Objetos (LPOO).

O projeto conta com interface em linha de comando otimizada com atualização dinâmica de tela (usando sequências de escape ANSI), validação completa de jogadas e detecção automática de vitória/empate.

---

## 🎮 Como Jogar (Download da Release Pronta)

Para quem deseja apenas jogar e testar o projeto, não é necessário configurar o IntelliJ.

Siga estes passos simples:

1.  Acesse a seção de **[Releases](../../releases)** na barra lateral direita deste repositório.
2.  Na versão mais recente (ex: `v1.0.0`), baixe os arquivos:
    *   `JogoDaVelha_LPOO-main.jar` (O executável do jogo)
    *   `Jogar.bat` (O atalho para Windows)
3.  Coloque ambos os arquivos na **mesma pasta** no seu computador.
4.  Dê um **duplo clique em `Jogar.bat`** para iniciar a partida imediatamente.

---

## 📐 Diagrama de Classes UML (Organização)

O projeto foi estruturado com base em princípios de POO. Abaixo está o diagrama de classes detalhado, mostrando as principais classes, seus métodos e como elas se relacionam (agregam e gerenciam).

Este diagrama corresponde à versão mais recente e organizada do projeto.

<p align="center">
  <img src="https://raw.githubusercontent.com/SEU_USUARIO/SEU_REPOSITORIO/main/caminho/para/imagem_12.png" alt="Diagrama de Classes Jogo da Velha (LPOO)" width="100%" />
</p>

*Onde `SEU_USUARIO/SEU_REPOSITORIO` deve ser substituído pelo caminho do seu repositório real e o caminho para a imagem.*

### Detalhes do Diagrama:

-   **`Main`**: Ponto de entrada que instancia e executa o jogo.
-   **`JogoDaVelha`**: Classe central que controla o fluxo da partida (alterna turnos, verifica fim de jogo). *Agrega* um `Tabuleiro` e *gerencia* dois `Jogador`es.
-   **`Tabuleiro`**: Responsável por armazenar a matriz do jogo, exibir a interface e validar as jogadas (limpa a tela, verifica vitória e empate).
-   **`Jogador`**: Representa um participante com um nome e símbolo (X ou O).

---

## ✨ Funcionalidades e Requisitos

-   **Interface Dinâmica:** Limpeza automática do ecrã a cada rodada (via ANSI Escape Codes).
-   **Validação de Jogadas:** Impede entradas inválidas ou tentativas de jogar em posições ocupadas.
-   **Detecção Automática:** Identificação instantânea de vitória (linhas, colunas, diagonais) ou de empate (*velha*).
-   **Iniciador Windows:** Script `.bat` para usuários finais.

### Requisito do Sistema:

*   É necessário ter o **Java 21** ou superior (JDK/JRE) instalado e configurado nas variáveis de ambiente.

---

## 💻 Para Desenvolvedores (Rodar o Código-Fonte)

Se você deseja clonar e modificar o projeto:

1.  Clone o repositório:
    ```bash
    git clone [https://github.com/S0bral/JogoDaVelha_LPOO.git](https://github.com/S0bral/JogoDaVelha_LPOO.git)
    ```
2.  Abra a pasta do projeto no **IntelliJ IDEA**.
3.  Verifique em `File -> Project Structure` se o SDK está configurado para **Java 21 ou 23**.
4.  Execute a classe `Main.java` para rodar ou `Build -> Rebuild Artifacts` para gerar um novo `.jar`.
