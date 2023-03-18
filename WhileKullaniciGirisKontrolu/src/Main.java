import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int rightOfEntry=3;
		String username="Ali Imran";
		String password="Atabey";
		
		while(true) {
			System.out.print("Kullanıcı Adınız : ");
			String entryUsername=scan.nextLine();
			System.out.print("Şifreniz : ");
			String entryPassword=scan.nextLine();
			if(username.equals(entryUsername) && password.equals(entryPassword)) {
				System.out.println("BİLGİLER DOĞRU sisteme yönlendiriliyorsunuz ..."+username);
				break;
			}else if(username.equals(entryUsername) && !password.equals(entryPassword)) {
				System.out.println("Şifreniz yanlış lütfen tekrar deneyin !");
				rightOfEntry--;
				System.out.println("KALAN GİRİŞ HAKKI : "+rightOfEntry);
			}else if(!username.equals(entryUsername) && password.equals(entryPassword)) {
				System.out.println("Kullanıcı adınız yanlış lütfen tekrar deneyin !");
				rightOfEntry--;
				System.out.println("KALAN GİRİŞ HAKKI : "+rightOfEntry);
			}else{
				System.out.println("Kullanıcı adınız ve şifreniz yanlış lütfen tekrar deneyin !");
				rightOfEntry--;
				System.out.println("KALAN GİRİŞ HAKKI : "+rightOfEntry);
			}
			if(rightOfEntry==0) {
				System.out.println("HAKKINIZ KALMADI ! :(");
				break;
			}
		}
	}

}
