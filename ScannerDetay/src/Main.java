import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);	
		
		int age1=scan.nextInt();
		int age2=scan.nextInt();
		int age3=scan.nextInt();
		
		System.out.println("Age1 : "+age1+" Age2 : "+age2+" Age3 : "+age3);
		
		int age=scan.nextInt();
		scan.nextLine();  // DUMMY
		String name=scan.nextLine();
		System.out.println("Age : "+age);
		System.out.println("Name : "+name);
							
	}

}
