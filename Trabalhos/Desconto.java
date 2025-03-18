package Trabalhos;
import java.util.Scanner;

public class Desconto {
public static Scanner scanner = new Scanner (System.in);

public static void main(String[] args) {
    //Variaveis
int cat, Qtd ;
double Pproduto, Desconto, Vorigem, Vfim,Dtotal;

System.out.println("Qual é a categoria do produto ? :  Categoria 1,2 ou 3?");
cat = scanner.nextInt();

//Verificar se o usuario escreveu certo//

    while(cat < 1 || cat > 3) {
     System.out.println("Erro!! Escolha entre 1 e 3");
        System.out.println("Qual é a categoria do produto ? :  Categoria 1,2 ou 3?");
        cat = scanner.nextInt();
   

}
System.out.print("$ Preço do produto $ : ");
Pproduto = scanner.nextDouble();

while (Pproduto < 0.1){
    System.out.println("Erro!! favor Digite o preço do prdouto correto !");
    System.out.print("$ Preço do produto $ : ");
    Pproduto = scanner.nextDouble();

}
System.out.print("Escreva a quantidade : ");
Qtd = scanner.nextInt();

while (Qtd < 0 ) {
    System.out.println("Favor inserir quantidade de produtos : ");
    System.out.print("Escreva a quantidade : ");
    Qtd = scanner.nextInt();

    
}
// Condições de descontos
if(cat == 1) {
Desconto = 0.10;}

else if (cat == 2){
Desconto = 0.15;
}
else {
Desconto = 0.08;   
}

if( Qtd <= 2){
Desconto = Desconto + 0.02; 
}
else if (Qtd > 2 && Qtd <= 10) {
Desconto = Desconto + 0.05;
}
else {
Desconto = Desconto + 0.08; }
//Calculos finais1
Vorigem = Qtd * Pproduto;       // Cálculo do valor original
Dtotal = Vorigem * Desconto;    // Cálculo do valor do desconto
Vfim = Vorigem - Dtotal;        // Cálculo do valor final (aplicando o desconto)

System.out.println("O valor sem desconto é : "+Vorigem);
System.out.println("O valor atual é : "+Vfim);
System.out.println("Seu desconto total foi de "+Dtotal);
}
}


