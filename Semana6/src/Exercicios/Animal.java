package Exercicios;

interface EmitirSom {
    void emitirSom();
}

abstract class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public abstract void mover();

    public void comer() {
        System.out.println("O animal está comendo.");
    }
}

class Cachorro extends Animal implements EmitirSom {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void mover() {
        System.out.println("O cachorro está correndo.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro está latindo.");
    }
}

class Gato extends Animal implements EmitirSom {
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void mover() {
        System.out.println("O gato está pulando.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O gato está miando.");
    }
}

class Passaro extends Animal implements EmitirSom {
    public Passaro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void mover() {
        System.out.println("O pássaro está voando.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O pássaro está cantando.");
    }
}
