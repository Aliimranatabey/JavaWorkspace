
public class Main {

	public static void main(String[] args) {
		
		Account account1=new Account();
		Account account2=new Account("Ahmet Can","example@gmail.com","87845678");
		System.out.println(account2.getEmail());
		System.out.println(account2.getBalance());
		account2.showInfo();
	}

}
