package round799div4;

import java.util.Scanner;

public class ZadB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int length = scanner.nextInt();
            int[] a = new int[length];
            for (int j = 0; j < length; j++) {
                a[j] = scanner.nextInt();
            }
            MinMax minMax = findMinMax(a, length);
            int unique = countUniqueElement(a, length, minMax);
            if ((length - unique) % 2 == 0) {
                System.out.println(unique);
            } else {
                System.out.println(unique - 1);
            }

        }
    }

    private static class MinMax {
        int min = 0;
        int max = 0;
    }


    public static MinMax findMinMax(int[] a, int length) {
        MinMax minMax = new MinMax();
        minMax.max = a[0];
        minMax.min = a[0];
        for (int i = 1; i < length; i++) {
            if (minMax.min > a[i]) {
                minMax.min = a[i];
            }
            if (minMax.max < a[i]) {
                minMax.max = a[i];
            }
        }
        return minMax;
    }

    public static int countUniqueElement(int[] a, int length, MinMax minMax) {
        int count = 0;
        int lengthB = minMax.max - minMax.min + 1;
        int[] b = new int[lengthB];
        for (int i = 0; i < length; i++) {
            if (b[a[i] - minMax.min] == 0) {
                count++;
                b[a[i] - minMax.min] = 1;
            }
        }
        return count;
    }
}
