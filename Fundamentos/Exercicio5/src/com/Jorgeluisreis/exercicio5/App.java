package com.Jorgeluisreis.exercicio5;

import java.util.*;
import java.text.*;

public class App {
    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        NumberFormat formatarValor = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        Scanner leia = new Scanner(System.in);
        int quantidadeFrangos = 0;
        boolean entradaValida = false;
        do {
            try {
                Configuracao.clearConsole();
                System.out.println("----------------------------------");
                System.out.println("-           Exercício 5          -");
                System.out.println("----------------------------------");
                System.out.printf("Informe a quantidade de Frangos: ");
                quantidadeFrangos = leia.nextInt();

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

        Configuracao.clearConsole();
        double custoTotalChip = quantidadeFrangos * 4;
        double custoTotalAlimento = quantidadeFrangos * 2 * 3.50;
        double custoTotal = custoTotalChip + custoTotalAlimento;
        System.out.println("----------------------------------");
        System.out.println("-            Resultado           -");
        System.out.println("----------------------------------");
        System.out.println("Quantidade de Frangos: " + quantidadeFrangos);
        System.out.println("Valor de cada Anel com Chip: " + (formatarValor.format(custoTotalAlimento)));
        System.out.println("Valor de cada Anel de Alimento: " + (formatarValor.format(custoTotalAlimento)));
        System.out.println(
                "Custo total para Identificação de Frangos: "
                        + (formatarValor.format(custoTotal)));

        leia.close();
    }
}
