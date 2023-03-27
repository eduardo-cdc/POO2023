package exercicio1;

import java.util.Scanner;

public class Questao6 {
	public static void main(String[] arg) {
		Scanner leia = new Scanner(System.in);
		float a;
		System.out.print("Digite um valor em Km:");
		a = leia.nextFloat();
		leia.close();
		System.out.printf("%.2f metros",a*1000);
		
	}
}
