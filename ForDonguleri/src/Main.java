import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i=0;
		for(;i<5;i++) {
			System.out.println("i : "+i);
		}
		
		int a=0;
		int b=0;
		
		for(;a<10 && b>0;a++,b--) {
			System.out.println("a : "+a);
			System.out.println("b : "+b);
		}
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Faktoriyelinin alınmasını istediğiniz değeri giriniz : ");
		int k=scan.nextInt();
		int factoiral=1;
		for(int s=1;s<=k;s++) {
			factoiral*=s;
		}
		System.out.println("Girilen değerin ( "+k+" ) faktoriyeli : "+factoiral);

	}

}
