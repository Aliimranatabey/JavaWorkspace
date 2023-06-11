import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * 
		 * While döngüsü ile bir tane ATM programı yaapacagız :
		 * 
		 * İşlemler 1.işlem : Bakiye Öğrenme 2.işlem : Para Çekme 3.işlem : Para Yatırma
		 * Çıkış : q
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		int withdrawnMoney = 0;
		int deposit = 0;
		int balance = 0;
		int process = 0;
		String exit = "q";
		System.out.println("1 = BAKİYE OGRENME");
		System.out.println("2 = PARA CEKME");
		System.out.println("3 = PARA YATIRMA");
		System.out.print(
				"Farklı bir işlem yapmak istemiyorsanız 'q' ya basmanız yeterlidir , ana menüye dönmek için lütfen farklı bir tuşa basınız ! ");
		while (true) {

			System.out.print("Yapmak istediğiniz işlem nedir ? ");
			process = scan.nextInt();
			if (process == 1) {
				System.out.println("BAKİYENİZ : " + balance);

				exit = scan.next();
				if (exit.equals("q")) {
					System.out.println("ATMDEN ÇIKILIYOR ...");
					break;
				} else {
					continue;
				}
			} else if (process == 2) {
				System.out.print("Çekmek istediğiniz tutarı girniz : ");
				withdrawnMoney = scan.nextInt();
				if (withdrawnMoney <= balance && balance != 0) {
					balance -= withdrawnMoney;
					System.out.println("KALAN BAKİYENİZ : " + balance);

					exit = scan.next();
					if (exit.equals("q")) {
						System.out.println("ATMDEN ÇIKILIYOR ...");
						break;
					} else {
						continue;
					}
				} else {
					System.out.println("YETERLİ BAKİYENİZ YOK ! ");

					exit = scan.next();
					if (exit.equals("q")) {
						System.out.println("ATMDEN ÇIKILIYOR ...");
						break;
					} else {
						continue;
					}
				}
			} else if (process == 3) {
				System.out.print("Yatırmak istediğiniz tutarı girniz : ");
				deposit = scan.nextInt();
				balance += deposit;
				System.out.println("YENİ BAKİYENİZ : " + balance);

				exit = scan.next();
				if (exit.equals("q")) {
					System.out.println("ATMDEN ÇIKILIYOR ...");
					break;
				} else {
					continue;
				}
			} else {
				System.out.println("GEÇERSİZ İŞLEM");
				break;
			}
		}

	}

}
