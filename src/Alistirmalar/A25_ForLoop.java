package Alistirmalar;

public class A25_ForLoop {

	public static void main(String[] args) {
		// 100 den baslayarak 50 ye kadar(50 dahil) olan sayilari
		//aralarinda , olarak ayni satirda yazin
		
		for (int i = 100; i >= 50; i--) {
			
			if (i==50) {
				System.out.print(i);
				
			} else {
				System.out.print(i + ",");

			}
			
		}
	}

}
