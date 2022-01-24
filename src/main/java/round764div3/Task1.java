package round764div3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int length = scanner.nextInt();
            int maxElement = Integer.MIN_VALUE;
            int minElement = Integer.MAX_VALUE;
            for (int j = 0; j < length; j++) {
                int element = scanner.nextInt();
                if (element > maxElement) {
                    maxElement = element;
                }
                if (element < minElement) {
                    minElement = element;
                }
            }
            System.out.println(maxElement - minElement);
        }
    }
}
