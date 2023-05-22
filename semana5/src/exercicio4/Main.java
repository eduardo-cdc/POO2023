package exercicio4;

public class Main {
  public static void main(String[] args) {
    Carro carro = new Carro();
    Moto moto = new Moto();
    Bicicleta bicicleta = new Bicicleta();

    carro.mover();
    moto.mover();
    bicicleta.mover();

    carro.transportar();
    moto.transportar();
    bicicleta.transportar();

    System.out.println("O carro tem " + carro.getNumeroDeRodas() + " rodas.");
    System.out.println("A moto tem " + moto.getNumeroDeRodas() + " rodas.");
    System.out.println("A bicicleta tem " + bicicleta.getNumeroDeRodas() + " rodas.");
  }
}