package day42_AbstractClasses;

public class Ustabasi extends Isci{
	
	public void statu() {
		System.out.println("Bu classdaki tum personel ustabasidir. Imza : Ustabasi");
	}
	
	public void mass() {
		System.out.println("Ustabaslari aylik 10000 tl maas alir. Imza : Ustabasi");
	}
	
	public void mesai() {
		System.out.println("Ustabasi ariza durumunda ariza cozulunceye kadar calisir . Imza : Ustabasi");
	}
	
	// Obje olusturdugumuz en alttaki class parent class'lardaki methodlari
	// override edince , class'dan olusturulan objeler en dogru ve spesifik ozelliklere kavustu
	
	//Ama klasik parent -child iliskisinde tum methodlari override etme mecburiyeti yoktur
	
	// Java parent class'lardaki tum methodlari override etmek MECBURIYETI kazandirmak icin 
	// abstract class yapisini olusturmustur
	
	// Yani bir class'i abstract olarak tanimlarsaniz child classlar tum methodlari override
	// etmek zorunda kalir.
	
	// Dolayisiyla abstract yaptigimiz Parent classlar sadece kalip gorevi yapacaklar
	
	public static void main(String[] args) {
		
		Ustabasi ust1= new Ustabasi ();
		
		ust1.statu();
		ust1.maas();
		ust1.mesai();
		
	}

}
