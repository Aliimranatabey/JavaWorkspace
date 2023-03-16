import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int i =0;
		do {
			System.out.println("i : "+ i++);
		}while(i<10);

		
		Scanner scan=new Scanner(System.in);
		System.out.print("Basamak değerlerinin toplamının bulunmasını istediğiniz sayıyı giriniz : ");
		int number=scan.nextInt();
		int numeral=0;
		int total=0;
		do {
			numeral=number%10;
			number=number/10;
			total+=numeral;
		}while(number>=1);
		System.out.println("Girilen sayının basamakları toplamı : "+total);
		
	}

}
