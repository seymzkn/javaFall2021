package day35_encapsulation_inheritance;

public class C01 {

	private double not=49.9;
	
	
	private boolean gecerMi=false;


	public void setNot(double not) { //baska classlardan argument olarak yazilan degerler bu methoda parametre olarak gelecek
		this.not = not; 				//instance variable a deger olarak atanir.gelen parametreyi instance olarak atar
	
										//return yok , sonuc onlara donmeyecek, goremeyecekler
	}


	public boolean isGecerMi() {
		
		if (not>=50) {
			gecerMi=true;
			
		}
		
		return gecerMi;
	}


	
	
	
	
	

}
