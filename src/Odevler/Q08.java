package Odevler;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		/*
	       kullanıcıdan bir e-posta adresi girmesini isteyin, @ ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
	        örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
	        */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen eposta adresinizi giriniz");
		
		String eposta=scan.next();
		int a=eposta.indexOf("@");
		
		if (eposta.contains("@")) {
			if (eposta.contains("hotmail.com") && eposta.endsWith("hotmail.com")) {
				 String b=eposta.substring(0,a) +eposta.substring(a).replaceAll("hotmail", "gmail");
		            System.out.println(b);
		            
		        }else if (eposta.contains("gmail.com") && eposta.endsWith("gmail.com")) {
		        System.out.println("Zaten gmail hesabı girdiniz");
		        } else {
		            System.out.println("sadece @ işareti içeriyor");
		        }
		        }else {
		            System.out.println("geçerli bir mail giriniz");
		        }
		        	
			
		}

	}

