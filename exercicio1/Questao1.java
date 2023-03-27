package exercicio1;
import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {	
	Scanner leia = new Scanner(System.in);
	int n;
	System.out.print("Digite um valor: ");
	n = leia.nextInt();
	leia.close();
	System.out.println("Dobro = " + n*2);
	
	}
}