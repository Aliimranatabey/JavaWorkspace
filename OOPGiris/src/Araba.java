
public class Araba {

	/*public String color;
	public int doors;
	public int wheels;
	public String engine;
	public String model;*/
	
	private String color;
	private int doors;
	private int wheels;
	private String engine;
	private String model;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		if(wheels<=0) {
			System.out.println("Tekerlekler 0 dan küçük olamaz");
		}else {
		this.wheels = wheels;
		}
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
}