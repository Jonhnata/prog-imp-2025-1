public class Desafio1 {

    public static void main(String[] args) {
  
      int r1 = 0, r2 = 0;
      
      for (int i = 1; i <= 10; i++) {
        
        int a1 = (int) Math.floor(Math.random() * 6) + 1;
        System.out.println("Jogador 1 = " + a1);
        
        int a2 = (int) Math.floor(Math.random() * 6) + 1;
        System.out.println("Jogador 2 = " + a2);
  
        
        if (a1 > a2) {
          System.out.println("Jogador 1 tem o número maior do que Jogador 2");
          r1++;
        } else if (a2 > a1) {
          System.out.println("Jogador 2 tem o número maior do que Jogador 1");
          r2++;
        } else {
          System.out.println("Empate entre Jogador 1 = " + a1 + " e Jogador 2 = " + a2);
          
        }
        System.out.println("Placar do jogo:");
        System.out.println("Jogador 1 = " + r1 + " | Jogador 2 = " + r2);
        System.out.println("__________________________");
      }
  
      // O final
      if (r1 > r2) {
        System.out.println("Jogador 1 ganhou com " + r1 + " pontos e Jogador 2 perdeu com " + r2 + " pontos.");
      } else if (r2 > r1) {
        System.out.println("Fim de jogo, Jogador 2 ganhou com " + r2 + " pontos e Jogador 1 perdeu com " + r1 + " pontos.");
      } else {
        System.out.println("Empate entre o Jogador 1 (" + r1 + ") e o Jogador 2 (" + r2 + ").");
      }
    }
  }
  