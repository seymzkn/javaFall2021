package day26_forEachLoop_constructor;

public class Car {
	//Java biz bir class olusturdugumuzda o class'dan obje uretecegimizi bilir
	// ve her class'a default bir constructor yerlestirir
	// Java'nin class'a koydugu bu default constructor gorulmez
	// ama obje uretmek uzere kod yazdigimizda otomatik olarak devreye girer
	
	// bir constructor olusturmak cok kolaydir
	// method'a benzer ama method'dan farklidir
	// 1-constructor ismi class ismi ile ayni olmalidir
	//class isimleri buyuk harfle basladigi icin Constructor ismi de buyuk harfle baslar
	//(method'dan 1. farki budur, methodlar kucuk harfle baslar)
	// 2- Constructor'larin return type'i olmaz
	//(method'dan 2. farki budur, methodlarin mutlaka return type'i olmalidir)
	
	public Car() {
		
	}
	//Java'nin her class'da olusturdugu constructor budur.
	
	
	public int yil;
	public String renk;
	public String model;
	public int km;
	public boolean satilikMi;
	
	//Bugun itibariyle claaslarda main method olma mecburiyeti kaldirilmistir
	//Ancak bildigimiz gibi main method olmayan bir class direk calistirilamaz
	//Main method'u olmayan classlar baska classlardan obje olusturularak kullanilmak uzere
	//ihtiyac duyulan variable ve methodlari sakladigimiz bir depo gibidir

}
