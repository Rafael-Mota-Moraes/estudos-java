package fundamentos;

public class Wrapper {
	public static void main(String[] args) {

		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;
		Long l = 100000l;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i);
		System.out.println(l);
		
		Float f = 123F;
		Double d = 123.0;
		System.out.println(f);
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		
		Character c = '#';
		System.out.println(c.toString());
	}
}
