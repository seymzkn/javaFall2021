package day29_staticBlocks_passByValue;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList {

	public static void main(String[] args) {
		// bir list olusturalim
		//sonra list elemanlarini degistir methodu yazip orda
		//list elemanlarindan bazilarini degistirelim
		//method void olsun
		//main methoda dondukten sonra yeniden listi yazdiralim

		List<String> harfler=new ArrayList<>();
		harfler.add("A");
		harfler.add("B");
		harfler.add("C");
		
		//Javada List ve Array gibi objeler icinde Pass By Value gecerlidir
		//Yani farkli bir methodda array veya yeni deger atamasi yaparsaniz
		//orjinal array veya list degismez
		
		listElemanlarDegistir(harfler); //[D, B, C]
		System.out.println("Main method'a donunce list : "+ harfler); //[D, B, C]
		
		//Javada List ve Array gibi objeler icinde Pass By Value gecerlidir
		//Yani farkli bir methodda array veya yeni deger atamasi yaparsaniz
		//orjinal array veya list degismez
		
		
		
		listDegistir(harfler);//methodda yeni deger atadigim halde harfler listeso degismedi
		System.out.println("Liste yeni list atadiktan sonra main methoda donunce list : " + harfler); //[D, B, C]
	}

	private static void listDegistir(List<String> harfler) {
		harfler=new ArrayList<>();
		System.out.println("List e yeni deger atayinca : "  + harfler);
		
	}

	private static void listElemanlarDegistir(List<String> harfler) {
		
		harfler.set(0, "D");
		
		System.out.println("method'da degistirdigimiz list : "+ harfler);
		
	}

}
