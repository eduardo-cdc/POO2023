package exercicio2;
import java.util.Scanner;

// Construir um programa em Java que leia 10 números e imprima o maior número lido.

public class Questao8 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
    
        System.out.print("Digite 10 números: ");
        int n1[] = new int[10];
        int maior = 0;
        for(int i = 0 ;i<10;i++){
            n1[i] = leia.nextInt();
            if(i==0)
                maior = n1[i];
            else if(n1[i]>maior)
                maior = n1[i];
       }
       System.out.printf("Maior = %d",maior);
       leia.close();
    }
}