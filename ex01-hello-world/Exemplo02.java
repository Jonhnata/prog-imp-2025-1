import java.util.Scanner;

public class Exemplo02 {
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int num1 = 10;
        int num2;
        double num3 = 3.15, num4;
        
        System.out.print("Digite um numero inteiro: ");
        num2 = entrada.nextInt();
        System.out.print("Digite seu numero real");
        num4 =entrada.nextDouble();
        
        System.out.println("Seu numero inteiro :"+ num2+"Seu numero real é : "+num4);




       

        
    }

}
