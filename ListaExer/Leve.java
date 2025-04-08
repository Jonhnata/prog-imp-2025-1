package ListaExer;
import java.util.Scanner;

public class Leve {
    public static Scanner input = new Scanner(System.in);
    public static void main (String[]args){

int [] vet = new int[6];


for (int i = 0; i <vet.length;i++) {
    System.out.println("Digite um numero : ");
    vet[i] =input.nextInt();
    
}
for(int i = 0; i <vet.length;i++){
    System.out.println("Os numeros da tabela é : "+vet[i]);
}

    }
    

    
























}