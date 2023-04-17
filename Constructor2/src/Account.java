
public class Account {
		
	private String accountNumber;
	private double balance;
	private String name;
	private String email;
	private String phoneNumber;
	
	public Account() {
		this("Bilgi Yok",0.0,"Bilgi Yok","Bilgi Yok","Bilgi Yok");
	}
	
	
	public Account(String name,String email,String phoneNumber) {
		this("154245",3000.0,name,email,phoneNumber);
	}
	
	public Account(String accountNumber,double balance,String name,String email,String phoneNumber) {
		System.out.println("Parametreli Constructor....");
		this.accountNumber=accountNumber;
		this.balance=balance;
		this.name=name;
		this.email=email;
		this.phoneNumber=phoneNumber;
	}
	
	public void showInfo() {
		System.out.println("Hesap No : "+this.accountNumber);
		System.out.println("Bakiye : "+this.balance);
		System.out.println("İsim : "+this.name);
		System.out.println("Email : "+this.email);
		System.out.println("Telefon No : "+this.phoneNumber);
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
