package ListaExer;
import java.util.Scanner;

public class NumerosReais {
public static Scanner input = new Scanner(System.in);

 public static void main(String[] args) {
double[] vetor = new double[10];
int Cn = 0;
double Sp = 0;

 for (int i = 0; i < vetor.length; i++) {
System.out.print("Digite um número real para a posição " + i + ": ");
vetor[i] = input.nextDouble();
    if (vetor[i] < 0) {
Cn++;
} else {
Sp += vetor[i];
}
}

System.out.println("Quantidade de números negativos: " + Cn);
System.out.println("Soma dos números positivos: " + Sp);
}
}
