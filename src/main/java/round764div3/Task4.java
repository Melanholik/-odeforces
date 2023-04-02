package round764div3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int length = scanner.nextInt();
            int k = scanner.nextInt();
            String s = scanner.next();
            System.out.println(maxLength(s.toCharArray(), k, length));
        }
    }


    private static int maxLength(char[] chars, int k, int length) {
        boolean[] isFind = new boolean[length];
        int sum = 0;
        for (int i = 0; i < length - 1; i++) {
            int count = 1;
            if (!isFind[i]) {
                for (int j = i + 1; j < length; j++) {
                    if (chars[i] == chars[j]) {
                        count++;
                        isFind[j] = true;
                    }
                }
            }
            sum += count / 2;
        }
        int count = sum / k;
        if ((length - 2 * count * k) >= k) {
            return count * 2 + 1;
        } else {
            return count * 2;
        }
    }
}
