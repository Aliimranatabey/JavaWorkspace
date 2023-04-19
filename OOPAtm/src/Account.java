
public class Account {

	private double balance;
	private String userName;
	private String password;
	

	public Account(double balance, String userName, String password) {
		super();
		this.balance = balance;
		this.userName = userName;
		this.password = password;
	}
	
	public void depositMoney(double amount) {
		balance+=amount;
		System.out.println("New Balance = "+balance);
	}
	
	public void withdrawMoney(double amount) {
		if(balance-amount<0) {
			System.out.println("Yeterli bakiye yok . Bakiye = "+balance);
		}else {
		balance-=amount;
		System.out.println("Yeni Bakiye = "+balance);
		}
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	
}
