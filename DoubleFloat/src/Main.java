
public class Main {

	public static void main(String[] args) {
		
		//Double : 64 bit - 8 Byte
		//Float : 32 bit - 4 Byte
		//Otomatik Dönüştürme : int --> float --> double
		
		double sayi1=70.25;
		double sayi2=60d;
		double sayi3=80.2;
		
		float a=70.25f;
		float b=60f;
		float c=80.2f;
		
		System.out.println("Ortalama : "+ (sayi1+sayi2+sayi3)/3);
		System.out.println("Ortalama : "+ (a+b+c)/3);
		
		double i=3.52;
		float j=(float)i;
		
		int k=22/7;
		float t=22f/7f;
		double z=22d/7d;
		
		System.out.println("k : "+k);
		System.out.println("t : "+t);
		System.out.println("z : "+z);
		
		
		
		
		
		
		
		
		/*for(String Ipassword : slist) {
			if(Ipassword==strUserNewPassword) {
				System.out.println("GİRİLEN ŞİFRE ÖNCEKİ 5 ŞİFREDEN BİRİ OLAMAZ");
			}
		}*/

	}

}
