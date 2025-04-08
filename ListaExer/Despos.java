package ListaExer;
import java.util.Scanner;

public class Despos {

    public static Scanner input = new Scanner (System.in);


    public static void main (String[]args){

int [] Vet = new int[10] ;
int Par = 0;


for(int i = 0; i <Vet.length;i++){
System.out.print("Digite um valor na posicao "+i+" : ");
Vet[i] = input.nextInt();
if (Vet[i] % 2 == 0) {
    Par++;
    
}


}

System.out.println("A quantidade de numeros par no vetor é "+Par);

    }
    
}
