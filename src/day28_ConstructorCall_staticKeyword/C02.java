package day28_ConstructorCall_staticKeyword;

public class C02 {
	
	int x=5;
	static int y=10;

	public static void main(String[] args) {
		// 3 tane obje olusturalim ve degisimleri gozlemleyelim
		
		C02 obje1=new C02();
		System.out.println("obje1 icin x : " + obje1.x + " obje1 icin y : " + y);

		
		obje1.x++;
		y++;
		System.out.println("obje1 icin x : " + obje1.x + " obje1 icin y : " + y);
		
		//Ayni class icinde iken static variable'lara ulasmak icin objeye ihtiyac yoktur
		//kullanirsak Java CTE vermez fakat "static variable'a static yoldan ulas" diye bizi uyarir
		
		C02 obje2=new C02();
		System.out.println("obje2 icin x : " + obje2.x + " obje2 icin y : " + y);
		
		obje2.x++;
		y++;
		System.out.println("islemden sonra obje2 icin x : " + obje2.x + " obje2 icin y : " + y);
		
		System.out.println("obje 2 olusturulduktan ve islemden sonra obje1 in"
							+ " \n'x : " + obje1.x + " y : " + y);
	
	
		C02 obje3 =new C02();
		
		obje3.x=20;
		y=40;	
		
		System.out.println("obje3 den sonra obje1 in x'i : " + obje1.x); //6
		System.out.println("obje3 den sonra obje2 in x'i : " + obje2.x); //6
		System.out.println("obje3 den sonra obje3 in x'i : " + obje3.x);//20
		
		
		System.out.println("obje3 den sonra obje1 in y'i : " + y); //40
		System.out.println("obje3 den sonra obje2 in y'i : " + y); //40
		System.out.println("obje3 den sonra obje3 in y'i : " + y); //40
		
		
	
	}

}
