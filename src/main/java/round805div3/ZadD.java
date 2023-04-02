package round805div3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ZadD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            String str = scanner.next();
            int sum = scanner.nextInt();
            System.out.println(find(str.toCharArray(), sum));
        }
    }

    private static String find(char[] chars, int sum) {
        int[] a = new int[27];
        int currentSum = 0;
        for (char aChar : chars) {
            int symbol = aChar - 96;
            currentSum += symbol;
            a[symbol]++;
        }
        if (currentSum <= sum) {
            return new String(chars);
        }
        Map<Integer, Integer> intChar = new HashMap<>();
        int length = 0;


        for (int i = 26; i > -1 && currentSum > sum; ) {
            if (a[i] != 0) {
                a[i]--;
                length++;
                if (intChar.containsKey(i)) {
                    intChar.put(i, intChar.get(i) + 1);
                } else {
                    intChar.put(i, 1);
                }
                currentSum -= i;
            } else {
                i--;
            }
        }
        char[] newChars = new char[chars.length - length];
        int index = 0;

        for (char aChar : chars) {
            int symbol = aChar - 96;
            if (intChar.containsKey(symbol)) {
                int value = intChar.get(symbol);
                if (value == 0) {
                    newChars[index++] = aChar;
                } else {
                    intChar.put(symbol, value - 1);
                }
            } else {
                newChars[index++] = aChar;
            }
        }


        return new String(newChars);
    }
}
