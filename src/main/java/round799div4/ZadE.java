package round799div4;

import java.util.Scanner;

public class ZadE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int length = scanner.nextInt();
            int sum = scanner.nextInt();
            int actualSum = 0;
            int[] a = new int[length];
            for (int j = 0; j < length; j++) {
                a[j] = scanner.nextInt();
                actualSum += a[j];
            }
            if (actualSum < sum) {
                System.out.println(-1);
            } else if (actualSum == sum) {
                System.out.println(0);
            } else {
                int maxLength = findMaxLength(a, sum);
                System.out.println(length - maxLength);
            }
        }
    }

    private static int findMaxLength(int[] a, int sum) {
        int maxLength = 0;
        int currentSum = 0;
        int startIndex = 0;
        int endIndex = 0;
        while (currentSum != sum + 1) {
            currentSum += a[endIndex++];
            maxLength++;
        }
        int actualLength = maxLength;
        maxLength--;
        while (endIndex < a.length) {
            while (currentSum > sum) {
                currentSum -= a[startIndex++];
                actualLength--;
            }
            while (endIndex < a.length && currentSum != sum + 1) {
                currentSum += a[endIndex++];
                actualLength++;
            }
            if (currentSum == sum + 1) {
                if (maxLength < actualLength - 1) {
                    maxLength = actualLength - 1;
                }
            } else if (currentSum == sum) {
                if (maxLength < actualLength) {
                    maxLength = actualLength;
                }
            }

        }
        return maxLength;
    }
}
