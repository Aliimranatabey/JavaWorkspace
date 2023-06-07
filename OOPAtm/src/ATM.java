import java.util.Scanner;

public class ATM {

	public void run(Account account) {

		Login login = new Login();
		Scanner scan = new Scanner(System.in);
		System.out.println("BANKAMIZA HOŞ GELDİNİZ ....");
		System.out.println("***************************");
		System.out.println("Kullanıcı Girişi");
		System.out.println("***************************");
		int rightOfEntry = 3;

		while (true) {
			if (login.userLogin(account)) {
				System.out.println("Giriş Başarılı...");
				break;
			} else {
				System.out.println("Giriş Başarısız ! ");
				rightOfEntry--;
				System.out.println("Kalan Giriş Hakkınız : " + rightOfEntry);
			}
			if (rightOfEntry == 0) {
				System.out.println("Giriş Hakkınız Bitti ! ");
				return;
			}
		}
		System.out.println("******************************");

		int withdrawnMoney = 0;
		int deposit = 0;
		double balance = account.getBalance();
		String process = "";
		System.out.println("1 = BAKİYE OGRENME");
		System.out.println("2 = PARA CEKME");
		System.out.println("3 = PARA YATIRMA");
		System.out.print(
				"Farklı bir işlem yapmak istemiyorsanız 'q' ya basmanız yeterlidir , ana menüye dönmek için lütfen farklı bir tuşa basınız ! ");
		while (true) {
			System.out.print("Yapmak istediğiniz işlem nedir ? ");
			process = scan.next();
			scan.nextLine();
			if (process.equals("q")) {
				System.out.println("ATMDEN ÇIKILIYOR ...");
				break;
			}
			if (process.equals("1")) {
				System.out.println("BAKİYENİZ : " + account.getBalance());
			} else if (process.equals("2")) {
				System.out.print("Çekmek istediğiniz tutarı girniz : ");
				withdrawnMoney = scan.nextInt();
				account.withdrawMoney(withdrawnMoney);
			} else if (process.equals("3")) {
				System.out.print("Yatırmak istediğiniz tutarı giriniz : ");
				deposit = scan.nextInt();
				account.depositMoney(deposit);
			} else {
				System.out.println("GEÇERSİZ İŞLEM");
				break;
			}
		}
		account.setBalance(balance);
	}
}
