public class AmostraMain {
    public static void main(String[] args) {
        Amostra amostra1 = new Amostra(1, 6.5f, 55, 90000);
        int grau1 = amostra1.informaGrau();
        System.out.println("Amostra 1 - Grau: " + grau1);

        Amostra amostra2 = new Amostra(2, 7.5f, 45, 70000);
        int grau2 = amostra2.informaGrau();
        System.out.println("Amostra 2 - Grau: " + grau2);

        Amostra amostra3 = new Amostra(3, 5.5f, 60, 100000);
        int grau3 = amostra3.informaGrau();
        System.out.println("Amostra 3 - Grau: " + grau3);
    }
}

class Amostra {
    private int codigoAmostra;
    private float conteudoCarbono;
    private int durezaRokwell;
    private int resistenciaTracao;

    public Amostra(int codigoAmostra, float conteudoCarbono, int durezaRokwell, int resistenciaTracao) {
        this.codigoAmostra = codigoAmostra;
        this.conteudoCarbono = conteudoCarbono;
        this.durezaRokwell = durezaRokwell;
        this.resistenciaTracao = resistenciaTracao;
    }

    public int informaGrau() {
        int grau = 0;

        if (conteudoCarbono < 7 && durezaRokwell > 50 && resistenciaTracao > 80000) {
            grau = 10;
        } else if (conteudoCarbono < 7 && durezaRokwell > 50) {
            grau = 9;
        } else if (conteudoCarbono < 7) {
            grau = 8;
        } else {
            grau = 7;
        }

        return grau;
    }
}

