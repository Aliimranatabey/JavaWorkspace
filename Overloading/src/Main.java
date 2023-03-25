
public class Main {
	
	public static void skorhesapla(String name,int point) {
		System.out.println(name+" adlı oyuncunun "+point+" puanı var.");
	}
	public static void skorhesapla(int point) {
		System.out.println("İsimsiz oyuncunun "+point+" puanı var.");
	}
	public static void skorhesapla(String name) {
		System.out.println(name+" adlı oyuncunun hiç puanı yok");
	}

	public static void toplama(String a,String b) {
		System.out.println(a+" "+b);
	}
	public static void toplama(int a,int b) {
		System.out.println("Toplamları : "+(a+b));
	}
	
	public static void toplama(int a,int b,int c) {
		System.out.println("Toplamları : "+(a+b+c));
	}
	
	public static void main(String[] args) {
		
		toplama(3,4,5);
		toplama(3,4);
		toplama("Ali İmran","Atabey");
		skorhesapla("Ali İmran",100);
		skorhesapla(50);
		skorhesapla("Ali İmran");
		

	}

}
