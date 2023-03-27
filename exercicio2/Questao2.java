package exercicio2;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
    
        System.out.print("Digite 1 número: ");
    
        int n1 = leia.nextInt();
        leia.close();
    
        if(n1%2==0)
            System.out.printf("PAR");
        else
            System.out.printf("IMPAR");
       }
}
