package Exemplos;

public class Operacoes {
    public static void main(String[] args) {
        // Operações matemáticas
        int a = 10;
        int b = 5;

        // Adição
        int soma = a + b;
        System.out.println("Soma: " + soma);

        // Subtração
        int subtracao = a - b;
        System.out.println("Subtração: " + subtracao);

        // Multiplicação
        int multiplicacao = a * b;
        System.out.println("Multiplicação: " + multiplicacao);

        // Divisão
        int divisao = a / b;
        System.out.println("Divisão: " + divisao);

        // Resto da divisão
        int resto = a % b;
        System.out.println("Resto da divisão: " + resto);

        String nome1 = "Fulano";
        String nome2 = " da Silva";

        // Concatenação de strings
        String nomeCompleto = nome1 + nome2;
        System.out.println("Nome completo: " + nomeCompleto);

        int multipicaESoma = (a * b) + b;
        System.out.println("Multiplicação e soma: " + multipicaESoma);
    }
}
