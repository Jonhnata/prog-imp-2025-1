package ListaExer;
import java.util.Scanner;

public class Maiorm {

public static Scanner input = new Scanner(System.in);


public static void main (String[]args){

int [] vet = new int[10];
int Nmaior= 0, Nmenor= 100000000;

for(int i = 0; i <vet.length;i++){
System.out.print("Digite um valor na posição "+i+" : " );
vet[i] = input.nextInt();

if (vet [i] > Nmaior) {
    Nmaior = vet[i];
    
}
if (vet[i] < Nmenor) {
    Nmenor = vet[i];
    
}

}


System.out.println("O maior valor é "+Nmaior+" e o menor é "+Nmenor);
}
    
}
