package Aula3.exercicios.ex3;

public class TestAnimais {
    public static void main(String[] args) {

        /*
        Animais

        Crie uma classe Animal com:
        Atributos: nome (String), idade (int), tipo (String)
        Métodos: getNome(), setNome(), getIdade(), setIdade(), getTipo(), setTipo()

        Crie duas subclasses:
        Cachorro que herde as caracteristicas de Animal e que possua um metodo fazer_som() para exibir "Au au!"
        Gato que herde as caracteristicas de Animal e que possua  um metodo fazer_som() para exibir "Miau!"
        Crie um programa teste que instancie um cachorro e um gato e chame o método fazer_som().
         */

        Cachorro cachorro = new Cachorro("Rex", 5);
        System.out.println("Nome: " + cachorro.getNome() + ", Tipo: " + cachorro.getTipo());
        cachorro.fazer_som();

        Gato gato = new Gato("Whiskers", 3);
        System.out.println("Nome: " + gato.getNome() + ", Tipo: " + gato.getTipo());
        gato.fazer_som();
    }
}
