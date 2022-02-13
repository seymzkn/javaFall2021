package day12_StringManipulations;

public class C05_Contains {

	public static void main(String[] args) {


		String cumle="Calisirsaniz, Java ogrenmek cok kolay";
		
		System.out.println(cumle.contains(" "));//true
		System.out.println(cumle.contains("iz, J")); //true
		
		System.out.println(cumle.contains("Hasan")); //Hasan

	}

}
