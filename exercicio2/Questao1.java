package exercicio2;

import java.util.Scanner;

public class Questao1 {
   public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);

    System.out.print("Digite 2 números: ");

    int n1 = leia.nextInt();
    int n2 = leia.nextInt();
    leia.close();

    if(n1>n2)
        System.out.printf("Maior = %d",n1);
    else
        System.out.printf("Maior = %d",n2);
   }

}