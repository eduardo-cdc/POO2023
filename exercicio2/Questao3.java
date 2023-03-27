package exercicio2;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
    
        System.out.print("Digite 1 número: ");
    
        int n1 = leia.nextInt();
        leia.close();
    
        if(n1>0)
            System.out.printf("Positivo");
        else if(n1<0)
            System.out.printf("Negativo");
        else
            System.out.printf("Neutro");
       }
}
