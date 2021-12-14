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
            int end = length;
            boolean isCorrect = true;
            int lastIndex = -1;
            int sum = 0;
            int k = 10;
            while (start != end && isCorrect) {
                int needIndex = findMaxElement(mas, start, end);
                if (needIndex == start) {
                    if (lastIndex == -1) {
                        sum += mas[start];
                        lastIndex = start;
                    } else {
                        if (needIndex > lastIndex) {
                            sum = k * mas[needIndex] + sum;
                            k *= 10;
                        } else {
                            sum = sum * 10 + mas[needIndex];
                        }
                    }
                    start++;
                } else if (needIndex == end - 1) {
                    if (lastIndex == -1) {
                        sum += mas[end - 1];
                        lastIndex = end - 1;
                    } else {
                        if (needIndex > lastIndex) {
                            sum = k * mas[needIndex] + sum;
                            k *= 10;
                        } else {
                            sum = sum * 10 + mas[needIndex];
                        }
                    }
                    end--;
                } else {
                    isCorrect = false;
                }
            }
            if (isCorrect) {
                while (sum != 0) {
                    System.out.print(sum % 10);
                    sum /= 10;
                    if (sum > 0) {
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

}
