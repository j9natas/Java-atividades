package Atividade_02;

import java.util.Scanner;

public class numero_antecessor {

	
	 public static void main (String[]args) {	
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Digite um número: ");
		 int numero = scanner.nextInt();
		 int antecessor = numero - 1;
		 System.out.println("O antecessor de " + numero + " é: " + antecessor);
		 scanner.close();
	 }
}
		 
		 
