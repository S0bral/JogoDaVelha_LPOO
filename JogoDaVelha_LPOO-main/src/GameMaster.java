import java.util.Scanner;

public class GameMaster {

   private Tabuleiro tabuleiro1;
   private Jogador jogador1;
   private Jogador jogador2;
   private Jogador jogadorAtual;

   public GameMaster(){
       this.tabuleiro1 = new Tabuleiro();
       this.jogador1 = new Jogador("jogador1", "X");
       this.jogador2 = new Jogador("jogador2","O");
       this.jogadorAtual = jogador1;
   }
   public void iniciar(){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Digite o nome do primeiro jogador: ");
       String nomeJogador1 = scanner.next();
       System.out.println("Digite o nome do segundo jogador: ");
       String nomeJogador2 = scanner.next();

       jogador1 = new Jogador(nomeJogador1, "X");
       jogador2 = new Jogador(nomeJogador2, "O");

       jogadorAtual = jogador1;

       while(true){

           Tabuleiro.limparTelaSimples();

           tabuleiro1.imprimirTabuleiro();

           System.out.println("O jogador atual é:" + jogadorAtual.getJogador());

           System.out.println("Digite o número da linha(1-3)");
           int linha = scanner.nextInt()-1;

           System.out.println("Digite o número da coluna(1-3)");
           int coluna = scanner.nextInt()-1;

           boolean jogadaValida = tabuleiro1.fazerJogada(linha, coluna, jogadorAtual.getSimbolo());

            if (jogadaValida){

                if(tabuleiro1.condicaoVitoria(jogadorAtual.getSimbolo())){
                    tabuleiro1.imprimirTabuleiro();
                    System.out.println("Parabens o jogador " + jogadorAtual.getJogador() + " venceu");
                    break;
                }
                if(tabuleiro1.verificarEmpate()){
                    tabuleiro1.imprimirTabuleiro();
                    System.out.println("Empate");
                    break;
                }

               if (jogadorAtual == jogador1){
                   jogadorAtual = jogador2;
               }
               else{
                   jogadorAtual = jogador1;
               }
            }
            else{
                System.out.println("jogada invalida");
            }

       }

   }
}
