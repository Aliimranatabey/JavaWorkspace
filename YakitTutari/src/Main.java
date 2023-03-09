import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Aracınız kilometrede ne kadar yakıyor ? => ");
		double kmAmount=scan.nextDouble();
		System.out.print("Aracınız kaç kilometre yol yapmıştır ? => ");
		int km=scan.nextInt();
		
		double netAmount= km*kmAmount;
		
		System.out.println("Aracınızın Yaktığı Net Tutar = "+netAmount+" TL ");
		
	}

}
