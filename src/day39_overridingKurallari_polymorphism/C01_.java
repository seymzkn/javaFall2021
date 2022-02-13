package day39_overridingKurallari_polymorphism;

public class C01_ {
	
	public static void staticMethod() {
		System.out.println("Parent class static method calisti");
		
	}
	
	private void privateMethod() {
		System.out.println("Parent class private method");
	}
	
	// final demek bu son hali bir daha degistirilemez demektir
	// dolayisiyla final olarak tanimlanan bir method
	// override edilemez
	public final void finalMethod() {
		System.out.println("Parent class dinal method");
	}
	
	// child claas  ile parent class ayni package da olduklarindan
	// methodlarin access modeifier'lari public, protected veya default olsaydi hic bir sorun olmazdi
	// 
}
