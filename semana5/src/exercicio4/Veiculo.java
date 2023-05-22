package exercicio4;

public abstract class Veiculo implements TransporteInterface {
  private int numeroDeRodas;

  public Veiculo(int numeroDeRodas) {
    this.numeroDeRodas = numeroDeRodas;
  }

  public abstract void mover();

  public int getNumeroDeRodas() {
    return numeroDeRodas;
  }

  public void setNumeroDeRodas(int numeroDeRodas) {
    this.numeroDeRodas = numeroDeRodas;
  }

  @Override
  public void transportar() {
    System.out.println("Transportando pessoas");
  }
}
