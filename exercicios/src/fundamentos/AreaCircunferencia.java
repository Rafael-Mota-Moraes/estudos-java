package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		// System.out.println(2 + 3);
		double raio = 3.4;
		final double pi = 3.14159;
		// pi = 2; // Pi é uma constante
		double area = pi * (raio * raio);
		
		System.out.println(area);
		
		raio = 10;
		
		area = pi * (raio * raio);
		System.out.println("Área = " + area + "m2.");
	}
}
