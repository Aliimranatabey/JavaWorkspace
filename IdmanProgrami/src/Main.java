import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Idman Programına Hoşgeldiniz...");
		String exercises="Geçerli Hareketler....\n"
						+"Burpee\n"
						+"Pushup\n"
						+"Situp\n"
						+"Squat\n";
		System.out.println(exercises);
		System.out.println("Bir idman oluşturun ...");
		System.out.print("Burpee sayısı : ");
		int burpee=scan.nextInt();
		System.out.print("Pushup sayısı : ");
		int pushup=scan.nextInt();
		System.out.print("Situp sayısı : ");
		int situp=scan.nextInt();
		System.out.print("Squat sayısı : ");
		int squat=scan.nextInt();
		scan.nextLine();
		
		Idman idman=new Idman(burpee,pushup,situp,squat);
		System.out.println("İdmanınız Başlıyor ..");
		
		while(idman.finishExercise()==false) {
			System.out.print("Hareket Türü (Burpee , Pushup , Situp , Squat) ? :");
			String type=scan.nextLine();
			System.out.println("Bu hareketten kaç tane yapacaksınız ? : ");
			int number=scan.nextInt();
			scan.nextLine();
			idman.makeMove(type, number);
			
		}
		
		System.out.println("Idmanını başarıyla bitirdin :)");

	}

}
