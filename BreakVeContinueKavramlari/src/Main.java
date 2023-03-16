import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 
		 Break Anahtar Kelimesi
		 
		 Döngü herhangi bir yerde ve herhangi bir zamanda break ifadesi ile karşılaştığı
		 zaman çalışmasını durdurur. Böylelikle döngü hiçbir koşula bağlı kalmadan sonlan-
		 mış olur.
		 Break ifadesi sadece ve sadace içinde bulunduğu döngüyü sonlandırır . Eğer iç içe
		 döngüler varsa ve içteki döngüde break kullanılmışsa sadece içteki döngü sona erer.
		 
		 Continue Anahtar Kelimesi
		 
		 Döngü herhangi bir yerde ve herhangi bir zamanda continue ifadesi ile karşılaştığı
		 zaman geri kalan işlemlerini yapmadan direkt döngü bloğunun başına döner .
		 
		 */
		
		//Break Örneği : Kullanıcı çeşitli işlemler yaparken bizim istemediğimiz bir işlemi yapınca döngüyü sonlandırmak istersen (basit bir örnek);
		
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.print("Bir işlem giriniz : ");
			int process=scan.nextInt();
			if(process==-1) {
			System.out.println("Döngüden çıkılıyor...");
			break;
			}
		System.out.println("İşlem "+process);
		}
		
		for(int i=0;i<10;i++) {
			if(i==3 || i==5) {
				continue;
			}
			System.out.println("i :"+i);
		}
		
		//continue kavramı sonsuz döngüye sebep olabilir dikkat etmek gerekiyor 
		int j=0;
		while(j<10) {
			if(j==3 || j==5) {
				j++; //buraya bu satırı yazmasaydık sonsuz döngüye girecekti .
				continue;
			}
			System.out.println("j : "+j);
			j++;
		}
		
	}

}
