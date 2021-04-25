package day01;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
		
		/* 
		 * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
		 * ve vucut kutle endexini bulun.
		 * 
		 * VKE= kilo/(boy*boy)   Kilo : kilogram, Boy : metre olmalidir
		 * 
		 * Ornek : imput : boy:180 kilo:80
		 * 		   output : Vucut kutle endexiniz : 24
		 * 					Vucut kutle endexinix : 24.691...
		 * 
		 */
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen boyunuzu metre cinsinden giriniz");
		
		double boy = scan.nextDouble();
		
		System.out.println("Lutfen kilonuzu kilogram cinsinden giriniz");
		
		double kilo = scan.nextDouble();
		
		
		System.out.println("Vucut kitle endexiniz : " +  (kilo/(boy*boy)));
		
		scan.close();

	}

}
