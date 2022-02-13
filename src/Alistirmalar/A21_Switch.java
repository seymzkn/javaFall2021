package Alistirmalar;

public class A21_Switch {

	public static void main(String[] args) {
		// Harf olarak girilen notu rakama cevirin
		
		char not='B';
		
		switch(not) {
		
		case 'A':
			System.out.println("85-100");
			break;
		case 'B':
			System.out.println("60-85");
			break;
		case 'C':
			System.out.println("50-60");
			break;
		case 'D':
			System.out.println("50`den dusuk");
			break;
		default:
			System.out.println("Gecersiz not");
		
		}

	}

}
