package exercicio2;
import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
    
        System.out.print("Digite 15 idades: ");
        int soma = 0;
        for(int i = 0 ;i<15;i++){
            int n1 = leia.nextInt();
            soma = soma + n1;
       }
       int media = soma/15;
       System.out.printf("Média = %d",media);
       leia.close();
    }
}