package round871Div4;

import java.util.*;

public class ZadF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] a = new int[m * 2];
            for (int j = 0; j < m * 2; j++) {
                a[j] = scanner.nextInt();
            }
            find(a);
        }
    }

    private static void find(int[] a) {
        Arrays.sort(a);
        Map<Integer, Integer> integerIntegerMap = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int count = 1;
            int number = a[i];
            while (i + 1 < a.length && a[i + 1] == number) {
                count++;
                i++;
            }
            if (integerIntegerMap.containsKey(count)) {
                integerIntegerMap.put(count, integerIntegerMap.get(count) + 1);
            } else {
                integerIntegerMap.put(count, 1);
            }
        }
        print(integerIntegerMap);

    }

    private static void print(Map<Integer, Integer> integerIntegerMap) {
        int x = 0;
        int y = 0;
        if (integerIntegerMap.size() == 3) {
            for (Map.Entry<Integer, Integer> entry : integerIntegerMap.entrySet()) {
                if (entry.getValue() == 1) {
                    x = entry.getKey();
                } else {
                    if (entry.getKey() != 1) {
                        y = entry.getValue();
                    }
                }
            }
        }
        if (integerIntegerMap.size() == 2) {
            for (Map.Entry<Integer, Integer> entry : integerIntegerMap.entrySet()) {
                if (entry.getKey() != 1) {
                    x = entry.getKey();
                    y = entry.getKey();
                }
            }
        }

        System.out.println(x + " " + y);
    }
}
