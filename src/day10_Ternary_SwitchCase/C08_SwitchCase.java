package day10_Ternary_SwitchCase;

public class C08_SwitchCase {

	public static void main(String[] args) {
		// gun numarasina gore hafta ici veya hafta sonu yazdiralim
		
		
		int gunNo=6;
		
		switch(gunNo) {
			
			case 1:	
			case 2:	
			case 3:	
			case 4:	
			case 5:
				System.out.println("Haftaici");
				break;
			case 6:
			case 7:
				System.out.println("Haftasonu");
				break;
			default:
				System.out.println("Lutfen gecerli bir gun numarasi yaziniz");
			
			
			
		}
		
		

	}

}
