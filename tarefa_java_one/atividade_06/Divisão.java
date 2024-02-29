package atividade_06;

import java.util.Scanner;

public class Divisão{

	
	public static void main (String[]args) {
		
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Digite um valor:");
		 int valor1 = scanner.nextInt();
		 System.out.print("Digite um valor:");
		 int valor2 = scanner.nextInt();
		 scanner.close();
		 int divisão  = valor1 / valor2;
		 System.out.println("A divisão dos valores é: " +divisão);
		
		
		
		
		
		
		
		
	}
}
