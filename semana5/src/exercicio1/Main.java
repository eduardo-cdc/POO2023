package exercicio1;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o valor do raio: ");
    float raio = scanner.nextFloat();

    Circulo circulo = new Circulo(raio);

    double area = circulo.calcularArea();
    double perimetro = circulo.calcularPerimetro();

    System.out.println("A área do círculo é: " + area);
    System.out.println("O perímetro do círculo é: " + perimetro);
  }
}