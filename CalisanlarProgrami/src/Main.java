import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 
		 Çalışanlar Programı
		 
		 Calisan sınıfı şeklinde bir üst sınıf
		 
		 Calisan sınıfından türeyen Yazilimci adında bir alt sınıf
		 Calisan sınıfından türeyen Yonetici adında bir alt sınıf
		 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Çalışanlar programına hoş geldiniz ...");
		String transactions="İşlemler\n"
				+ "1.Yazılımcı İşlemleri\n"
				+ "2.Yönetici İşlemleri\n"
				+ "Çıkış için q 'ya basın";
		System.out.println(transactions);
		
		while(true) {
			System.out.println("İşlemi seçiniz : ");
			String transaction=scan.nextLine();
			
			if(transaction.equals("q")) {
				System.out.println("Programdan çıkılıyor ...");
				break;
			}else if(transaction.equals("1")) {
				Yazilimci yazilimci=new Yazilimci("Ali İmran","Atabey",123,"Java,Python,C#,Html,Css,Js,Vue");
				String programmerTransactions="1. Format At\n"
						+ "2. Bilgileri Goster\n"
						+ "Yazılımcı işlemlerinden çıkış için q ' ya basın";
				System.out.println(programmerTransactions);
				while(true) {
					System.out.println("İşlemi Seçiniz : ");
					String p_transaction=scan.nextLine();
					if(p_transaction.equals("q")) {
						System.out.println("Yazılımcı işlemlerinden çıkılıyor ...");
						break;
					}
					else if(p_transaction.equals("1")) {
						System.out.println("İşletim sistemi : ");
						String os=scan.nextLine();
						yazilimci.toFormat(os);
					}
					else if(p_transaction.equals("2")) {
						yazilimci.showInformations();
					}else {
						System.out.println("Geçersiz yazılımcı işlemi ...");
					}
				}
			}else if(transaction.equals("2")) {
				Yonetici yonetici=new Yonetici("Teber","Özceyhan",145,8);
				String adminTransaction="1. Zam yap\n"
						+ "2. Bilgileri göster\n"
						+ "Yönetici işlemlerinden çıkış için q'ya basın";
				System.out.println(adminTransaction);
				while(true) { 
					System.out.println("İşlemi Seçiniz : ");
					String a_transaction=scan.nextLine();
					if(a_transaction.equals("q")) {
						System.out.println("Yönetici işlemlerinden çıkılıyor ...");
						break;
					}
					else if(a_transaction.equals("1")) {
						System.out.println("Yapılacak Zam Miktarı: ");
						int raiseAmaount=scan.nextInt();
						scan.nextLine();
						yonetici.makeRaise(raiseAmaount);
					}
					else if(a_transaction.equals("2")) {
						yonetici.showInformations();
					}else {
						System.out.println("Geçersiz yonetici işlemi ...");
					}
				}
			}else{
				System.out.println("Geçersiz İşlem ...");
			}
		}
		
	}

}
