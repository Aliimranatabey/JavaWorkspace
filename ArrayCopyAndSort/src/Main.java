import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static int[] arrayiDoldur(int sayi) {
		Scanner scanner = new Scanner(System.in);
		int[] cikti = new int[sayi];

		for (int i = 0; i < sayi; i++) {
			cikti[i] = scanner.nextInt();
		}
		return cikti;
	}

	public static void arrayiBastir(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Element " + (i + 1) + " : " + array[i]);
		}
	}
	
	public static void arraySort(int[] array) {
		//Bir arrayi kendimiz sıralamak için belirli algoritmalar yazmak lazım (Bublesort, Selectionsort) gibi algoritmalar var. Ancak biz Arrays sınıfını kullanarak biz belirli bir methodu kullanacağız 
		// biz belirli bir methodu kulanacağız ve bu arrayimizi direkt sıralamış olacağız . Bu Arrays sınıfı içerisinde bizim Arraylerin içerisinde işlem yapabildiğimiz bir çok method bulunuyor .
		
		Arrays.sort(array);//Kendi içerisinde arrayimizi sıralayacak
		arrayiBastir(array);
	}

	public static void main(String[] args) {
		int[] a = arrayiDoldur(5);/*Arrayin kopyalanması işlemi gibi bir örnektir . Ancak tam olarak kopyalamak iki tane referansımız var iki tane objemizin olması gerekiyor .
								Burdaki kopyalama değil bu sadece referansları eşitlemek ve o referansın orayı göstermesi şeklinde bir işlem olmuş oluyor */
		arrayiBastir(a);
		arraySort(a);
		
		int[] a1= {1,2,3,4,5,6};
		int[] a2= {1,2,3,4,5,6};
		
		if(a1==a2) {
			System.out.println("Eşitler");
		}else {
			System.out.println("Eşit Değiller");
		}
		//Burada Eşit Değilleri yazdıracaktır . a1 sadece bir referanstır belleğin bir bölümünde a1'in gösterdiği dizi tanımlanır . ve farklı bir yerinde a2'nin gösterdiği dizi tanımlanır . Ancak bu dizilerin
		//içlerindeki değerler eşit olsa bile belleğin farklı yerlerinde farklı diziler oldukları için bunları gösteren referanslar birbirine eşit değildir . Referanslar aynı yeri gösteriyor mu diye bir sorgudur aslında bu .
	
		
		//Dizilerin İçeriklerinin eşitliğini karşılaştırmak için Arrays sınıfı içerisindeki equals methodundan yaralanılabilir .
		if(Arrays.equals(a1, a2)) {
			System.out.println("Eşitler");
		}else {
			System.out.println("Eşit Değiller");
		}
	}

}
