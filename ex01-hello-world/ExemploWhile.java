import java.util.Scanner;

public class ExemploWhile {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int num1, num2;

        num1 = inputI("Digite um número inteiro: ");
        num2 = inputI("Digite o segundo número inteiro: ");

        while (num2 <= num1) {
            System.out.println("O segundo número deve ser maior que o primeiro!");
            num2 = inputI("Digite o segundo número novamente: ");
        }

        System.out.println("Existem " + (num2 - num1) + " números no intervalo de " + num1 + " e " + num2);
    }

    public static int inputI(String texto) {
        System.out.print(texto);
        return scn.nextInt();
    }

}
