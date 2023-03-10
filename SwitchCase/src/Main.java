import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Bir sayı giriniz : ");
		int number1=scan.nextInt();
		System.out.print("Bir sayı daha giriniz : ");
		int number2=scan.nextInt();
		System.out.print("Bir sayı işlem numarası giriniz : ");
		int process=scan.nextInt();
		switch(process) {
			case 1:
				System.out.println("GİRİLEN İKİ SAYININ TOPLAMI : number1 + number2 = "+(number1+number2));
				break;
			case 2:
				System.out.println("GİRİLEN İKİ SAYININ FARKI : number1 - number2 = "+(number1-number2));
				break;
			case 3:
				System.out.println("GİRİLEN İKİ SAYININ ÇARPIMI : number1 * number2 = "+(number1*number2));
				break;
			case 4:
				System.out.println("GİRİLEN İKİ SAYININ TOPLAMI : number1 / number2 = "+(number1/number2));
				break;
			default:
				System.out.println("GEÇERSİZ İŞLEM");
				break;
				
		}

	}

}
