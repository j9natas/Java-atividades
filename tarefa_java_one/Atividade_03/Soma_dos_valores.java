package Atividade_03;

import java.util.Scanner;

public class Soma_dos_valores {

	 public static void main (String[]args) {	
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Digite um valor:");
		 int valor1 = scanner.nextInt();
		 System.out.print("Digite um valor:");
		 int valor2 = scanner.nextInt();
		 scanner.close();
		 int soma = valor1 + valor2;
		 System.out.println("A soma dos valores é: " + soma);
		 
	 }
	 

	
	
	
	
	
	
	
}
