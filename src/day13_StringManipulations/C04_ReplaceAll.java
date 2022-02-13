package day13_StringManipulations;

public class C04_ReplaceAll {

	public static void main(String[] args) {


		String str= "*Java 98ogrenmek c..ok k876olay";
		
		//replaceAll methodlari kullanarak Java ogrenmek cok kolay
		
		str=str.replaceAll("\\d", ""); //burada rakamlardan kurtuluruz
		
		System.out.println(str); // *Java ogrenmek c..ok kolay
		
		str=str.replaceAll("\\s", "x");
		System.out.println(str); //*Javaxogrenmekxc..okxkolay
		

		
		str=str.replaceAll("\\W", "");
		
		System.out.println(str);//Javaxogrenmekxcokxkolay
		
		str=str.replace("x", " ");
		System.out.println(str); //Java ogrenmek cok kolay
		
		

		

	}

}
