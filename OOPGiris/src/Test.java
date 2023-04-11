
public class Test {
	public static void main(String[] args) {
		
		Araba araba1=new Araba();
		/*araba1.color="Red";
		araba1.doors=4;
		araba1.wheels=4;
		araba1.engine="16V";
		araba1.model="Renaultt";*/
		
		araba1.setEngine("16V");
		araba1.setWheels(-4);
		System.out.println(araba1.getEngine());
		
		/*
		araba2 diye bir referans oluşturmuşsun ama herhangi bir objeyi buna atamamışsın .Yani araba2 herhangi bir objeyi göstermiyor .
		
		Araba araba2;
		araba2.setEngine("16V");*/
	
		/*
		NullPointerException : senin bir referansın var ancak o referansa herhangi bir obje ataması yapmadan sen bu referansa erişmeye çalışıyorsun . 
		Yani bir tane obje varmış gibi o referansın methotlarına erişmeye çalışıyorsun . (ANDROID TARAFINDA ÇOKÇA ALINAN BİR HATA )
		
		Araba araba3=null;
		araba3.setDoors(2);
		 */
		
		
		
	}
}
