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
		Map<Integer, Integer> counter = new HashMap<>();

        for (int tur : arr) {
            counter.put(tur, counter.getOrDefault(tur, 0) + 1);
        }

        int enSikTur = Collections.max(counter.entrySet(), Map.Entry.comparingByValue()).getKey();
        int enDusukID = Integer.MAX_VALUE;

        for (int tur : arr) {
            if (tur == enSikTur && tur < enDusukID) {
                enDusukID = tur;
            }
        }

        return enDusukID;
	}
}

public class Solution {

	public static void main(String[] args) throws IOException {
		
		try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\KurtProblemi.txt"));

            int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
            List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList());

            int result = Result.uniqueWolfs(arr);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

	}
}