
public class Calisan {//Superclass or Baseclass
	private String name;
	private int wage;
	private String department;
	
	public Calisan(String name,int wage,String department) {
		this.name=name;
		this.wage=wage;
		this.department=department;
	}
	
	public void work() {
		System.out.println("Çalışan çalışıyor ...");
	}
	
	public void showInformations() {
		System.out.println("İsim : "+getName());
		System.out.println("Maaş : "+getWage());
		System.out.println("Departman : "+getDepartment());
	}
	
	public void departmentChange(String newDepartment) {
		System.out.println("Departman değiştiriliyor...");
		setDepartment(newDepartment);
		System.out.println("Yeni Departman : "+getDepartment());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWage() {
		return wage;
	}

	public void setWage(int wage) {
		this.wage = wage;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
