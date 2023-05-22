package exercicio4;

public class Moto extends Veiculo {
  public Moto() {
    super(2);
  }

  @Override
  public void mover() {
    System.out.println("A moto está se movendo");
  }
}
