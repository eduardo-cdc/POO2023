package exercicio2;

import java.util.Scanner;

// Construir um programa em Java que leia um número inteiro entre 1 e 7 e imprima o nome
// do dia da semana correspondente ao número, caso o número esteja fora do intervalo entre
// 1 e 7, imprimir “Dia Inválido”.

public class Questao5 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
    
        System.out.print("Digite um dia da semana de 1 a 7: ");
    
        int n1 = leia.nextInt();
        leia.close();
    
        if(n1>=1 && n1<=7){
            switch(n1){
                case 1:
                    System.out.printf("Domingo");
                    break;
                case 2:
                    System.out.printf("Segunda");
                    break;
                case 3:
                    System.out.printf("Terça");
                    break;
                case 4:
                    System.out.printf("Quarta");
                    break;
                case 5:
                    System.out.printf("Quinta");
                    break;
                case 6:
                    System.out.printf("Sexta");
                    break;
                case 7:
                    System.out.printf("Sábado");
                    break;
            }
        }
        else
            System.out.printf("Dia Inválido");
       }
}
