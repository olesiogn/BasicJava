package Aula1.exercicios;

import java.util.Scanner;

public class Ex2_CalculoIMC {
    public static void main(String[] args) {

        /*
        Cálculo do IMC

        Desenvolva um programa que calcule o Índice de Massa Corporal (IMC) de uma pessoa. O programa deve:
        Ler o nome, peso (em kg) e altura (em metros)
        Calcular o IMC usando a fórmula: IMC = peso / (altura²)
        Exibir o nome da pessoa e seu IMC
        Entrada: Nome (String), peso (double), altura (double) Saída: Mensagem com nome e IMC
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu peso (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("IMC de " + nome + ": " + imc);

        scanner.close();
    }
}