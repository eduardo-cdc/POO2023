package exercicio2;
import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
    
        System.out.print("Digite 10 números: ");
        int soma = 0;
        for(int i = 0 ;i<10;i++){
            int n1 = leia.nextInt();
            soma = soma + n1;
       }
       System.out.printf("Soma = %d",soma);
       leia.close();
    }
}