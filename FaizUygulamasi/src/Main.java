import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 
		 Faiz uygulaması
		 Kullanıcıdan anapara değerini ve daha sonra parasını kaç yıl vadeli yatırmak istediği
		 bilgisini alın ve her sene sonunda toplam para miktarını ekrana yazdırın .
		 
		 Faiz oranı : %6 faiz oranı 
		 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Ana Paranızı Girin : ");
		double mainMoney=scan.nextInt();
		System.out.print("Paranızı kaç yıl vadeli yatırmak istiyorsunuz (faiz oranı %6) ? ");
		int year=scan.nextInt();
		System.out.println("Ana Paranız : "+mainMoney);
		System.out.println("Yatırmak istediğiniz vadeli sene sayısı : "+year);
		for(int i=1;year>0;i++) {
			mainMoney=(mainMoney+(mainMoney*0.06));
			System.out.println(i+". Sene Sonundaki Toplam Paranız : "+mainMoney);
			year--;
		}
		
		

	}

}
