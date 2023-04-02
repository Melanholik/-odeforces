package round769Div2;

import java.util.Scanner;

public class ZadB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int n = scanner.nextInt();
            find(n);
        }
    }


    private static void find(int n) {
        StringBuilder builder = new StringBuilder();
        boolean[] b = new boolean[n];
        int index = 1;
        int number = n - 1;
        builder.append(n - 1).append(" ");
        int k = n - 1;
        b[n - 1] = true;
        int start = 0;
        int maxSum = Integer.MAX_VALUE;
        while (index < n) {
            int minSum = Integer.MAX_VALUE;
            int indexMin = -1;
            for (int j = start; j < k; j++) {
                if (!b[j]) {
                    if (number != j && minSum > (number ^ j)) {
                        indexMin = j;
                        minSum = number ^ j;
                        if (minSum < maxSum){

                        }
                    }
                }
            }
            builder.append(indexMin).append(" ");
            index++;
            number = indexMin;
            b[number] = true;
            while (k != 0 && b[k - 1]) {
                k--;
            }
            while (start < k && b[start]) {
                start++;
            }
        }
        System.out.println(builder);
    }
}
