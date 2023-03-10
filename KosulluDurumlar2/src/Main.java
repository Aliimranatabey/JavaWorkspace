import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen notunuzu giriniz : ");
		int note=scan.nextInt();
		if(note>=90) {
			System.out.println("AA");
		}
		else if(note>=85) {
			System.out.println("BA");
		}
		else if(note>=80) {
			System.out.println("BB");
		}
		else if(note>=75){
			System.out.println("CB");
		}
		else if(note>=70) {
			System.out.println("CC");
		}
		else if(note>=65) {
			System.out.println("DC");
		}
		else if(note>=60) {
			System.out.println("DD");
		}
		else {
			System.out.println("FF -> ( DERSTEN KALDINIZ ! )");
		}
		

	}

}
