package exercicio1;

import java.util.Scanner;

public class Questao4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double sal;
		System.out.print("Digite o sal�rio bruto:");
		sal = leia.nextDouble();
		leia.close();
		
		double sal_liq = sal - sal*0.08;
		
		System.out.println("Sal�rio l�quido: "+ sal_liq);
		
	}
}
