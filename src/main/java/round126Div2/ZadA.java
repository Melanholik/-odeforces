package round126Div2;

import java.util.Scanner;

public class ZadA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int length = scanner.nextInt();
            int[] a = new int[length];
            for (int j = 0; j < length; j++) {
                a[j] = scanner.nextInt();
            }
            int[] b = new int[length];
            for (int j = 0; j < length; j++) {
                b[j] = scanner.nextInt();
            }
            changeArray(a, b, length);
            print(a, b, length);

        }
    }

    public static void changeArray(int[] a, int[] b, int length) {
        for (int i = 1; i < length; i++) {
            if ((Math.abs(a[i - 1] - a[i]) + Math.abs(b[i - 1] - b[i])) >
                    (Math.abs(b[i - 1] - a[i]) + Math.abs(a[i - 1] - b[i]))) {
                int c = a[i];
                a[i] = b[i];
                b[i] = c;
            }
        }

    }

    private static void print(int[] a, int[] b, int length) {
        long sum = 0;
        for (int i = 1; i < length; i++) {
            sum = sum + Math.abs(a[i - 1] - a[i]) + Math.abs(b[i - 1] - b[i]);
        }
        System.out.println(sum);
    }

}
