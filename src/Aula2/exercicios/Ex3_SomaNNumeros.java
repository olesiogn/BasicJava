package Aula2.exercicios;

import java.util.Scanner;

public class Ex3_SomaNNumeros {
    public static void main(String[] args) {

        /*
        Soma de N Números

        Desenvolva um programa que:
        Leia a quantidade de números a serem informados
        Leia N números inteiros
        Calcule a soma de todos os números
        Calcule a média
        Exiba soma e média
        Entrada: Quantidade N, seguida de N números Saída: Soma e média dos números
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você deseja informar? ");
        int n = scanner.nextInt();

        int soma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        double media = soma / (double) n;

        System.out.println("\nSoma: " + soma);
        System.out.println("Média: " + media);

        scanner.close();
    }
}
