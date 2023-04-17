public class MassaMain {
    public static void main(String[] args) {
        Massa massa = new Massa(1000);
        massa.calculaTempo();
        massa.imprimirResultados();
    }
}

class Massa {
    private float massaInicial;
    private float massaFinal;
    private int tempo;

    public Massa(float massaInicial) {
        this.massaInicial = massaInicial;
    }

    public void calculaTempo() {
        float massaAtual = massaInicial;
        int segundos = 0;

        while (massaAtual >= 0.5) {
            massaAtual /= 2;
            segundos += 50;
        }

        massaFinal = massaAtual;
        tempo = segundos;
    }

    public void imprimirResultados() {
        System.out.println("Massa inicial: " + massaInicial + "g");
        System.out.println("Massa final: " + massaFinal + "g");
        System.out.println("Tempo necessário: " + tempo + " segundos");
    }
}
