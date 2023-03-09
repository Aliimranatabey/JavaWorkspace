import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Lütfen bir değer giriniz : ");
		int number1=scan.nextInt();
		System.out.print("Lütfen bir değer daha giriniz : ");
		int number2=scan.nextInt();
		System.out.println("Değerler Değiştirilmeden Önce Number1 : "+number1+ " Number2 : "+number2);
		int value=number1;
		number1=number2;
		number2=value;
		System.out.println("Değerler Değiştirildikten Sonra Number1 : "+number1+" Number2 : "+number2);
		
		
	}

}
