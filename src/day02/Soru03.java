package day02;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 3 tam sayi aliniz ve bu uc sayinin en buyuk ve en kucuk olanini bulunuz
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 3 sayi giriniz");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		
		if(n1 == n2 && n1 == n3) {
			System.out.println("Girilen uc sayi birbirine esittir");
		}else if (n1 > n2 && n1 > n3) {
			System.out.println(n1 + " girilen en buyuk sayidir");
			if(n2 > n3) {
				System.out.println(n3 + " girilen en kucuk sayidir");
			}else if (n3 > n2) {
				System.out.println(n2 + " girilen en kucuk sayidir");
			}else {
				System.out.println(n2 + " ve "+ n3 +" esittir");
			}
		}else if(n2 > n1 && n2 > n3) {
			System.out.println(n2 + " girilen en buyuk sayidir");
			if(n1>n3) {
				System.out.println(n3 + " girilen en kucuk sayidir");
			}else if(n3 > n1) {
				System.out.println(n1 + " girilen en kucuk sayidir");
			}else {
				System.out.println(n1 + " ve "+ n3 +" esittir");
			}
		}else if(n3 > n1 && n3 > n2) {
			System.out.println(n3 + " girilen en buyuk sayidir");
			if(n1> n2) {
				System.out.println(n2 +" girilen en kucuk sayidir");
			}else if (n2 > n1) {
				System.out.println(n1 +" girilen en kucuk sayidir");
			}else {
				System.out.println(n1 + " ve "+ n2 +" esittir");
			}
		}else {
			System.out.println("Yanlis giris yaptiniz");
		}
		
		scan.close();
			
		

	
		
	}

}



