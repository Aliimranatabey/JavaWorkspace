import java.util.Scanner;

public class Login {
	
	public boolean userLogin(Account account) {
		
		Scanner scan=new Scanner(System.in);
		String userName;
		String password;
		
		System.out.print("Kullanıcı Adı : ");
		userName=scan.nextLine();
		System.out.print("Şifre : ");
		password=scan.nextLine();
		
		if(account.getUserName().equals(userName) && account.getPassword().equals(password)) {
			return true;
		}else {
			return false;
		}

	}

}
