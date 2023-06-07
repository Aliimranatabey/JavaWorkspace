import java.util.*;

class Result {
    public static int uniqueWolfs(List<Integer> arr) {
        Map<Integer, Integer> wolfCounts = new HashMap<>();
        int maxCount = 0;
        int minID = Integer.MAX_VALUE;

        for (int wolfID : arr) {
            if (!wolfCounts.containsKey(wolfID)) {
                wolfCounts.put(wolfID, 1);
            } else {
                int count = wolfCounts.get(wolfID);
                wolfCounts.put(wolfID, count + 1);
            }

            int count = wolfCounts.get(wolfID);
            if (count > maxCount) {
                maxCount = count;
                minID = wolfID;
            } else if (count == maxCount && wolfID < minID) {
                minID = wolfID;
            }
        }

        return minID;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrCount = Integer.parseInt(scanner.nextLine().trim());
        List<Integer> arr = new ArrayList<>();
        String[] arrItems = scanner.nextLine().split(" ");
        for (String item : arrItems) {
            arr.add(Integer.parseInt(item));
        }
        int result = Result.uniqueWolfs(arr);
        System.out.println(result);
        scanner.close();
    }
}