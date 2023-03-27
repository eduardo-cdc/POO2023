package exercicio1;

import java.util.Scanner;

public class Questao7 {
	public static void main(String[] arg) {
		Scanner leia = new Scanner(System.in);
		float start,end;
		System.out.print("Digite o inicia depois o final:");
		start = leia.nextFloat();
		end = leia.nextFloat();
		leia.close();
		System.out.printf("Percorreu: %.2f",end-start);
		
	}

}
