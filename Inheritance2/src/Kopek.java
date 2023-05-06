
public class Kopek extends Hayvan{
	
	private int teethsNumber;
	
	public Kopek(String name,int kilo,int size,int legsNumber,int teethsNumber) {
		super(name,kilo,size,legsNumber);
		this.teethsNumber=teethsNumber;
	}
	
	public void moveOn(int speed) {
		System.out.println("Köpek "+speed+" hızı ile hareket ediyor");
	}
	
	public void run(int speed) {
		System.out.println("Köpek Koşuyor ...");
		//super.moveOn(speed);
		moveOn(speed);
	}

	public int getTeethsNumber() {
		return teethsNumber;
	}

	public void setTeethsNumber(int teethsNumber) {
		this.teethsNumber = teethsNumber;
	}
	
	
}
