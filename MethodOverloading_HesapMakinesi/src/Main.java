import java.util.Scanner;

public class Main {

	/*
	
	 Method overloading kullanarak bir tane hesap makinesi tasarlamaya çalışın .
	 Toplama ve Çarpma metodlarını 2 veya 3 parametre alacak şekilde tasarlayın .
	 
	*/
	
	public static int addition(int number1 , int number2 ) {
		return number1+number2;
	}
	public static int addition(int number1 , int number2 , int number3) {
		return number1+number2+number3;
	}
	public static int subtraction(int number1,int number2) {
		return number1-number2;
	}
	public static int multiplication(int number1 , int number2 ) {
		return number1*number2;
	}
	public static int multiplication(int number1 , int number2 , int number3) {
		return number1*number2*number3;
	}
	public static double division(int number1,int number2) {
		return ((double)number1/number2);
	}
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("HANGİ İŞLEMİ YAPMAK İSTİYORSUNUZ \n"
				+ "1 => TOPLAMA ISLEMI \n"
				+ "2 => CIKARMA ISLEMI \n"
				+ "3 => CARPMA ISLEMI \n"
				+ "4 => BOLME ISLEMI \n"
				+ "PROGRAMDAN CIKMAK ICIN 'q' YA BASINIZ");
		while(true) {
		System.out.print("Yapmak istediğiniz işlemin numarısını giriniz : ");
		String process=scan.next();
		
		if(process.equals("1")) {
			System.out.println("KAC TANE SAYIYI TOPLAMAK İSTİYORSUNUZ \n"
					+ "2 SAYI \n"
					+ "3 SAYI \n"
					);
			int howManyNumbers=scan.nextInt();
			if(howManyNumbers==2) {
				System.out.println("TOPLAMAK ISTEDIGINIZ SAYILARI GIRINIZ : ");
				System.out.println("SAYI 1 : ");
				int number1 =scan.nextInt();
				System.out.println("SAYI 2 : ");
				int number2 =scan.nextInt();
				System.out.println("GIRILEN SAYILARIN TOPLAMLARI "+addition(number1, number2));
			}else if(howManyNumbers==3) {
				System.out.println("TOPLAMAK ISTEDIGINIZ SAYILARI GIRINIZ : ");
				System.out.println("SAYI 1 : ");
				int number1 =scan.nextInt();
				System.out.println("SAYI 2 : ");
				int number2 =scan.nextInt();
				System.out.println("SAYI 3 : ");
				int number3 =scan.nextInt();
				System.out.println("GIRILEN SAYILARIN TOPLAMLARI "+addition(number1, number2,number3));
			}else {
				System.out.println("BUNUN ICIN UYGUN METOD BULUNAMIYOR");
			}
		}else if(process.equals("2")) {
				System.out.println("CIKARMAK ISTEDIGINIZ SAYILARI GIRINIZ : ");
				System.out.println("SAYI 1 : ");
				int number1 =scan.nextInt();
				System.out.println("SAYI 2 : ");
				int number2 =scan.nextInt();
				System.out.println("GIRILEN SAYILARIN FARKLARI "+subtraction(number1, number2));
		}else if(process.equals("3")) {
			System.out.println("KAC TANE SAYIYI CARPMAK İSTİYORSUNUZ \n"
					+ "2 SAYI \n"
					+ "3 SAYI \n"
					);
			int howManyNumbers=scan.nextInt();
			if(howManyNumbers==2) {
				System.out.println("CARPMAK ISTEDIGINIZ SAYILARI GIRINIZ : ");
				System.out.println("SAYI 1 : ");
				int number1 =scan.nextInt();
				System.out.println("SAYI 2 : ");
				int number2 =scan.nextInt();
				System.out.println("GIRILEN SAYILARIN CARPIMLARI "+multiplication(number1, number2));
			}else if(howManyNumbers==3) {
				System.out.println("CARPMAK ISTEDIGINIZ SAYILARI GIRINIZ : ");
				System.out.println("SAYI 1 : ");
				int number1 =scan.nextInt();
				System.out.println("SAYI 2 : ");
				int number2 =scan.nextInt();
				System.out.println("SAYI 3 : ");
				int number3 =scan.nextInt();
				System.out.println("GIRILEN SAYILARIN CARPIMLARI "+multiplication(number1, number2,number3));
			}else {
				System.out.println("BUNUN ICIN UYGUN METOD BULUNAMIYOR");
			}
		}else if(process.equals("4")) {
			System.out.println("BOLMEK ISTEDIGINIZ SAYILARI GIRINIZ : ");
			System.out.println("SAYI 1 : ");
			int number1 =scan.nextInt();
			System.out.println("SAYI 2 : ");
			int number2 =scan.nextInt();
			System.out.println("GIRILEN SAYILARIN BOLUMLERI "+division(number1, number2));
		}else if(process.equals("q")) {
			System.out.println("PROGRAMDAN CIKILIYOR ...");
			break;
		}
		else {
			System.out.println("GECERSIZ ISLEM !!!!");
		}
		}
		

	}

}
