
public class Yonetici extends Calisan{
	
	private int numberOfPersonsResponsible;
	
	public Yonetici(String name,String surname,int id,int numberOfPersonResponsible) {
		super(name,surname,id);
		this.numberOfPersonsResponsible=numberOfPersonResponsible;
	}

	@Override
	public void showInformations() {
		super.showInformations();
		System.out.println("Yöneticinin sorumlu olduğu kişi sayısı : "+numberOfPersonsResponsible);
	}
	
	public void makeRaise(int raiseAmaount) {
		System.out.println(getName()+" çalışanlara "+raiseAmaount+" kadar zam yapıyor..");
	}

	public int getNumberOfPersonsResponsible() {
		return numberOfPersonsResponsible;
	}

	public void setNumberOfPersonsResponsible(int numberOfPersonsResponsible) {
		this.numberOfPersonsResponsible = numberOfPersonsResponsible;
	}
	
	
}
