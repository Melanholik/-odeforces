package round805div3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ZadC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int length = scanner.nextInt();
            int count2 = scanner.nextInt();
            Map<Integer, Integer> start = new HashMap<>();
            Map<Integer, Integer> end = new HashMap<>();
            for (int j = 0; j < length; j++) {
                int number = scanner.nextInt();
                if (!start.containsKey(number)) {
                    start.put(number, j);
                }
                end.put(number, j);
            }

            int startName;
            int endName;
            for (int j = 0; j < count2; j++) {
                startName = scanner.nextInt();
                endName = scanner.nextInt();
                System.out.println(findIfPossible(start, end, startName, endName));
            }

        }
    }

    private static String findIfPossible(Map<Integer, Integer> start, Map<Integer, Integer> end, int startName, int endName) {
        if (!start.containsKey(startName)) {
            return "NO";
        }
        if (!end.containsKey(endName)) {
            return "NO";
        }
        int startPosition = start.get(startName);
        int endPosition = end.get(endName);
        if (startPosition < endPosition) {
            return "YES";
        }
        return "NO";

    }
}
