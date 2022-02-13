package Odevler;

public class O_02 {

	public static void main(String[] args) {
		// Soru 1) String methodlarini kullanarak “  Java ogrenmek123 Cok guzel@  ”  
		// String’ini “Java ogrenmek cok guzel.” sekline getirin.


				String cumle="  Java ogrenmek123 Cok guzel@  ";
				cumle=cumle.trim();
				cumle=cumle.replaceAll("\\s", "x"); //Javaxogrenmek123xCokxguzel@
				cumle=cumle.replaceAll("\\W", ""); //Javaxogrenmek123xCokxguzel
				cumle=cumle.replaceAll("\\d", "");
				cumle=cumle.replace("C", "c");
				cumle=cumle.replaceAll("x", " ");
				
				System.out.println(cumle);
				
				
				
				
				
	}

}
