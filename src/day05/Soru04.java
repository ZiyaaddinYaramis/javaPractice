package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Soru04 {

	public static void main(String[] args) {
		 /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
		 *  1. Kullanicidan ismini isteyelim
		 *  2. Kullanici adindaki bosluklari silelim.
		 *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
		 *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
		 *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
​
		 */
		
		// 1. adim
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Kullanmak istediginiz username giriniz");
		// 2. adim
		String username = scan.nextLine().trim();
		
		List<String> veriTabanindakiKullanicilar = new ArrayList<>();
		veriTabanindakiKullanicilar.add("Ayse");
		veriTabanindakiKullanicilar.add("Ahmet");
		veriTabanindakiKullanicilar.add("Hasan");
		veriTabanindakiKullanicilar.add("Ali");
		veriTabanindakiKullanicilar.add("Mehmet");
		veriTabanindakiKullanicilar.add("Derya");
		
		// 3. adim
		
		boolean kullaniciIsmiVarMI = veriTabanindakiKullanicilar.contains(username);
		 
		// 4. adim 
		
		if(kullaniciIsmiVarMI) {
			System.out.println("Bu kullanici adi zaten alinmis.");
		}else {
			System.out.println("Bu kullanici adini kullanabilirsiniz");
		}
		
		if(kullaniciIsmiVarMI) {
			int rastgeleSayi = new Random().nextInt(100000);
			username = username + ""+rastgeleSayi;
			System.out.println("Yeni kullanici adi olarak bunu kullanabilirsiniz : " + username);
		}else {
			System.out.println("Yeni kullanici adi : " + username);
		}
		
		scan.close();

	}
	
}






