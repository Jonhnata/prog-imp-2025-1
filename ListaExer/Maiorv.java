package ListaExer;
import java.util.Scanner;


public class Maiorv {
    public static Scanner input = new Scanner (System.in);

    public static void main (String[]args){

    int [] vet = new int[10];
    int maior = 0;
    int posi = 0;

    for(int i = 0; i <vet.length; i++){

System.out.print("Digite um numero para a o vetor "+i+" : ");
vet[i] = input.nextInt();


if (vet[i] > maior) 
{
maior = vet [i];
posi = i; 
  }


}

for(int a = 0; a < vet.length;a++){
System.out.println("Os valores dos vetores é : "+vet[a]);

}
System.out.println("O maior valor do vetor é : "+ maior +" e ele está na posicao : "+posi);
}

    
    }




    



