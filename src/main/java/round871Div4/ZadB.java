package round871Div4;

import java.util.Scanner;

public class ZadB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int length = scanner.nextInt();
            int[] ints = new int[length];
            for (int j = 0; j < length; j++) {
                ints[j] = scanner.nextInt();
            }
            find(ints);
        }
    }

    private static void find(int[] ints) {
        int maxLength = 0;
        int currentLength = 0;
        for (int anInt : ints) {
            if (anInt == 0) {
                currentLength++;
            } else {
                if (maxLength < currentLength) {
                    maxLength = currentLength;
                }
                currentLength = 0;
            }
        }
        if (maxLength < currentLength) {
            maxLength = currentLength;
        }
        System.out.println(maxLength);
    }
}
