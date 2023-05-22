package exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o titulo: ");
        String titulo = scanner.nextLine();

        System.out.println("Digite o autor: ");
        String autor = scanner.nextLine();

        System.out.println("Digite o ano publicado: ");
        int ano = scanner.nextInt();

        Livro livro1 = new Livro();
        livro1.setTitulo(titulo);
        livro1.setAutor(autor);
        livro1.setAnoPublicacao(ano);

        Livro livro2 = new Livro(titulo);
        livro2.setAutor(autor);
        livro2.setAnoPublicacao(ano);

        Livro livro3 = new Livro(titulo, autor);
        livro3.setAnoPublicacao(ano);

        Livro livro4 = new Livro(titulo, autor, ano);

        System.out.println("O livro '" + livro1.getTitulo() + "' foi escrito por " + livro1.getAutor() + " em "
                + livro1.getAnoPublicacao() + ".");
        System.out.println("O livro '" + livro2.getTitulo() + "' foi escrito por " + livro2.getAutor() + " em "
                + livro2.getAnoPublicacao() + ".");
        System.out.println("O livro '" + livro3.getTitulo() + "' foi escrito por " + livro3.getAutor() + " em "
                + livro3.getAnoPublicacao() + ".");
        System.out.println("O livro '" + livro4.getTitulo() + "' foi escrito por " + livro4.getAutor() + " em "
                + livro4.getAnoPublicacao() + ".");
    }
}