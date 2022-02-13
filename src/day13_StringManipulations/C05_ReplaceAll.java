package day13_StringManipulations;

public class C05_ReplaceAll {

	public static void main(String[] args) {
		
		String cumle="Java    cok zevkli";
		
		cumle=cumle.replaceAll("\\s+", " ");
		System.out.println(cumle); //Java cok zevkli

		
	
		System.out.println(cumle.replaceAll("[a-z]", "")); //J a ile z arasindaki harfleri  yok etti
		System.out.println(cumle.replaceAll("\\S", "*")); //**** ** ****** bosluk disindaki tum karakterleri yok etti
		
		System.out.println(cumle.replaceAll("\\s", "*")); //Java*cok*zevkli bosluklarin yerine * yapti
	}

}
