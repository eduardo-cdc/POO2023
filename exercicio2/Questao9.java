package exercicio2;

import java.util.Scanner;

//construir um programa em Java que leia 10 notas e imprima a maior e a menor nota lidas.
public class Questao9 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
    
        System.out.print("Digite 10 notas: ");
        float n1[] = new float[10];
        float maior = 0;
        float menor = 0;
        for(int i = 0 ;i<10;i++){
            n1[i] = leia.nextFloat();
            if(i==0){
                maior = n1[i];
                menor = n1[i];
            }
            else if(n1[i]>maior)
                maior = n1[i];
            else if(n1[i]<menor)
                menor = n1[i];
       }
       System.out.printf("Maior = %.2f\nMenor = %.2f",maior,menor);
       leia.close();
    }
}
