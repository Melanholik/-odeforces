package round764div3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int length = scanner.nextInt();
            int[] ints = new int[length];
            for (int j = 0; j < length; j++) {
                ints[j] = scanner.nextInt();
            }
            if (isCan(ints)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }


    private static boolean isCan(int[] a) {
        int length = a.length;
        boolean isCan = true;
        boolean[] booleans = new boolean[length];
        for (int i = 0; i < length && isCan; i++) {
            int number = a[i];
            while ((number > length) || (number > 0 && booleans[number - 1])) {
                number = number / 2;
            }
            if (number == 0) {
                isCan = false;
            } else {
                booleans[number - 1] = true;
            }
        }
        return isCan;
    }
}
