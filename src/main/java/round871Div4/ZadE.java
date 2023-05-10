package round871Div4;

import java.util.Scanner;

public class ZadE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        for (int c = 0; c < count; c++) {
            int lengthA = scanner.nextInt();
            int lengthB = scanner.nextInt();
            int[][] ints = new int[lengthA][lengthB];
            boolean[][] isUse = new boolean[lengthA][lengthB];
            for (int i = 0; i < lengthA; i++) {
                for (int j = 0; j < lengthB; j++) {
                    ints[i][j] = scanner.nextInt();
                }
            }
            find(ints, isUse, lengthA, lengthB);
        }
    }

    private static void find(int[][] ints, boolean[][] isUse, int lengthA, int lengthB) {
        int maxWay = 0;
        for (int i = 0; i < lengthA; i++) {
            for (int j = 0; j < lengthB; j++) {
                if (ints[i][j] != 0 && !isUse[i][j]) {
                    int max = finDeap(ints, isUse, i, j);
                    if (maxWay < max) {
                        maxWay = max;
                    }
                }

            }
        }
        System.out.println(maxWay);
    }

    private static int finDeap(int[][] ints, boolean[][] isUse, int startA, int startB) {
        if (startA < 0 || startB < 0) {
            return 0;
        }
        if (startA == ints.length || startB == ints[0].length) {
            return 0;
        }
        if (ints[startA][startB] == 0 || isUse[startA][startB]) {
            return 0;
        }
        int sum = ints[startA][startB];
        isUse[startA][startB] = true;
        sum += finDeap(ints, isUse, startA + 1, startB);
        sum += finDeap(ints, isUse, startA, startB + 1);
        sum += finDeap(ints, isUse, startA - 1, startB);
        sum += finDeap(ints, isUse, startA, startB - 1);
        return sum;
    }
}
