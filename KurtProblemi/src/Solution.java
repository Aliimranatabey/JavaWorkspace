import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
	public static int uniqueWolfs(List<Integer> arr) {
		// Dizi uzunluğu kontrolü
		if (arr.size() < 5 || arr.size() > 2 * Math.pow(10, 5)) {
			throw new IllegalArgumentException("Dizi uzunluğu 5 ile 2x10^5 arasında olmalıdır.");
		}

		// Eleman değerleri kontrolü
		for (int tur : arr) {
			if (tur < 1 || tur > 5) {
				throw new IllegalArgumentException("Geçersiz eleman değeri. Elemanlar 1, 2, 3, 4 veya 5 olmalıdır.");
			}
		}

		// Her kurt türünün sayısını tutmak için bir harita oluşturulur
		Map<Integer, Integer> counter = new HashMap<>();

		// Dizideki her bir elemanı kontrol eder
		for (int tur : arr) {
			// Geçerli tür, haritada bulunan değerine 1 eklenerek güncellenir
			counter.put(tur, counter.getOrDefault(tur, 0) + 1);
		}

		// En sık tespit edilen kurt türünün ID'sini bulma
		int enSıkTur = 0;
		int maksimumSayi = 0;
		for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
			int tur = entry.getKey();
			int sayi = entry.getValue();
			if (sayi > maksimumSayi) {
				enSıkTur = tur;
				maksimumSayi = sayi;
			}
		}

		// En sık tespit edilen kurt türünün en düşük ID'sini bulma
		int enDusukID = Integer.MAX_VALUE;
		for (int tur : arr) {
			if (tur == enSıkTur && tur < enDusukID) {
				enDusukID = tur;
			}
		}

		return enDusukID;
	}
}

public class Solution {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\KurtProblemi.txt"));
		int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());
		int result = Result.uniqueWolfs(arr);
		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();
		bufferedReader.close();
		bufferedWriter.close();

	}
}