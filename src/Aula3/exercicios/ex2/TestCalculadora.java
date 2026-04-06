package Aula3.exercicios.ex2;

public class TestCalculadora {
    public static void main(String[] args) {

        /*
        Calculadora

        Crie uma classe Calculadora com os seguintes métodos estáticos:
        somar(double a, double b) → retorna a + b
        subtrair(double a, double b) → retorna a - b
        multiplicar(double a, double b) → retorna a * b
        dividir(double a, double b) → retorna a / b (com validação para divisão por zero)
        potencia(double base, int expoente) → retorna base^expoente
         */

        Calculadora calc = new Calculadora();

        System.out.println("Soma: " + calc.somar(10, 5));
        System.out.println("Subtração: " + calc.subtrair(10, 5));
        System.out.println("Multiplicação: " + calc.multiplicar(10, 5));
        System.out.println("Divisão: " + calc.dividir(10, 5));
        System.out.println("Divisão por zero: " + calc.dividir(10, 0));
        System.out.println("Potência: " + calc.potencia(2, 3));
    }
}
