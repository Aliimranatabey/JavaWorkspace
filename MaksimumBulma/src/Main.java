import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Bir sayı giriniz : ");
		int number1=scan.nextInt();
		System.out.print("Bir sayı daha giriniz : ");
		int number2=scan.nextInt();
		System.out.print("Bir sayı daha giriniz : ");
		int number3=scan.nextInt();
		int maximum=0;
		int minumum=0;
		if(number1>number2 && number1>number3) {
			maximum=number1;
		}else if(number2>number1 && number2>number3){
			maximum=number2;
		}else {
			maximum=number3;
		}
		System.out.println("GİRİLEN SAYILARDAN BÜYÜK OLAN : "+maximum);
		
		if(number1<=number2 && number1<=number3) {
			minumum=number1;
		}
		else if(number2<=number1 && number2<=number3){
			minumum=number2;
		}
		else {
			minumum=number3;
		}
		System.out.println("GİRİLEN SAYILARDAN KÜÇÜK OLAN : "+minumum);
		

	}

}
