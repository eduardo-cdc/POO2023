package exercicio3;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o num1: ");
    int num1 = scanner.nextInt();

    System.out.println("Digite o num2: ");
    int num2 = scanner.nextInt();

    int soma = Calculadora.somar(num1, num2);

    System.out.println("A soma é: " + soma);
  }
}