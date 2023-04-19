
public class Main {

	public static void main(String[] args) {
		
		//Object oriented (Nesne Yönelimli) ATM Programı
		//Login Class'ı Kullanıcı Girişini Kontrol Edecek
		//Hesap Class'ı Hesap işlemlerini yapacak
		//ATM ise atmmizi çalıştıracak

		Account account=new Account(2000,"Ali İmran","12345");
		ATM atm = new ATM();
		atm.run(account);
		System.out.println("PROGRAMDAN ÇIKILIYOR ...");
	}

}
