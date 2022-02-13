package day16_forLoops;

import java.util.Iterator;

public class C01_ForLoop {

	public static void main(String[] args) {


		for (int i = 0; i <= 10; i++) {
			System.out.print(i + " ");
			
		}
		// for loop baslangic ve bitis sarti bir sayinin degerine bagli olan 
		// durumlarda tercih edilir
		
		
		/*for (int i = 0; i <10 ; i--) {
			System.out.print(i + " ");
			
		}
		*/
		//eger baslangic sayisi artis/azalis ile bitis degerine yaklasmiyor,uzaklasiyor ise
		//loop hicbir zaman durmaz
		//bu duruma sonsuz loop deriz ve bu durumun gerceklesmesini istemeyiz
		
		
		
		for (int i = 0; i >10; i++) { //loop broken olur. 0 10 dan buyuk degildir. for loop calisir for body calismaz.
			System.out.print(i + "acaba calisir mi?");
			
		}
		
		//eger ilk deger icin bitis sarti true olmazsa
		//daha ilk adimda loop broken olur
		//dolayisiyla loop body hic calismadan, loop un sonrasina gecilir
		//loop CALISIR , ama hicbir islem YAPMAZ
			
		}
		
		
		
		
		
	}


