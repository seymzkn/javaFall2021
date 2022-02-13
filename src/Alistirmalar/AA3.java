package Alistirmalar;

public class AA3 {

	public static void main(String[] args) {
		/*concatenation iki sekilde yapilir 1. + isareti 2. concat() methodu ile 
		
		String isim="Ali";
		String soyisim="Can";
		
		System.out.println(isim + " " + soyisim);
		
		System.out.println(isim.concat(" ").concat(soyisim));
		
		//Asagidaki String in tamamini buyuk veya kucuk harfe cevirin
		// String isim="aLI"; bunu "Ali"
		
		String isim1="aLI";
		System.out.println(""+isim.toUpperCase().charAt(0)+ isim.toLowerCase().charAt(1)+ isim.toLowerCase().charAt(2));
		
		//== yerine String'lerde equals methodu kullanilir
		
		String isim2= "Ali Can";
		String isim3="Ali Can";
		
		System.out.println(isim2.equals(isim3));
		
		System.out.println(isim2==isim3);
		
		String str1=new String ("Veli");
		String str2=new String ("Veli");
		
		String str3="Veli";
		String str4="Veli";
		
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
		
		System.out.println();
		
		
		//equalsIgnoreCase iki String i karsilastirirken case sensetive olmadan kiyaslama yapar
		
		String str1="ali";
		String str2="can";
		String str3="Ali Can";
		String str4=str1 + " " +str2;
		
		System.out.println(str4); //ali can
		
		System.out.println(str3.equals(str4));
		
		System.out.println(str3.equalsIgnoreCase(str4));
		
		
		
		//lenght()
		
		String isim="Ali Can";
		System.out.println(isim.length());
		
		String isim1=""; //hiclik lengts'i 0 dir.
		String isim2=null;
		//System.out.println(isim2.length());
		
		
		String str="Ali Kahya";
		System.out.println(str.length()); //9
		
		System.out.println(str.charAt(str.length()-1)); //String in son harfini veriyor
		
		
		
		//indexOF() verilen String deki istenen karakterin kullanildigi ilk index i dondurur. bize her zaman int doner
		
		String isim="Mustafa";
		
		System.out.println(isim.indexOf("f"));
		System.out.println(isim.indexOf('f'));
		System.out.println(isim.indexOf("fa"));
		System.out.println(isim.indexOf("a"));
		
		System.out.println(isim.indexOf('a', isim.indexOf(5)));
		System.out.println(isim.indexOf('a', isim.indexOf('a')+1));
		
		//LastIndexOf() verilen string de istenen karakterin kullanildigi son indexi dondurur
		
		String cumle="Java ogrenmek cok kolay";
		
		System.out.println(cumle.lastIndexOf('a')); //21
		
		System.out.println(cumle.lastIndexOf('z')); //-1
		
		System.out.println(cumle.lastIndexOf('a',10)); //3   0 dan 10'a kadar sayip oradan da geriye giderek a nerede var diye bakiyor 
														//buldugu a'nin indexini donduruyor
		
		System.out.println(cumle.indexOf('m')==cumle.lastIndexOf('m')); //true
		System.out.println(cumle.indexOf('a')==cumle.lastIndexOf('a')); //false
		
		
		
		//contains() verilen String in istenen karakteri icerip icermedigini kontrol eder, iceriyorsa true, icermiyorsa false dondurur. Char aratilamaz, mutlaka String aratilmalidir.
		//				parametre kelime de olabilir. Space varsa ona da true verir
		//				Var mi yok mu diye bakar, kac tane oldugunu vermez
		//				IndexOf ve LastIndexOF int dondurur, fakat equals ve contains true false yani boolean dondurur
		
		String cumle="Java ogrenmek cok kolay";
		
		System.out.println(cumle.contains(" ")); //true
		System.out.println(cumle.contains("va og")); //true
		System.out.println(cumle.contains("kal")); //false
		
		
		
		//Replace ()
		// Replace methodu char icinde kullanilabilir
		
		String str="Java ogrenmek cok kolay";
		
		System.out.println(str.replace("a", "x" ));
		
		//ReplaceAll()
		
		String cumle="Java 76ogrenmek c....ok k321olay";
		
		cumle=cumle.replaceAll("\\d", "");
		System.out.println(cumle);
		
		cumle=cumle.replace(".", "");
		System.out.println(cumle);
		
		
		
		//substring()
		
		String cumle="Java ogrenmek cok kolay";
		
		System.out.println(cumle.substring(3));
		
		System.out.println(cumle.substring(4, 9));	
		
		 */
		
		
		
		
		
		

	}

}
