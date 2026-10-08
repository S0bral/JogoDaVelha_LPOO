public class Tabuleiro {

    private String[][] tabuleiro;

    public Tabuleiro() {
        this.tabuleiro = new String[3][3];


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.tabuleiro[i][j] = " ";
            }
        }
    }

    public void imprimirTabuleiro() {
        System.out.println("    1   2   3");

        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + "   ");

            for (int j = 0; j < 3; j++) {
                System.out.print(this.tabuleiro[i][j]);

                if (j < 2) {
                    System.out.print(" | ");
                }
            }

            System.out.println();

            if (i < 2) {
                System.out.println("   ---+---+---");
            }
        }
    }

    public boolean fazerJogada(int linha, int coluna, String simbolo) {
            if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && this.tabuleiro[linha][coluna].equals(" ")) {
                this.tabuleiro[linha][coluna] = simbolo;
                return true;
            }
            else{
                return false;
            }
    }

    public boolean condicaoVitoria(String simbolo) {
        for (int i = 0; i < 3; i++) {
            if ((this.tabuleiro[i][0].equals(simbolo) && this.tabuleiro[i][1].equals(simbolo) && this.tabuleiro[i][2].equals(simbolo)) || (this.tabuleiro[0][i].equals(simbolo) && this.tabuleiro[1][i].equals(simbolo) && this.tabuleiro[2][i].equals(simbolo))) {
                return true;
            }
        }
        if (this.tabuleiro[0][0].equals(simbolo) && this.tabuleiro[1][1].equals(simbolo) && this.tabuleiro[2][2].equals(simbolo)) {
            return true;
        }
        if (this.tabuleiro[0][2].equals(simbolo) && this.tabuleiro[1][1].equals(simbolo) && this.tabuleiro[2][0].equals(simbolo)) {
            return true;
        }
        return false;
    }

    public boolean verificarEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.tabuleiro[i][j].equals(" ")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void limparTelaSimples() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }


}
