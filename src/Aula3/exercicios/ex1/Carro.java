package Aula3.exercicios.ex1;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidade;

    public Carro() {
    }

    public Carro(String marca, String modelo, int ano, double velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public void info() {
        System.out.println("Carro: " + marca + " " + modelo +
                ", Ano: " + ano + ", Velocidade: " + velocidade + " km/h");
    }

}
