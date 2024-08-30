import net.jorgedev.ConsoleClear;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        float A = 0;
        float B = 0;
        float C = 0;
        final float PI = 3.14159f;
        boolean entradaValida = false;
        do {
            try {
                ConsoleClear.run();
                System.out.println("----------------------------------");
                System.out.println("-           Exercício 5          -");
                System.out.println("----------------------------------");
                System.out.printf("Dê entrada do 1º valor decimal:");
                A = leia.nextFloat();
                System.out.printf("Dê entrada do 2º valor decimal:");
                B = leia.nextFloat();
                System.out.printf("Dê entrada do 3º valor decimal:");
                C = leia.nextFloat();

                entradaValida = true;
            } catch (InputMismatchException e) {
                ConsoleClear.run();
                System.out.println("----------------------------------");
                System.out.println("-              Erro              -");
                System.out.println("----------------------------------");
                System.out.printf(
                        "Entrada de dados inválida, tente novamente.\nEm caso de valor flutuante, use vírgula em vez de ponto.\n");

                leia.nextLine();

                System.out.println("Pressione qualquer tecla para tentar novamente...");
                try {
                    System.in.read();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        } while (!entradaValida);

        float areaTriangulo = (A * C) / 2;
        float areaCirculo = PI * (float) Math.pow(C, 2);
        float areaTrapezio = ((A + B) * C) / 2;
        float areaQuadrado = (float) Math.pow(B, 2);
        float areaRetangulo = A * B;

        ConsoleClear.run();
        System.out.println("----------------------------------");
        System.out.println("-            Resultado           -");
        System.out.println("----------------------------------");
        System.out.printf("Triângulo: %.3f\n", areaTriangulo);
        System.out.printf("Circulo: %.3f\n", areaCirculo);
        System.out.printf("Trapezio: %.3f\n", areaTrapezio);
        System.out.printf("Quadrado: %.3f\n", areaQuadrado);
        System.out.printf("Retângulo: %.3f\n", areaRetangulo);

        leia.close();
    }
}
