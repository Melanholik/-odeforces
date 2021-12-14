package round756Div3;

import java.util.Scanner;

public class ZadC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        for (int i = 0; i < index; i++) {
            int length = scanner.nextInt();
            int[] mas = new int[length];
            for (int j = 0; j < length; j++) {
                mas[j] = scanner.nextInt();
            }
            int start = 0;
            int[] sum = new int[]{};
            boolean isCorrect = true;
            int needIndex = findMaxElement(mas, start, length);
            if (needIndex == start) {
                sum = firstNumber(needIndex, mas, start + 1, length);
            } else if (needIndex == length - 1) {
                sum = firstNumber(needIndex, mas, start, length - 1);
            } else {
                isCorrect = false;
            }
            if (isCorrect) {
                for (int j = 0; j < sum.length; j++) {
                    System.out.print(sum[j]);
                    if (j != sum.length - 1) {
                        System.out.print(" ");
                    }
                }


            } else {
                System.out.print(-1);
            }
            System.out.println();
        }
    }

    public static int findMaxElement(int[] a, int start, int end) {
        int indexMax = start;
        for (int i = start + 1; i < end; i++) {
            if (a[indexMax] < a[i]) {
                indexMax = i;
            }
            if (a[indexMax] == a[i]) {
                if (i == end - 1) {
                    indexMax = i;
                }
            }
        }
        return indexMax;
    }

    public static int[] firstNumber(int indexMax, int[] a, int start, int end) {
        int[] sum = new int[a.length];
        sum[0] = a[indexMax];
        int index = 1;
        for (int i = end - 1; i >= start; i--) {
            sum[index++] = a[i];
        }
        return sum;
    }
}
