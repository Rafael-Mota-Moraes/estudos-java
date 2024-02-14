package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" Dia");
		
		System.out.printf("\nMegasena: %d %d %d", 1, 2, 3);
		System.out.printf("\nSalário: %.1f\n", 1234.3333);
		
		System.out.print("Digite o seu nome: ");
		Scanner entrada = new Scanner(System.in);
		String nome = entrada.nextLine();
		
		System.out.println(nome);
		
		entrada.close();
	}
}
