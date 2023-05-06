
public class Yazilimci extends Calisan{
	
	private String languages;
	
	public Yazilimci(String name,String surname,int id,String languages) {
		super(name,surname,id);
		this.languages=languages;
	}
	
	public void toFormat(String os) {
		System.out.println(getName()+" "+os+"'ni yüklüyor...");
	}

	@Override
	public void showInformations() {
		super.showInformations();
		System.out.println("Yazılımcının bildiği diller : "+languages);
	}

	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String languages) {
		this.languages = languages;
	}
	
	
}
