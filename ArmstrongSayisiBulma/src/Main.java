import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 
		  Girilen bir sayının arstrong sayısı olup olmadığını bulacagız.
		  Örneğin ; 4 basamaklı bir sayının armstrong sayısı olması için şu şartı sağlaması gerekmektedir .
		  1634 = 1^4 + 6^4 + 3^4 + 4^4 (Buradaki 4 basamak sayısı)
		  371 = 3^3 + 7^3 + 1^3 (Buradaki 3 basamak sayısı)
		  
		  bu programı do while döngüsü ile yapacagız .
		 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.print("ARMSTRONG sayı olup olmadığını merak ettiğiniz sayıyı giriniz => ");
		int number=scan.nextInt();
		int[] numeral= {};
		int total=0;
		int i=0;
		int j=0;
		do {
			
			numeral[i]=number%10;
			number=number/10;
			i++;
			if(number>=1 || number<10) {
				total=numeral[j]^i;
				j++;
				if(j>i) {
					System.out.println("Döngüden çıkıldı ...!");
				}
				continue;
			}
			
		}while(number<1);
		
		System.out.println("Girilen sayı : "+number+" total : "+total);

	}

}
