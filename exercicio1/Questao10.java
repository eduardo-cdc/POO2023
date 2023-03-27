package exercicio1;

import java.util.Scanner;

public class Questao10 {
	public static void main(String[] arg) {
		Scanner leia = new Scanner(System.in);
		int v,d,e;
		System.out.print("Digite a qtd de vit�rias:");
		v = leia.nextInt();
		System.out.print("Digite a qtd de derrotas:");
		d = leia.nextInt();
		System.out.print("Digite a qtd de empates:");
		e = leia.nextInt();
		leia.close();
		
		int jogos = v+d+e;
		int pontos_disp = jogos*3;
		int p_v = v*3;
		int p_d = d*0;
		int p_e = e*1;
		int pontos_ganhos = p_v+p_d+p_e;
		int pontos_perdidos = pontos_disp - pontos_ganhos;
		
		
		System.out.printf("Jogos:%d\nPontos Disputados:%d\nPontos Ganhos:%d\nPontos Perdidos:%d\n",jogos,pontos_disp,pontos_ganhos,pontos_perdidos);
	}
}
