package exercicio1;

import java.util.Scanner;

public class Questao5 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a,b,c;
		System.out.print("Digite 3 numeros:");
		a = leia.nextInt();
		b = leia.nextInt();
		c = leia.nextInt();
		leia.close();
		
		int d = (b*b)-4*a*c;
		
		System.out.println("Delta: "+ d);
	}

}
