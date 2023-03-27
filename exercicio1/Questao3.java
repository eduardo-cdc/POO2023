package exercicio1;

import java.util.Scanner;

public class Questao3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float n,n2,n3;
		System.out.print("Digite 3 notas:");
		n = leia.nextFloat();
		n2 = leia.nextFloat();
		n3 = leia.nextFloat();
		leia.close();
		
		float media = (n+n2+n3)/3;
		
		System.out.println("M�dia: "+ media);
		
	}
}
