package com.Jorgeluisreis.exercicio4;

import java.util.*;
import java.text.*;

public class App {
    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        NumberFormat formatarValor = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        Scanner leia = new Scanner(System.in);
        double salario = 0;
        boolean entradaValida = false;

        do {
            try {
                Configuracao.clearConsole();
                System.out.println("----------------------------------");
                System.out.println("-           Exercício 4          -");
                System.out.println("----------------------------------");
                System.out.printf("Informe seu salário: ");
                salario = leia.nextDouble();

                entradaValida = true;

            } catch (InputMismatchException e) {
                Configuracao.clearConsole();
                System.out.println("----------------------------------");
                System.out.println("-              Erro              -");
                System.out.println("----------------------------------");
                System.out.printf(
                        "Entrada de dados inválida, tente novamente.\nEm caso de valor monetário, use vírgula em vez de ponto.\n");

                leia.nextLine();

                System.out.println("Pressione qualquer tecla para tentar novamente...");
                try {
                    System.in.read();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        } while (!entradaValida);

        double salarioReajustado = salario * 1.15;

        double descontoINSS = salarioReajustado * 0.11;

        double descontoFGTS = salarioReajustado * 0.08;

        double totalDescontos = descontoINSS + descontoFGTS;

        double salarioFinal = salarioReajustado - totalDescontos;

        Configuracao.clearConsole();
        System.out.println("----------------------------------");
        System.out.println("-            Resultado           -");
        System.out.println("----------------------------------");
        System.out.println("Salário atual: " + formatarValor.format(salario));
        System.out.println("Salário Reajustado: " + formatarValor.format(salarioReajustado));
        System.out.println("Desconto de 11% do INSS: " + formatarValor.format(descontoINSS));
        System.out.println("Desconto de 8% do FGTS: " + formatarValor.format(descontoFGTS));
        System.out.println("Desconto total do INSS + FGTS: " + formatarValor.format(totalDescontos));
        System.out.println("Salário final a receber: " + formatarValor.format(salarioFinal));

        leia.close();
    }
}
