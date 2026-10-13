# ❌⭕ Jogo da Velha (LPOO) - Terminal Edition

Um jogo da velha clássico desenvolvido em Java para execução direta no terminal (CLI - Command Line Interface), criado para a disciplina de Linguagem de Programação Orientada a Objetos (LPOO).

O projeto conta com interface em linha de comando otimizada com atualização dinâmica de tela (usando sequências de escape ANSI), validação completa de jogadas, atalho de execução para Windows e controle centralizado do fluxo de partidas via `GameMaster`.

---

## 🎮 Como Jogar (Transferência da Release Pronta)

Para quem deseja apenas jogar e testar o projeto, não é necessário ter uma IDE instalada nem compilar o código.

Siga estes passos simples:

1. Acesse a seção de **[Releases](../../releases)** na barra lateral direita deste repositório.
2. Na versão mais recente (ex: `v1.0.0`), baixe os arquivos:
   * `JogoDaVelha_LPOO-main.jar` (O executável do jogo)
   * `Jogar.bat` (O atalho de inicialização para Windows)
3. Coloque ambos os arquivos na **mesma pasta** no seu computador.
4. Dê um **duplo clique em `Jogar.bat`** para iniciar a partida imediatamente.

---

## 🖥️ Execução Manual via Terminal

Caso prefira rodar o jogo diretamente pelo Prompt de Comando (CMD), PowerShell ou Terminal Linux/macOS:

```cmd
java -jar JogoDaVelha_LPOO-main.jar
```
classDiagram
    class Main {
        + main(args: String[]) void
    }

    class GameMaster {
        + iniciarAplicacao() void
        - configurarJogadores() void
        - exibirMenu() void
    }

    class JogoDaVelha {
        - tabuleiro: Tabuleiro
        - jogador1: Jogador
        - jogador2: Jogador
        - jogadorAtual: Jogador
        + JogoDaVelha(j1: Jogador, j2: Jogador)
        + iniciarPartida() void
        - alternarJogador() void
        - verificarFimDeJogo() boolean
    }

    class Tabuleiro {
        - matriz: char[][]
        + Tabuleiro()
        + exibir() void
        + fazerJogada(linha: int, coluna: int, simbolo: char) boolean
        + ePosicaoVazia(linha: int, coluna: int) boolean
        + verificarVitoria() boolean
        + eEmpate() boolean
        + limparTela() void
    }

    class Jogador {
        - nome: String
        - simbolo: char
        + Jogador(nome: String, simbolo: char)
        + getNome() String
        + getSimbolo() char
    }

    Main --> GameMaster : executa
    GameMaster --> JogoDaVelha : controla fluxo
    GameMaster "1" *-- "2" Jogador : instancia
    JogoDaVelha "1" *-- "1" Tabuleiro : contém
    JogoDaVelha "1" o-- "2" Jogador : gere turnos
