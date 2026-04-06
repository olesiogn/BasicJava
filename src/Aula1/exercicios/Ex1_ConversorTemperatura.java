package Aula1.exercicios;

import java.util.Scanner;

public class Ex1_ConversorTemperatura {
    public static void main(String[] args) {

        /*
        Conversor de Temperatura

        Escreva um programa em Java que leia uma temperatura em graus Celsius e a converta para Fahrenheit. A fórmula é: F = (C × 9/5) + 32
        Entrada: Um número em ponto flutuante representando temperatura em Celsius Saída: A temperatura em Fahrenheit
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(celsius + "°C equivale a " + fahrenheit + "°F");

        scanner.close();
    }
}