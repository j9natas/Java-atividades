package atividade_08;

import java.util.Scanner;

public class Triangulo {

	public static void main (String[]args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Informe a base do Triangulo: ");
    double base = scanner.nextDouble();

    System.out.println("Informe a altura do Triangulo: ");
    double altura = scanner.nextDouble();
    
    double area = altura * base/2;
    
    System.out.println("A área do Triangulo é: " + area);
    
    scanner.close();
}
	
}
