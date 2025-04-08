package ListaExer;
import java.util.Scanner;


public class Media {
    public static Scanner input = new Scanner(System.in);
    

    public static void main (String[]args){

int[] vetor = new int[15];
int media = 0;
int soma = 0;

for(int i = 0; i < vetor.length;i++){

System.out.println("Digite a sua media : ");
vetor[i] = input.nextInt();
soma += vetor [i];

}
media = soma / vetor.length;
System.out.println("a meida da turma é : "+media);

    }


    
}
