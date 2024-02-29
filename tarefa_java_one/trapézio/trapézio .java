package losangulo;

import java.util.Scanner;

public class Atividade_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o comprimento da base maior (B): ");
        double baseMaior = scanner.nextDouble();
        System.out.print("Digite o comprimento da base menor (b): ");
        double baseMenor = scanner.nextDouble();

        System.out.print("Digite a altura do trapézio (h): ");
        double altura = scanner.nextDouble();

        double area = (baseMaior + baseMenor) * altura / 2;

        System.out.println("A área do trapézio é: " + area);

        scanner.close();
    }
}