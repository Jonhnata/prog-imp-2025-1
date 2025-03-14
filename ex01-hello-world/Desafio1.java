public class Desafio1 {
  public static void main(String[] args) {
      int r1 = 0, r2 = 0;

      for (int i = 1; i <= 10; i++) {
         int a1 = (int) (Math.random() * 6) + 1;
         int a2 = (int) (Math.random() * 6) + 1;

        System.out.print("Jogador 1 = " + a1 + " | Jogador 2 = " + a2 + " -> ");

        if (a1 > a2) {
              System.out.println("Jogador 1 venceu!");
              r1++;
        } else if (a2 > a1) {
              System.out.println("Jogador 2 venceu!");
              r2++;
          } else {
              System.out.println("Empate!");
          }
      }

      System.out.println("\nResultado Final");
      if (r1 > r2) {
          System.out.println("Jogador 1 ganhou!");
      } else if (r2 > r1) {
          System.out.println("Jogador 2 ganhou!");
      } else {
          System.out.println("Empate entre os jogadores!");
      }
  }
}
