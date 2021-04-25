package day02;

public class Soru02 {

	public static void main(String[] args) {
		
		/*
		 * Auto widening  ve Explicit narrowing ornekleri olusturunuz
		 * increment ve decrement ornekleri olusturunuz
		 * iki variable olusturun ve matematik operatorlerini kullanarak dort islem ve mod 
		 * islemlerini yapiniz 
		 * 
		 */
		
		
		int a = 34;
		System.out.println(a);
		double b = a ; // Auto widening
		System.out.println(b);
		
		System.out.println("==================================================");
		
		double c = 45.6;
		System.out.println(c);
		int d = (int) c; // Explicit narrowing
		System.out.println(d);
		
		System.out.println("==================================================");
		
		int i = 20;
		System.out.println(i);
		i = i+20;
		System.out.println(i);  // (i = i + 20)  ==> ile (i += 20) ayni sonucu verir
		i += 20 ; // increment
		System.out.println(i);
		
		System.out.println("==================================================");
		
		short s = 10;
		System.out.println(s);
		s = (short) (s + 10);
		System.out.println(s);
		s -= 10; // decrement
		System.out.println(s);
		
		System.out.println("==================================================");
		
		short x = 10;
		x = (short) (x+10);
		
		short y = 5;
		
		short toplama = (short)(x+y);
		short cikartma = (short)(x-y);
		short carpma = (short)(x*y);
		short bolme = (short)(x/y);
		
		System.out.println("Toplama "+ toplama);
		System.out.println("Cikartma "+ cikartma);
		System.out.println("Carpma "+ carpma);
		System.out.println("Bolme "+ bolme);
		
		System.out.println("==================================================");
		
		short mod =(short) (y%6);
		System.out.println("Mod "+mod);
		
		
		
	}

}



