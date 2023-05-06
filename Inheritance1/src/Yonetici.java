
public class Yonetici extends Calisan{//Subclass

	private int chargePerson;
	public Yonetici(String name,int wage,String department,int chargePerson) {
		/*
		 this.name=name;
		 this.wage=wage;
		 this.department=department;
		 */
		super(name,wage,department);
		this.chargePerson=chargePerson;
	}
	
	public void raiseMake(int raiseAmaount) {
		System.out.println("Çalışanlara "+raiseAmaount+" TL zam yapıldı .");
	}
	
	public void showInformations() {
		/*
		 System.out.println("İsim : "+getName());
		 System.out.println("Maaş : "+getWage());
		 System.out.println("Departman : "+getDepartment());
		 */
		super.showInformations();
		System.out.println("Sorumlu Kişi : "+getChargePerson());
	}
	
	public int getChargePerson() {
		return chargePerson;
	}
	public void setChargePerson(int chargePerson) {
		this.chargePerson = chargePerson;
	}
	
	
	
	
	
}
