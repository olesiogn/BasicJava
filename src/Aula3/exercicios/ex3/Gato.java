package Aula3.exercicios.ex3;

public class Gato extends Animal {
    public Gato() {
        super();
    }

    public Gato(String nome, int idade) {
        super(nome, idade, "Gato");
    }

    public void fazer_som() {
        System.out.println("Miau!");
    }
}
