package Aula3.exercicios.ex2;

public class Calculadora {

    public Calculadora(){

    }

    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero!");
            return 0;
        }
        return a / b;
    }

    public double potencia(double base, int expoente) {
        return Math.pow(base, expoente);
    }
}
