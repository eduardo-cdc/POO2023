package exercicio2;

import java.util.Scanner;

//Construir um programa em Java que leia o sexo de 30 alunos e turma e calcule, armazene
//e imprima a porcentagem de alunos do sexo masculino e a porcentagem do sexo
//feminino.
public class Questao10 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
    
        System.out.print("Digite o sexo de 30 alunos ( m - masculino ou f - feminino):");
        char s;
        int m = 0;
        int f = 0;
        for(int i = 0 ;i<30;i++){
            s= leia.next(".").charAt(0);
            if(s=='m'){
                m = m + 1;
            }
            else if(s=='f')
                f = f + 1;
       }
       float p_m = (float)m/30;
       float p_f = (float)f/30;

       System.out.printf("Porcentagem Masculino = %.2f\nPorcentagem Feminino = %.2f",p_m,p_f);
       leia.close();
    }
    
}
