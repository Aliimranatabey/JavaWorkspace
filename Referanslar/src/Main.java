
public class Main {

	public static void main(String[] args) {
		
		Account account1=new Account("123123123123",123,"Mustafa Murat Coşkun","coskun.m.murat@gmail.com","05555555555");
		Account account2=account1;
		Account account3=new Account();
		//account2 ve account1 referansları aynı objeyi gösteriyorlar
		//account3 ve account1 referansları aynı objeyi göstermiyorlar
		//if içerisinde sorulan soru account1 ve account2 birbirine eşit midir değil , bu iki referans aynı objeyi gösteriyor mu diye soruyoruz .
		if(account1==account2) {
			System.out.println("Referanslar Aynı Objeyi Gösteriyorlar ...");
		}else {
			System.out.println("Aynı objeyi göstermiyorlar ...");
		}
		
		new Account("1455555553123",123,"Ahmet Can Demir","ahmetcandemir@gmail.com","05555333355").depositMoney(45);

	}
}
