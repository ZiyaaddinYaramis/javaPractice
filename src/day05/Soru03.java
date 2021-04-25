package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {


				/*
				 * Kullanicidan int  list uzunlugunu isteyin
				 * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
				 * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
				 *
				 * n = 5 icin (listin uzunlugu);
				 * input { 1 , 2 , 2 , 3 , 4}
				 * output {2}
				 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Olusturmak istediginiz listin uzunlugunu giriniz");
		int listLenght = scan.nextInt();
		
		
		
		List <Integer> list = new ArrayList<>();
		
		System.out.println("girdiginiz listin uzunlugu kadar list elemani ekleyiniz");
		
		for(int i = 0 ; i < listLenght ; i++) {
			list.add(scan.nextInt());
		}
		
		tekrarliEleman(list);
		
		scan.close();
		
	}
	
	public static void tekrarliEleman(List<Integer> ls) {
		
		List <Integer> tekrarliList = new ArrayList<>();
		
		for(int i = 0 ; i <ls.size() ; i++) {
			for(int j = i + 1 ; j < ls.size() ; j++) {
				if(ls.get(i) == ls.get(j) && !tekrarliList.contains(ls.get(i)) ) {
					tekrarliList.add(ls.get(i));
				}
			}
		}
		
		System.out.println("tekrarli listin elemanlari : " + tekrarliList);
		
		
		
		

	}

}
