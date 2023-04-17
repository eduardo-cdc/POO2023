public class FormaMain {
    public static void main(String[] args) {
        Forma f = new Forma(5, 5, 5); // lados com comprimento 5, 5 e 5
        String forma = f.verificaForma();
        System.out.println(forma); // Triângulo Equilátero
    }
}

class Forma {
    private float ladoX;
    private float ladoY;
    private float ladoZ;

    public Forma(float ladoX, float ladoY, float ladoZ) {
        this.ladoX = ladoX;
        this.ladoY = ladoY;
        this.ladoZ = ladoZ;
    }

    public String verificaForma() {
        String forma = "";
        if (ladoX < ladoY + ladoZ && ladoY < ladoX + ladoZ && ladoZ < ladoX + ladoY) {
            if (ladoX == ladoY && ladoY == ladoZ) {
                forma = "Triângulo Equilátero";
            } else if (ladoX == ladoY || ladoX == ladoZ || ladoY == ladoZ) {
                forma = "Triângulo Isósceles";
            } else {
                forma = "Triângulo Escaleno";
            }
        } else {
            forma = "Não é um triângulo";
        }
        return forma;
    }
}

