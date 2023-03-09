import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Beden Kitle Endeksi " kilo/(boy*boy) "
		Scanner scan=new Scanner(System.in);	
		System.out.print("Boyunuzu Giriniz (Örnek 1.72) =>");
		double height=scan.nextDouble();
		System.out.print("Kilonuzu Giriniz : ");
		int weight=scan.nextInt();
		
		double index=weight/(height*height);
		System.out.println("Sizin Boy Kilo Endeksiniz : "+index);
		
	}

}
