
public class Main {

	public static void main(String[] args) {
		
		Account account1=new Account();
		account1.setAccountNumber("123456");
		account1.setBalance(1000.0);
		account1.setName("Mustafa Murat Coşkun");
		account1.setEmail("mmuratcoskun@gmail.com");
		account1.setPhoneNumber("324324");
		
		System.out.println("Bakiye : "+account1.getBalance());
		Account account2=new Account("1231245", 2000.0 ,"Ali Tatar","tatarali@gmail.com","87878787");
		System.out.println(account2.getBalance());
		account2.withdrawMoney(500);
		account2.depositMoney(2000);
		account2.withdrawMoney(4000);
	}

}
