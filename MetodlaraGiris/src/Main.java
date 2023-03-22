import java.util.Scanner;

public class Main {

	public static void greeting() {
		System.out.println("Merhaba nasılsınız ? ");
		System.out.println("Selamlar ...");
	}
	
	public static void factoriel() {
		Scanner scan=new Scanner(System.in);
		System.out.print("Bir sayı giriniz : ");
		int number=scan.nextInt();
		int factoriel=1;
		while(number>0) {
			factoriel*=number;
			number--;
		}
		System.out.println("Faktoriyel = "+factoriel);
	}
	public static void main(String[] args) {
		
		/*
		 Erişim_Belirleyici(Opsiyonel)public,private vs.  Ekstra_Özellikler(final,static vs.) Dönüş_Tipi Fonksiyon_Adı(Parametreler){
		 
		 //Burası Fonksiyon Bloğu
		
		 //Fonksiyonun yapacağı işlemler burada olacak
		 
		 }
		 */

		greeting();
		factoriel();
		
	}

}
