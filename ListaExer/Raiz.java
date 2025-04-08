package ListaExer;
import java.util.Scanner;

public class Raiz {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[]args){

        Double [] Num = new Double[10];
        Double [] Valor = new Double [10];

    for(int i = 0; i < Num.length;i++){
        System.out.println("Digite um valor : ");
        Num[i] = input.nextDouble();
    }
    for(int i = 0; i < Num.length;i++){
      Valor[i] = Num[i]*Num[i];
    }
for (int i = 0; i < Num.length; i++){
for (int a = 0; a < Valor.length; a++){
System.out.println("O valor do numero "+Num[i]+" e a sua raiz é "+Valor[i]);
}
}
    }
    
}
