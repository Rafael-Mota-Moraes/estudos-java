package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
	public static void main(String[] args) {
		double a = 1; // implícita
		System.out.println(a);
		
		float b = (float)1.12345; // explícita (cast)
		System.out.println(b);
		
		int c = 100;
		byte d = (byte)c;
		System.out.println(d);
		
		double e = 1;
		int f = (int) e;
		System.out.println(f);
	}
}
