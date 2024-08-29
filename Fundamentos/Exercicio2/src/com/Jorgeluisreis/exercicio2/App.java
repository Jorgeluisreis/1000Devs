package com.Jorgeluisreis.exercicio2;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double salarioMinimo = 0;
        double salarioFuncionario = 0;
        boolean entradaValida = false;

        do {
            try {
                Configuracao.clearConsole();
                System.out.println("----------------------------------");
                System.out.println("-           Exercício 2          -");
                System.out.println("----------------------------------");
                System.out.printf("Informe o valor do salário mínimo: ");
                salarioMinimo = leia.nextDouble();

                System.out.printf("Informe o valor do salário funcionário: ");
                salarioFuncionario = leia.nextDouble();

                entradaValida = true;
            } catch (InputMismatchException e) {
                Configuracao.clearConsole();
                System.out.println("----------------------------------");
                System.out.println("-              Erro              -");
                System.out.println("----------------------------------");
                System.out.printf("Entrada de dados inválida, tente novamente. Use vírgula em vez de ponto.\n");

                leia.nextLine();

                System.out.println("Pressione qualquer tecla para tentar novamente...");
                try {
                    System.in.read();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }

        } while (!entradaValida);
        double quantidadeSalariosMinimos = salarioFuncionario / salarioMinimo;
        Configuracao.clearConsole();
        System.out.println("----------------------------------");
        System.out.println("-            Resultado           -");
        System.out.println("----------------------------------");
        System.out.printf("Este funcionário recebe %.2f salarios mínimos.\n", quantidadeSalariosMinimos);

        leia.close();

    }

}
