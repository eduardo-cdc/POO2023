package exercicio1;

import java.util.Scanner;

public class Questao8 {
	public static void main(String[] arg) {
		Scanner leia = new Scanner(System.in);
		int m,f,a;
		System.out.print("Digite a qtd de alunos:");
		m = leia.nextInt();
		System.out.print("Digite a qtd de alunas:");
		f = leia.nextInt();
		System.out.print("Digite a qtd de aprovados:");
		a = leia.nextInt();
		leia.close();
		int total_alunos = m+f;
		
		double p_m = (double)m/total_alunos;
		double p_f = (double)f/total_alunos;
		double p_a = (double)a/total_alunos;
		
		System.out.printf("Total de alunos: %d\nPorcentagem de alunos: %.2f\nPorcentagem de alunas: %.2f\nPorcentagem de aprovados: %.2f",total_alunos,p_m,p_f,p_a);
		
	}

}
