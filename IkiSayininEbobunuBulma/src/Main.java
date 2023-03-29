import java.util.Scanner;

public class Main {

	public static int findEbob(int number1,int number2) {
		int ebob=1;
		// for içerisindeki koşulu && şeklinde oluşturmamızın sebebi i mizin herhangi bir sayıdan büyük olmamasını sağlamak atıyorum 15 25 sayılarının ebobunu bulurken i değeri 16 ve üzerine çıkmasını istemiyoruz çünkü .
		for(int i=1;i<=number1 && i<=number2 ; i++) {
			if(number1%i==0 && number2%i==0) {
				ebob=i;
			}
		}
		return ebob;
	}
	public static void main(String[] args) {
		
		//Kullanıcıdan alınan 2 sayının ebobunu bulma
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Ebob'unu merak ettiğiniz iki sayi giriniz :");
		System.out.print("1.SAYI : ");
		int number1=scan.nextInt();
		System.out.print("2.SAYI : ");
		int number2=scan.nextInt();
		System.out.println("Girilen Sayıların Ebobu : "+findEbob(number1,number2));
		

	}

}
