import java.util.Random;
 
 public class Exemplo05 {
   public static Random geradorAleat = new Random(5);
 
   public static void main(String[] args) {
    int a1 = 0;
    int a2 = 0;

     for (int i = 1; i <= 10; i += 1) {
        int ale1 = (int) Math.floor(Math.random() * 6) + 1;
        int ale2 = (int) Math.floor(Math.random() * 6) + 1;

        if(ale1 > ale2) {
            ale1++;
            System.out.println("Jogador 1 ganhou!");
            
        }
            
        
      
     }
     
   }
 }