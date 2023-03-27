package exercicio1;

import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n,n2;
		System.out.print("Digite 2 n�meros:");
		n = leia.nextInt();
		n2 = leia.nextInt();
		leia.close();
		
		int media = (n+n2)/2;
		int dif = (n-n2)/2;
		
		System.out.println("M�dia: "+ media + " Diferen�a: " + dif);
		
	}

}
