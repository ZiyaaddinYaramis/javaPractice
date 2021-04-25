package day04;

import java.util.Scanner;

public class Soru04 {

	public static void main(String[] args) {
		
		/*
		
		Bir Stringin tersten ayni olup olmadigini bulunuz.  (Palindrom)
		 *
		 * ornek
		 *  madam , nurses run  ==> palindromdur
		 *
		 
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir string giriniz");
		
		String str = scan.nextLine().replace(" " ,"").toLowerCase();
		
		palindrom(str);
		
		scan.close();

		
	}
	
	public static void palindrom (String str) {
		
		String strTers = "";
		
		for (int i = str.length()-1;  i>=0; i--) {
			strTers= strTers + str.charAt(i);
		}
		
		if (strTers.equals(str)) {
			System.out.println("Girilen string palindromdur");
		} else {
			System.out.println("Girilen string palindromdur");
		}
		
	}

}
