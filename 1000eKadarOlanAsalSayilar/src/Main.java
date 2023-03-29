import java.util.Scanner;

public class Main {

	public static boolean primeNumber(int number) {
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		/*
		 * 1'den 1000 e kadar olan sayilardan asal olanlari ekrana yazdirin .
		 * Asal Sayi : 1'e ve kendisinden başka hiçbir sayiya bolunmeyen sayiya asal sayi denir .
		*/
		
		for(int i=2;i<1000;i++){
			if(primeNumber(i)) {
				System.out.println("Asal olan : "+i);
			}
		}
		

	}

}
