package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);
		
		a = 12.57;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		// c = 4.5; // Variáveis no Java são sempre do mesmo tipo!!
		
		double d;
		d = 123.65;
		System.out.println(d);
		
		// Gera um ERRO!
		// var e;
		// e = 123.45;
		
		var f = 10; // inteiro
		f = (int) 10.01;
		System.out.println((double)f);
	}
}
