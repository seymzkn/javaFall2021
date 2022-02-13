package day43_Interface;

public class C03_Concrete implements C02_Interface{

	public static void main(String[] args) {
		
		C03_Concrete concretObje=new C03_Concrete();
		
		// Interface de default keyword kullanarak olusturdugumuz body si olan emthodlara
		// child concrete classlardan obje vasitasiyla 
		concretObje.kaporta();

	}

	// bir interface de static veya default keyword kullanarak body si olan bir method olusturursak
	// Bu interface e implements eden concrete child classlar bu methodlari
	// implement etmek ZORUNDA degildir
	@Override
	public void motor() {
		
		
	}

}
