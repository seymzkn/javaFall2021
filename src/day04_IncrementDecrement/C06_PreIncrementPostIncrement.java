package day04_IncrementDecrement;

public class C06_PreIncrementPostIncrement {

	public static void main(String[] args) {
		// PreIncrement ve PostIncrement sadece sayi++ veya sayi-- yazimi icin gecerlidir
		
		
		int sayi=10;
		
		sayi++; //11
		sayi++; //12
		sayi++; //13
		
		System.out.println(sayi); //13
		
		System.out.println(sayi++); // 13 bu satirda iki islem var
									// bir artirma var, bir de yazdirma var
		System.out.println(sayi); 	//14
		
		// once artirmak sonra yazdirmak isterseniz ++sayi yazmaliyiz
		// once yazdirmak sonra artirmak isterseniz sayi++
		
		System.out.println(++sayi); //15
		
		

	}

}
