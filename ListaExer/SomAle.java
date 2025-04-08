package ListaExer;
import java.util.Scanner;

public class SomAle{

public static Scanner input = new Scanner (System.in);

public static void main(String[]args){

int [] Vt = new int[8];
int x, y,soma;


for(int i = 0;i < Vt.length;i++){
System.out.println("Digite um numero : ");
Vt[i] = input.nextInt();
}
System.out.println("Agora, informe duas posições do vetor (entre 0 e 7):");
x = input.nextInt();

System.out.println("Agora, informe duas posições do vetor (entre 0 e 7):");
y= input.nextInt();


if(x >= 0 && x <= 8 && y >= 0 && y <=8 ){
    soma = Vt[x] + Vt[y];
    
    System.out.println("o valor da soma entre as 2 posicoes é "+soma);
    
}

}

}


