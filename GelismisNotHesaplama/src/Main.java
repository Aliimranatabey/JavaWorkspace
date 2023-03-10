import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 
		 Kullanıcıdan Vize1,Vize2 ve Final notunu alarak bir harf hesaplama sistemi yap.
		 Ayrıca kullanıcıdan okuldaki genel ortalamasını alarak ,
		 DD alma ve 2.50'nin altında olma koşuluna göre ekrana bir tavsiye mesajı yazdırın .
		 
		 Vize1 toplam notun %30 una etki edecek 
		 Vize2 toplam notun %30 una etki edecek
		 Final toplam notun %40 ına etki edecek
		 
		 ToplamNot >= 90 ---> AA
		 ToplamNot >= 85 ---> BA
		 ToplamNot >= 80 ---> BB
		 ToplamNot >= 75 ---> CB
		 ToplamNot >= 70 ---> CC
		 ToplamNot >= 65 ---> DC
		 ToplamNot >= 60 ---> DD
		 ToplamNot <  60 ---> FF
		 
		 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Vize1 notunuzu giriniz == ");
		int vize1=scan.nextInt();
		System.out.print("Vize2 notunuzu giriniz == ");
		int vize2=scan.nextInt();
		System.out.print("Final notunuzu giriniz == ");
		int finalnot=scan.nextInt();
		System.out.println("Okul Not Ortalamanızı Giriniz (örn: 2.42) == ");
		double gpa=scan.nextDouble();
		String letterGrade="SS";
		double totalnote=(vize1*0.3)+(vize2*0.3)+(finalnot*0.4);
		
		if(totalnote>=90) {
			letterGrade="AA";
		}else if(totalnote>=85) {
			letterGrade="BA";
		}else if(totalnote>=80) {
			letterGrade="BB";
		}else if(totalnote>=75) {
			letterGrade="CB";
		}else if(totalnote>=70) {
			letterGrade="CC";
		}else if(totalnote>=65) {
			letterGrade="DC";
		}else if(totalnote>=60) {
			letterGrade="DD";
		}else {
			letterGrade="FF";
		}
		
		if(letterGrade=="DD" && gpa<=2.5 ) {
			System.out.println("NOT ORTALAMANIZ 2.5'in altında "+gpa+" ve Harf Notunuz "+ letterGrade + " olduğu için sınava tekrar girmenizde fayda var");
		}else {
		System.out.println("HARF NOTUNUZ == "+letterGrade);
		}
	}

}
