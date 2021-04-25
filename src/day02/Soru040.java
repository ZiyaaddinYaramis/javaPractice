package day02;

import java.util.Scanner;

public class Soru040 {

	public static void main(String[] args) {



		/*
		 *Kullanici tarafindan girilen bir sayinin 
		 *mutlak degerini yazdirmak icin bir program yazin.
		 */
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz");
		
		int sayi = scan.nextInt();
		
		
		if (sayi>=0) {
			System.out.println("Girdiginiz sayinin Mutlak degeri : " + sayi);
		} else {
			System.out.println("Girdiginiz  sayinin Mutlak degeri : " + (sayi*-1));
		}
		
		scan.close();

	}

}
