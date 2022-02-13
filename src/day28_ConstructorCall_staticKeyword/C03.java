package day28_ConstructorCall_staticKeyword;

public class C03 {

	public static void main(String[] args) {

		// Java run time bir programdir
		// run tusuna bastigimizda Java calismaya baslar ve islemleri yapar
		// Java'nin isi bittiginde (calisma tusu kirmizidan griye dondugunde)
		// her sey de bitmis olur
		// Java duruncaya kadar static variablelar degismeye devam eder
		
		//static variable ve methodlar bulunduklari class ile ilintilidir (obje ile degil class ile)
		//baska bir class'da iken C02'deki static variable veya method'a ulasmak istedigimizde
		//C02.staticVariableIsmi ve C02.staticMethodISmi() yazmamiz yeterli olur
		
		C02 obje1=new C02();
		System.out.println("obje1 icin x : " + obje1.x + " obje1 icin y : " + C02.y);

		
		obje1.x++;
		//obje1.y++;
		//static bir variable'a class ismi uzerinden ulasmak yerine
		//instance variable'lar gibi obje ile ulasmaya calisirsaniz
		//Java CTE vermez ama solda ! isareti ile bizi uyarir
		// static bir field olan C02.y ye static yoldan ulas der
		
		
		System.out.println("obje1 icin x : " + obje1.x + " obje1 icin y : " + C02.y);
		
		C02 obje2=new C02();
		System.out.println("obje2 icin x : " + obje2.x + " obje2 icin y : " + C02.y);
		
		obje2.x++;
		C02.y++;
		System.out.println("islemden sonra obje2 icin x : " + obje2.x + " obje2 icin y : " + C02.y);
		
		System.out.println("obje 2 olusturulduktan ve islemden sonra obje1 in"
							+ " \n'x : " + obje1.x + " y : " + C02.y);
	
	
		C02 obje3 =new C02();
		
		obje3.x=20;
		C02.y=40;	
		
		System.out.println("obje3 den sonra obje1 in x'i : " + obje1.x); //6
		System.out.println("obje3 den sonra obje2 in x'i : " + obje2.x); //6
		System.out.println("obje3 den sonra obje3 in x'i : " + obje3.x);//20
		
		
		System.out.println("obje3 den sonra obje1 in y'i : " + C02.y); //40
		System.out.println("obje3 den sonra obje2 in y'i : " + C02.y); //40
		System.out.println("obje3 den sonra obje3 in y'i : " + C02.y); //40
		
		
	
	

	}

}
