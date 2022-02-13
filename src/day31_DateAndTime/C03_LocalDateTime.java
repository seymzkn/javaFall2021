package day31_DateAndTime;

import java.time.LocalDateTime;

public class C03_LocalDateTime {

	public static void main(String[] args) {
		
		LocalDateTime tarihSaat=LocalDateTime.now();
		
		System.out.println(tarihSaat); //2021-12-02T21:39:42.337
		
		System.out.println(tarihSaat.toString().startsWith("2021"));//true
		
	

	}

}
