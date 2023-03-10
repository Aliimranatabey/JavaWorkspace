import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 
		  Beden Kitle Endeksi : Kilo/(boy*boy)
		  BKİ 18.5 altıysa --> Zayıf 
		  BKİ 18.5 ise 25 arasındaysa --> Normal
		  BKİ 25 ile 30 arasındaysa --> Fazla Kilolu
		  BKİ 30 un üstündeyse --> Obez
		  
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Boyunuzu Giriniz (örn : 1.72) == ");
		double height=scan.nextDouble();
		System.out.print("Kilonuzu Giriniz == ");
		int weight=scan.nextInt();
		
		double index=weight/(height*height);
		
		if(index<18.5) {
			System.out.println("ZAYIF");
		}else if(18.5<=index && index<25){
			System.out.println("NORMAL");
		}else if(25<=index && index<30){
			System.out.println("FAZLA KİLOLU");
		}else {
			System.out.println("OBEZ");
		}
	}

}
