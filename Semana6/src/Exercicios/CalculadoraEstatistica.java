package Exercicios;

public class CalculadoraEstatistica {

    public static double calcularMedia(int[] numeros) {
        if (numeros.length == 0) {
            throw new IllegalArgumentException("O array está vazio.");
        }

        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }

        return (double) soma / numeros.length;
    }

    public static int encontrarValorMaximo(int[] numeros) {
        if (numeros.length == 0) {
            throw new IllegalArgumentException("O array está vazio.");
        }

        int maximo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }

        return maximo;
    }

    public static int encontrarValorMinimo(int[] numeros) {
        if (numeros.length == 0) {
            throw new IllegalArgumentException("O array está vazio.");
        }

        int minimo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

        return minimo;
    }

    public static void main(String[] args) {
        int[] numeros = {2, 5, 9, 1, 7};

        double media = calcularMedia(numeros);
        int maximo = encontrarValorMaximo(numeros);
        int minimo = encontrarValorMinimo(numeros);

        System.out.println("Média: " + media);
        System.out.println("Valor máximo: " + maximo);
        System.out.println("Valor mínimo: " + minimo);
    }
}

