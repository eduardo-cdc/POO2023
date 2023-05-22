package exercicio4;

public class Carro extends Veiculo {
  public Carro() {
    super(4);
  }

  @Override
  public void mover() {
    System.out.println("O carro está se movendo");
  }
}
