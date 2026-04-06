package Aula3.exercicios.ex3;

public class Cachorro extends Animal {
    public Cachorro() {
        super();
    }

    public Cachorro(String nome, int idade) {
        super(nome, idade, "Cachorro");
    }

    public void fazer_som() {
        System.out.println("Au au!");
    }
}
