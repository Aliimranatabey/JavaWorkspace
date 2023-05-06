
public class Hayvan {
	
	private String name;
	private int	kilo;
	private int size;
	private int legsNumber;
	
	public Hayvan(String name,int kilo,int size,int legsNumber) {
		this.name=name;
		this.kilo=kilo;
		this.size=size;
		this.legsNumber=legsNumber;
	}
	
	public void eat() {
		System.out.println("Hayvan şu an yemek yiyor...");
	}
	
	public void moveOn(int speed) {
		System.out.println("Hayvan "+speed+" hızı ile hareket ediyor...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKilo() {
		return kilo;
	}

	public void setKilo(int kilo) {
		this.kilo = kilo;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getLegsNumber() {
		return legsNumber;
	}

	public void setLegsNumber(int legsNumber) {
		this.legsNumber = legsNumber;
	}
	
	
}
