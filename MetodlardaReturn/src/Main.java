
public class Main {
	public static int ikiilecarp(int a) {
		//returnun altına yazılanlar çalışmaz!
		return a*2;
		//buraya yazılanlar çalışmaz
	}
	public static int ikiiletopla(int a) {
		return a+2;
	}
	public static int dortilecarp(int a) {
		return a*4;
	}
	public static void main(String[] args) {
		
		System.out.println("SONUC : "+dortilecarp(ikiiletopla(ikiilecarp(8))));

	}

}
