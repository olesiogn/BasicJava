package Exemplos;

public class Funcoes {
    public static void main(String[] args) {
        int resultadoSoma = somar(5, 10);
        System.out.println("Resultado da soma: " + resultadoSoma);

        int resultadoMultiplicacao = multiplicar(5, 10);
        System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);

        olaMundo();
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static void olaMundo() {
        System.out.println("Olá, Mundo!");
    }
}
