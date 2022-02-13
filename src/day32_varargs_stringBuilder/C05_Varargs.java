package day32_varargs_stringBuilder;

public class C05_Varargs {
	public static void main(String[] args) {
}
		
		
		
		// varargs'dan once farkli parametreler kullanilabilir
		// ama varargs'dan sonra parametre yazilamaz
		// yazarsaniz java varargs son parametre olmalidir diye sizi uyarir
		
		// ve CTE verir
		
	

	private static void topla(int sayi1, int... sayilar) {
		
		StringBuilder strBld = new StringBuilder("ceylan");

		strBld.insert(0,"S");

		System.out.println(strBld);
		

	}

}

