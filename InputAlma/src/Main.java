import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		if(scan.hasNextInt()) {
			int number=scan.nextInt();
			System.out.println("Number : "+number);
		}else {
			System.out.println("Please enter a number !!");
		}
		
		

	}

}
