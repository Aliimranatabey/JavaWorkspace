
public class Idman {

	private int burpee_number;
	private int pushup_number;
	private int situp_number;
	private int squat_number;
	
	public Idman(int burpee_number, int pushup_number, int situp_number, int squat_number) {
		this.burpee_number = burpee_number;
		this.pushup_number = pushup_number;
		this.situp_number = situp_number;
		this.squat_number = squat_number;
	}

	public int getBurpee_number() {
		return burpee_number;
	}

	public void setBurpee_number(int burpee_number) {
		this.burpee_number = burpee_number;
	}

	public int getPushup_number() {
		return pushup_number;
	}

	public void setPushup_number(int pushup_number) {
		this.pushup_number = pushup_number;
	}

	public int getSitup_number() {
		return situp_number;
	}

	public void setSitup_number(int situp_number) {
		this.situp_number = situp_number;
	}

	public int getSquat_number() {
		return squat_number;
	}

	public void setSquat_number(int squat_number) {
		this.squat_number = squat_number;
	}
	
	public void makeMove(String typeOfMovement,int number) {
		if(typeOfMovement.equals("Burpee")) {
			makeBurpee(number);
		}
		else if(typeOfMovement.equals("Pushup")) {
			makePushup(number);
		}
		else if(typeOfMovement.equals("Situp")) {
			makeSitup(number);
		}
		else if(typeOfMovement.equals("Squat")) {
			makeSquat(number);
		}
		else {
			System.out.println("GEÇERSİZ HAREKET");
		}
	}
	public void makeBurpee(int number) {
		if(burpee_number==0) {
			System.out.println("Yapacak burpee kalmadı !");
		}
		if(burpee_number-number<0) {
			System.out.println("Hedeflediğin Burpee geçtin . TEBRİKLER :)");
			burpee_number=0;
			System.out.println("Kalan Burpee : "+burpee_number);
		}
		else {
			burpee_number-=number;
			System.out.println("Kalan Burpee : "+burpee_number);
		}
	}
	public void makePushup(int number) {
		if(pushup_number==0) {
			System.out.println("Yapacak pushup kalmadı !");
		}
		if(pushup_number-number<0) {
			System.out.println("Hedeflediğin Pushup geçtin . TEBRİKLER :)");
			pushup_number=0;
			System.out.println("Kalan Pushup : "+pushup_number);
		}
		else {
			pushup_number-=number;
			System.out.println("Kalan Pushup : "+pushup_number);
		}
	}
	public void makeSitup(int number) {
		if(situp_number==0) {
			System.out.println("Yapacak situp kalmadı !");
		}
		if(burpee_number-number<0) {
			System.out.println("Hedeflediğin Situp geçtin . TEBRİKLER :)");
			situp_number=0;
			System.out.println("Kalan Situp : "+situp_number);
		}
		else {
			situp_number-=number;
			System.out.println("Kalan Situp : "+situp_number);
		}
	}
	public void makeSquat(int number) {
		if(squat_number==0) {
			System.out.println("Yapacak squat kalmadı !");
		}
		if(squat_number-number<0) {
			System.out.println("Hedeflediğin Squat geçtin . TEBRİKLER :)");
			squat_number=0;
			System.out.println("Kalan Squat : "+squat_number);
		}
		else {
			squat_number-=number;
			System.out.println("Kalan Squat : "+squat_number);
		}
	}
	public boolean finishExercise() {
		return (burpee_number==0) && (pushup_number==0) && (situp_number==0) && (squat_number==0);
	}
	
	
}
