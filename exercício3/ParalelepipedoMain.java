import java.util.Scanner;

public class ParalelepipedoMain {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Lê as medidas dos lados do paralelepípedo
    System.out.print("Informe a medida do lado A: ");
    float a = input.nextFloat();

    System.out.print("Informe a medida do lado B: ");
    float b = input.nextFloat();

    System.out.print("Informe a medida do lado C: ");
    float c = input.nextFloat();

    // Cria um objeto da classe Paralelepipedo
    Paralelepipedo paralelepipedo = new Paralelepipedo(a, b, c);

    // Calcula e exibe o valor da diagonal
    float diagonal = paralelepipedo.calculaDiagonal();
    System.out.printf("A diagonal do paralelepípedo é: %.2f", diagonal);

    input.close();
  }
}

class Paralelepipedo {
  private float ladoA;
  private float ladoB;
  private float ladoC;

  public Paralelepipedo(float a, float b, float c) {
    ladoA = a;
    ladoB = b;
    ladoC = c;
  }

  public float calculaDiagonal() {
    float l = (float) Math.sqrt(ladoA * ladoA + ladoB * ladoB);
    float diagonal = (float) Math.sqrt(l * l + ladoC * ladoC);
    return diagonal;
  }
}