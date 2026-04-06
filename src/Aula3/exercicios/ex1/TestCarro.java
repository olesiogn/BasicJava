package Aula3.exercicios.ex1;

public class TestCarro {
    public static void main(String[] args) {
        /*
        Criação de Classe Carro

        Crie uma classe chamada Carro com os seguintes atributos privados:
        marca (String)
        modelo (String)
        ano (int)
        velocidade (double)
        A classe deve ter:
        Um construtor vazio
        Um construtor com todos os parâmetros
        Getters e Setters para todos os atributos
        Um método info() que exibe as informações do carro
        Crie um programa teste que instancie dois carros e exiba suas informações.
         */

        Carro carro1 = new Carro("Toyota", "Corolla", 2020, 180);
        carro1.info();

        Carro carro2 = new Carro();
        carro2.setMarca("Honda");
        carro2.setModelo("Civic");
        carro2.setAno(2021);
        carro2.setVelocidade(200);
        carro2.info();
    }
}
