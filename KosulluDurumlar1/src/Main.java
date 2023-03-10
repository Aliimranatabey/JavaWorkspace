import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Lütfen bir sayı giriniz : ");
		int number=scan.nextInt();
		if(number<0) {
			System.out.println("Negatif");
		}
		else {
			System.out.println("Pozitif veya 0");
		}
	}

}
