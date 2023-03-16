import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int i=1;
		while(i<10) {
			System.out.println("i : "+ i++);
		}
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Faktoriyelinin alınmasını istediğiniz sayıyı giriniz : ");
		int number=scan.nextInt();
		int value=number;
		int factoriel=1;
		while(number>0) {
			factoriel*=number;
			number--;
		}

		System.out.println(value+"! = "+factoriel);
	}

}
