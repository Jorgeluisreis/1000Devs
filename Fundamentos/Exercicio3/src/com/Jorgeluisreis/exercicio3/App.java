package com.Jorgeluisreis.exercicio3;

import java.util.*;
import java.text.*;

public class App {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        @SuppressWarnings("deprecation")
        NumberFormat formatarValor = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        int quantidadeCavalos = 0;
        double valorPorFerraduras = 0;
        boolean entradaValida = false;
        do {
            try {
                Configuracao.clearConsole();
                System.out.println("----------------------------------");
                System.out.println("-           Exercício 3          -");
                System.out.println("----------------------------------");
                System.out.printf("Informe a quatidade de Cavalos: ");
                quantidadeCavalos = leia.nextInt();

                System.out.printf("Informe o valor em R$ de cada ferradura: ");
                valorPorFerraduras = leia.nextDouble();

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
        String valorFormatado = formatarValor.format((quantidadeCavalos * 4) * valorPorFerraduras);
        Configuracao.clearConsole();
        System.out.println("----------------------------------");
        System.out.println("-            Resultado           -");
        System.out.println("----------------------------------");
        System.out.println("Quantidade de Cavalos: " + quantidadeCavalos);
        System.out.println("Ferraduras necessárias: " + (quantidadeCavalos * 4));
        System.out.println("Custo total para compra de ferraduras: " + valorFormatado);

        leia.close();

    }
}
