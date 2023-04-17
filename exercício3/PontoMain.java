public class PontoMain {
    public static void main(String[] args) {
        Ponto ponto1 = new Ponto(1.0f, 2.0f, 4.0f, 6.0f);
        float distancia = ponto1.calculaDistancia();
        System.out.println("Distância entre os pontos: " + distancia);
    }
}

class Ponto {
    private float pontoX1;
    private float pontoY1;
    private float pontoX2;
    private float pontoY2;

    public Ponto(float x1, float y1, float x2, float y2) {
        this.pontoX1 = x1;
        this.pontoY1 = y1;
        this.pontoX2 = x2;
        this.pontoY2 = y2;
    }

    public float calculaDistancia() {
        float distancia = (float) Math
                .sqrt(Math.pow(this.pontoX2 - this.pontoX1, 2) + Math.pow(this.pontoY2 - this.pontoY1, 2));
        return distancia;
    }
}
