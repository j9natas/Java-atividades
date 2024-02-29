package losangulo;

import java.util.Scanner;

public class Atividade_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento da diagonal maior (D): ");
        double diagonalMaior = scanner.nextDouble();
        System.out.print("Digite o comprimento da diagonal menor (d): ");
        double diagonalMenor = scanner.nextDouble();

        double area = (diagonalMaior * diagonalMenor) / 2;

        System.out.println("A área do losango é: " + area);

        scanner.close();
    }
}