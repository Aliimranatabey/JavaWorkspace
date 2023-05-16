import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Aşağıdaki belirtilen sayfada ilgili seçimler yapılmıştır. Ekteki seçim;
		 * Dışhat Gelen Uçuş Tarihi : 12 Haziran 2021 Uçuş Numarası : TK 0111 Yolcu
		 * adedi : Yetişkin -> 1 Çocuk - > 1 Bebek -> 0 Seçimleri yapılan hizmetin
		 * Toplam ücreti : 103.50 € + KDV dir.
		 * 
		 * Seçimlerde değişiklik yapıldıktan sonra Toplam ücretin değişmesi
		 * beklenmektedir ve ekranda anlık değiştirilmesi istenmektedir. Bu değişikliği
		 * sayfayı refresh etmeden nasıl ekranda güncelleriz ?
		 */

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("1 => UÇUŞ BİLGİLERİ GİR \n" + "2 => SİSTEMDEN ÇIKIŞ YAP \n");
			String sec = scanner.nextLine();
			if (sec.equals("1")) {
				System.out.print("Uçuştaki Yetişkin Sayısı : ");
				int yetiskinSayisi = scanner.nextInt();
				System.out.print("Uçuştaki Çocuk Sayısı :");
				int cocukSayisi = scanner.nextInt();
				System.out.print("Uçuştaki Bebek Sayısı :");
				int bebekSayisi = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Uçuş Tarihini Giriniz : ");
				String ucusTarihi = scanner.nextLine();
				System.out.println("Uçuş Numarasını Giriniz : ");
				String numara = scanner.nextLine();

				List<Yolcu> yolcuAdedi = new ArrayList<>();
				Yolcu yolcu = new Yolcu();
				yolcu.setYetiskin(yetiskinSayisi);
				yolcu.setCocuk(cocukSayisi);
				yolcu.setBebek(bebekSayisi);
				yolcuAdedi.add(yolcu);

				List<Gelen> gelenListesi = new ArrayList<>();
				Gelen gelen = new Gelen();
				gelen.setUcusTarihi(ucusTarihi);
				gelen.setUcusNumarasi(numara);
				gelen.setYolcuAdedi(yolcuAdedi);
				gelenListesi.add(gelen);

				Ichat ichat = new Ichat(gelenListesi, 650, 350, 200);
				Dishat dıshat = new Dishat(gelenListesi, 2400, 1850, 1000);

				while (true) {
					System.out.print("***Ucus Bilgilerini Ogrenmek İstediginiz Hattı seçiniz : ***\n" + "1 => Iç Hat \n"
							+ "2 => Dış Hat \n" + "3 => Yeni Uçuş Bilgileri Gir");
					String hatSecimi = scanner.nextLine();
					for (int i = 0; i < ichat.getGelenListesi().size(); i++) {
						if (hatSecimi.equals("1")) {
							System.out.println("Ucus Bilgileri ; \n" + "Ucus Tarihi : "
									+ ichat.getGelenListesi().get(i).getUcusTarihi() + "\n" + "Ucus Numarasi : "
									+ ichat.getGelenListesi().get(i).getUcusNumarasi() + "\n" + "* YOLCU BILGILERI * \n"
									+ "Yetiskin Sayisi : "
									+ ichat.getGelenListesi().get(i).getYolcuAdedi().get(i).getYetiskin() + "\n"
									+ "Cocuk Sayisi : "
									+ ichat.getGelenListesi().get(i).getYolcuAdedi().get(i).getCocuk() + "\n"
									+ "Bebek Sayisi : "
									+ ichat.getGelenListesi().get(i).getYolcuAdedi().get(i).getBebek() + "\n"
									+ "TOPLAM UCRET TUTARİ : "
									+ ichat.gelenUcretHesaplama(
											ichat.getGelenListesi().get(i).getYolcuAdedi().get(i).getYetiskin(),
											ichat.getGelenListesi().get(i).getYolcuAdedi().get(i).getCocuk(),
											ichat.getGelenListesi().get(i).getYolcuAdedi().get(i).getBebek())
									+ " € + KDV");
						} else if (hatSecimi.equals("2")) {
							System.out.println("Ucus Bilgileri ; \n" + "Ucus Tarihi : "
									+ dıshat.getGelenListesi().get(i).getUcusTarihi() + "\n" + "Ucus Numarasi : "
									+ dıshat.getGelenListesi().get(i).getUcusNumarasi() + "\n"
									+ "* YOLCU BILGILERI *  \n" + "Yetiskin Sayisi : "
									+ dıshat.getGelenListesi().get(i).getYolcuAdedi().get(i).getYetiskin() + "\n"
									+ "Bebek Sayisi : "
									+ dıshat.getGelenListesi().get(i).getYolcuAdedi().get(i).getBebek() + "\n"
									+ "TOPLAM UCRET TUTARİ : "
									+ dıshat.gelenUcretHesaplama(
											dıshat.getGelenListesi().get(i).getYolcuAdedi().get(i).getYetiskin(),
											dıshat.getGelenListesi().get(i).getYolcuAdedi().get(i).getCocuk(),
											dıshat.getGelenListesi().get(i).getYolcuAdedi().get(i).getBebek())
									+ " € + KDV");
						} else {
							System.out.println("GEÇERSİZ GİRİŞ !");
							break;
						}
					}
					if (hatSecimi.equals("3")) {
						System.out.println("YENİ BİLGİLER GİRMENİZ İÇİN YÖNLENDİRİLİYORSUNUZ ...");
						break;
					}
				}
			} else if (sec.equals("2")) {
				System.out.println("SİSTEMDEN ÇIKIŞ YAPILIYOR....");
				break;
			} else {
				System.out.println("GEÇERSİZ GİRİŞ");
				continue;
			}
		}

	}

}
