package day29_staticBlocks_passByValue;

public class C01_StaticBlocks {
	
	static {
		System.out.println("static blok main method'dan bile once calisir ");
	}

	public static void main(String[] args) {
		System.out.println("Javada once main method calisir");

	}
	
	static {
		System.out.println("static blok nereye yazilirsa yazilsin main method'dan once calisir ");
	}
	
	//Eger birden fazla static blok varsa Java yukaridakini daha once calistirir
	
	

}