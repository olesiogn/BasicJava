package Aula1.exercicios;

import java.util.Scanner;

public class Ex3_SalarioBonus {
    public static void main(String[] args) {

        /*
        Salário com Bônus

        Um funcionário recebe um salário e um bônus. Escreva um programa que:
        Leia o nome do funcionário
        Leia o salário base
        Leia a porcentagem do bônus
        Calcule o valor do bônus (salário × porcentagem / 100)
        Calcule o salário final (salário + bônus)
        Exiba o nome, salário base, valor do bônus e salário final
        Entrada: Nome, salário base, porcentagem de bônus Saída: Detalhamento do cálculo
        */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Salário base: R$ ");
        double salario = scanner.nextDouble();

        System.out.print("Porcentagem do bônus (%): ");
        double percentualBonus = scanner.nextDouble();

        double valorBonus = (salario * percentualBonus) / 100;
        double salarioFinal = salario + valorBonus;

        System.out.println("\n--- Contracheque ---");
        System.out.println("Funcionário: " + nome);
        System.out.println("Salário base: R$ " + salario);
        System.out.println("Bônus (" + percentualBonus + "%): R$ " + valorBonus);
        System.out.println("Salário final: R$ " + salarioFinal);

        scanner.close();
    }
}