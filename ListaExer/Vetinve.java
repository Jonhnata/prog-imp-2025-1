package ListaExer;
import java.util.Scanner;

public class Vetinve {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int[] vet = new int[6];

        for (int i = 0; i < vet.length; i++) {
          System.out.print("Digite um numero para o vetor na posição " + i + ": ");
          vet[i] = input.nextInt();
        }

        System.out.println("Valores na ordem inversa:");
        for (int i = vet.length - 1; i >= 0; i--) {
        System.out.println(vet[i]);
        }
    }
}
