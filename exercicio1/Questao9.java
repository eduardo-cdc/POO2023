package exercicio1;

import java.util.Scanner;

public class Questao9 {
	public static void main(String[] arg) {
		Scanner leia = new Scanner(System.in);
		int games,calc,canet;
		System.out.print("Digite a qtd de mini-games:");
		games = leia.nextInt();
		System.out.print("Digite a qtd de calculadora:");
		calc = leia.nextInt();
		System.out.print("Digite a qtd de caneta:");
		canet = leia.nextInt();
		leia.close();
		
		double valor_games = (double) games * 6.95;
		double valor_calc = (double) calc * 3.5;
		double valor_canet = (double) canet * 1.2;
		double total = valor_games+valor_calc+valor_canet;
		
		System.out.printf("Mini-Games: %.2f\nCalculadoras: %.2f\nCanetas: %.2f\nTotal:%.2f",valor_games,valor_calc,valor_canet,total);
		
	}
}
