package exercicio2;

import java.util.Scanner;

// Construir um programa em Java que leia as 2 notas de um aluno e que calcule, armazene
// e imprima a média. Se a média for maior ou igual a 7, imprimir “Aprovado”, caso
// contrário, realizar a leitura de uma terceira nota, que terá peso 2 e calcular, armazenar e
// imprimir uma nova média. Se a nova média for maior ou igual a 6, imprimir “Aprovado”,
// caso contrário, imprimir “Reprovado”.



public class Questao4 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
    
        System.out.print("Digite 2 notas: ");
    
        float n1 = leia.nextFloat();
        float n2 = leia.nextFloat();
    
        float media = (n1 + n2)/2;

        System.out.printf("\nMédia = %.2f",media);

        if(media>=7)
            System.out.printf("\nAprovado");
        else{
            System.out.printf("\nDigite a nova da AV3");
            float n3 = leia.nextFloat();
            media = (n1+n2+(n3*2))/3;
            System.out.printf("\nNova Média = %.2f",media);
            if(media>=6)
                System.out.printf("\nAprovado");
            else
                System.out.printf("\nReprovado");
       }
       leia.close();
    }
}