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
	System.out.print("Armstrong olup olmadığını sorgulayacak bir sayı giriniz : ");
	int number=scan.nextInt();
	System.out.print("Basamak sayısını giriniz : ");
	int numeral=scan.nextInt();
	int value=number;
	int total=0;
	do {
		total=(int) (total+(Math.pow(value%10, numeral)));
		value=value/10;
	}while(value>=1);
	if(total==number) {
		System.out.println("Girdiğiniz sayı bir armstrong sayıdır (girilen sayı : ) "+number+" (armstrong değeri : ) "+total);
	}else {
		System.out.println("Girdiğiniz sayı bir armstrong sayı değildir ! (girilen sayı : ) "+number+" (armstrong değeri : ) "+total);
	}
	
	}

}
