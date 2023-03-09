import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Birinci Dik Kenar : ");
		int steep1=scan.nextInt();
		System.out.print("İkinci Dik Kenar : ");
		int steep2=scan.nextInt();
		double hipotenus=Math.sqrt(((steep1*steep1)+(steep2*steep2)));
		
		System.out.println("Dik Kenarları "+steep1+" ve "+steep2+" olan dik üçgenin hipotenüsü ==> "+hipotenus);
		

	}

}
