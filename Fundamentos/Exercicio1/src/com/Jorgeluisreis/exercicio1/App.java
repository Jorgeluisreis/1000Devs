package com.Jorgeluisreis.exercicio1;

import java.util.*;
import java.text.*;

public class App {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        float metrosFrente = 0;
        float metrosLado = 0;
        double valorMetroQuadrado = 0;
        boolean entradaValida = false;
        Scanner leia = new Scanner(System.in);
        NumberFormat valorReal = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        do {
            try {
                Configuracao.clearConsole();
                System.out.println("----------------------------------");
                System.out.println("-           Exercício 1          -");
                System.out.println("----------------------------------");
                System.out.printf("Medida em metros de frente: ");
                metrosFrente = leia.nextFloat();

                System.out.printf("Medida em metros de Lado: ");
                metrosLado = leia.nextFloat();

                System.out.printf("Valor do metro quadrado: ");
                valorMetroQuadrado = leia.nextDouble();

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

        double valorAreaTotal = metrosFrente * metrosLado * valorMetroQuadrado;
        String valorRealFormatado = valorReal.format(valorAreaTotal);
        String valorMetroQuadradoFormatado = valorReal.format(valorMetroQuadrado);
        Configuracao.clearConsole();
        System.out.println("----------------------------------");
        System.out.println("-     Informações do Terreno     -");
        System.out.println("----------------------------------");
        System.out.printf("Medições: %.2f mts de frente e %.2f mts de lateral\n", metrosFrente, metrosLado);
        System.out.println("Valor por Metro quadrado (m²): " + valorMetroQuadradoFormatado);
        System.out.println("Area total do terreno: " + (metrosFrente * metrosLado) + " mts");
        System.out.println("Valor do Terreno é de: " + valorRealFormatado);

        leia.close();
    }
}