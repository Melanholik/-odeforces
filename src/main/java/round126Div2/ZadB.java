package round126Div2;

import java.util.Scanner;

public class ZadB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] a = new int[count];
        for (int i = 0; i < count; i++) {
            a[i] = countDo(scanner.nextInt(), 32768);
        }
        for (int i = 0; i < count; i++) {
            System.out.println(a[i] + " ");
        }
    }

    public static int countDo(int a, int max) {
        int count = 0;
        while ((max / 2) > a) {
            max /= 2;
            count++;
        }
        count = count + (max - a);
        if (count > 15) {
            count = 15;
        }

        int count2 = 0;

        while ((a % 10 != 0)) {
            count2++;
            a++;
        }

        if (count2 > count) {
            return count;
        }

        while (a % 10 == 0) {
            a /= 10;
        }

        int count3 = 0;
        int two = 1;
        while (two < a) {
            count3++;
            two *= 2;
        }
        if (two != a) {
            return count;
        }

        count2 += (14 - count3);

        return Math.min(count, count2);

    }
}
