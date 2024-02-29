package numero_sucessor;

import java.util.Scanner;

public class Atividade_01 {

	 public static void main (String[]args) {	
	
	 Scanner scanner = new Scanner(System.in);
	 System.out.print("Digite um número: ");
	 int numero = scanner.nextInt();
	 int sucessor = numero + 1;
	 System.out.println("O sucessor de " + numero + " é: " + sucessor);
	 scanner.close();
}
}