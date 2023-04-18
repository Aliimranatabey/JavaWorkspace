
public class Account {
	private String accountNumber;
	private double balance;
	private String name;
	private String email;
	private String phoneNumber;
	
	public void depositMoney(double amount) {
		balance+=amount;
		System.out.println("New Balance = "+balance);
	}
	
	public void withdrawMoney(double amount) {
		if(amount>1500) {
			System.out.println("Bir günde 1500 TL'den fazla para çekemezsiniz...");
		}
		if(balance-amount<0) {
			System.out.println("Yeterli bakiye yok . Bakiye = "+balance);
		}else {
		balance-=amount;
		System.out.println("Yeni Bakiye = "+balance);
		}
	}
	
	public Account() {
		System.out.println("Kendi Yazdığımız Constructor....");
	}
	
	public Account(String accountNumber,double balance,String name,String email,String phoneNumber) {
		System.out.println("Parametreli Constructor....");
		this.accountNumber=accountNumber;
		this.balance=balance;
		this.name=name;
		this.email=email;
		this.phoneNumber=phoneNumber;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
