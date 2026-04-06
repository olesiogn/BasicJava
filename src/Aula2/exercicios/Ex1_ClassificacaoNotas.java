package Aula2.exercicios;

import java.util.Scanner;

public class Ex1_ClassificacaoNotas {
    public static void main(String[] args) {

        /*
        Classificação de Notas

        Faça um programa que leia uma nota (0 a 10) de um aluno e classifique-a conforme:
        9-10: Excelente
        7-8.9: Bom
        5-6.9: Satisfatório
        0-4.9: Insuficiente
        Entrada: Uma nota em decimal Saída: Classificação da nota
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno (0-10): ");
        double nota = scanner.nextDouble();

        if (nota >= 9 && nota <= 10) {
            System.out.println("Classificação: Excelente");
        } else if (nota >= 7 && nota < 9) {
            System.out.println("Classificação: Bom");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Classificação: Satisfatório");
        } else if (nota >= 0 && nota < 5) {
            System.out.println("Classificação: Insuficiente");
        } else {
            System.out.println("Nota inválida!");
        }

        scanner.close();
    }
}
