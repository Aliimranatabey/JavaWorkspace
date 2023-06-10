import java.util.Scanner;

public class Main {

	public static void arrayiBastir(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.println("Element " + (i + 1) + ":" + array[i]);
		}
	}

	public static double ortalamaBul(int[] array) {
		int toplam = 0;
		for (int i = 0; i < array.length; i++) {
			toplam += array[i];
		}
		return ((double) toplam / array.length);
	}

	public static void main(String[] args) {

		int[] a = new int[5];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("Dizinin " + i + ". elemanını giriniz => ");
			a[i] = scan.nextInt();
		}

		System.out.println(a[0]);
		System.out.println(a[2]);
		// System.out.println(a[6]); //ArrayIndexOutOfBoundsException:6

		arrayiBastir(a);
		System.out.println("Ortalama: " + ortalamaBul(a));
	}

}
