package day19_WhileLoop_doWhileLoop;

public class C04_DoWhileLoop {

	public static void main(String[] args) {
		
		int i=0;
		
		while(i<5) {
			System.out.print(i + " "); //0 1 2 3 4 burada loop 6 kere calisir.cunku en son 5<5 icin de calisiyor
			i++;
		}
		
		System.out.println("");
		
		//while loop once kontrol eder sonra kodu calistirir
		//loop icinde artis yapilsa da bir sonraki kontrole kadar kod calismaya devam eder
		//bu da bazi durumlarda hatali sonuclara ulasmamiza sebep olabilir
		
		
		
		//do-while loop ise once islemi yapar sonra sarti kontrol eder
		//ozellikle kullanicidan deger almalar da do while loop tercih edilir
		int a=0;
		do {
			System.out.print(a + " ");
			a++;
			
		} while (a<5); //0 1 2 3 4 burada loop 5 kere calisir,5<5 i gorunce broken olur o calismaz.

	}

}
