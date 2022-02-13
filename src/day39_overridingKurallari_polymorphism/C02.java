package day39_overridingKurallari_polymorphism;



public class C02 extends C01_ {

	public static void main(String[] args) {
		
		C02 obj1=new C02();
		obj1.privateMethod();
		obj1.staticMethod();
		
		C01_ obj2=new C02();
		// obj2.privateMethod();
		// data turu C01 oldugundan oncelikle C01 class'indaki
		// method'a bakmamiz gerekir ancak private oldugundan ulasamayiz
		// ulasamadigimiz bir method'u override yapamayiz
		// dolayisiyla signature ayni olmasina RAGMEN bu ikisi farkli iki method olarak gorulur
		obj2.staticMethod();
		// static methodlar override edilemez
		// dolayisiyla signature ayni olmasina RAGMEN bu ikisi farkli iki method olarak gorulur
	}
	
		
		public static void staticMethod() {
			System.out.println("Child class static method calisti");
			
		}
		
		private void privateMethod() {
			System.out.println("Child class private method");
		}
		/*
		public final void finalMethod() {
			System.out.println("Child class dinal method");
		}
		*/

	}




