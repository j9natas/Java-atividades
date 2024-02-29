package losangulo;

import java.util.Scanner;

public class Atividade_12 {

	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o raio do círculo (r): ");
        double raio = scanner.nextDouble();
        
        final double PI = 3.14159265359;
        
        double area = PI * raio * raio;
        
        area = Math.round(area * 100.0) / 100.0;
        
        System.out.println("A área do círculo é: " + area);
        
        scanner.close();
        
	 }

	
	
	
	
	
	
	
	
}