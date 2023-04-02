package round862Div2;

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
            System.out.println(findIfCan(a, length));
        }
    }

    public static int findIfCan(int[] a, int length) {
        int sum = a[0];
        for (int i = 1; i < length; i++) {
            sum = sum ^ a[i];
        }
        if (sum < 256 && sum >= 0) {
            if (length % 2 == 0 && sum > 0) {
                return -1;
            }
            return sum;
        }
        return -1;
    }
}
