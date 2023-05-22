package exercicio4;

public class Bicicleta extends Veiculo {
  public Bicicleta() {
    super(2);
  }

  @Override
  public void mover() {
    System.out.println("A bicicleta está se movendo");
  }
}
