package day10_Ternary_SwitchCase;

public class C11_StringManipulation {

	public static void main(String[] args) {
		// String olarak verilen bir degisken + ile baska bir degiskenle isleme sokulursa
		// JAVA bunlari yan yana ekler. Buna Concatenation denir
		
		String isim="Ali";
		String soyisim="Can";
		
		System.out.println(isim + " " + soyisim); // Ali Can
		
		//ayni islemi + sembolu yerine concat() ile de yapabiliriz
		
		System.out.println(isim.concat(soyisim)); //AliCan
		
		System.out.println(isim.concat(" ").concat(soyisim)); // Ali Can

	}

}
