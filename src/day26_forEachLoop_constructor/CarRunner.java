package day26_forEachLoop_constructor;


public class CarRunner {

	public static void main(String[] args) {
		// Car class'indan bir obje olusturalim
		
			Car 		car1			=			new 		Car();
		//class ismi	obje ismi		assigment	keyword		Constructor call
		
		System.out.println(car1.km + " "+ car1.model + " " + car1.renk + " " + car1.yil + " " + car1.satilikMi); // 0
		
		// bir obje olustururken eger obje icin kendi class inde belirlenen degerleri kullanmak istiyorsam
		//hic bir degeri kendim atamadan obje olusturabilirim
		//bu durumda hicbir parametre kullanilmadigi icin default constructor yeterli olacaktir
		
		
		//Eger obje olusturdugum class'daki degerleri kullanmak yerine kendi degerlerimle bir obje
		//olusturmak istersem o zaman parametreli constructor olusturmam gerekir
		
		// Car car2=new Car("Kirmizi", "Coralla");
		
		//Car class'inda iki String parametresi olan bir constructor olmadigi icin 
		//bu obje olusturmayi simdilik yapamayiz

	}

}
