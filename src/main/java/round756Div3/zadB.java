package round756Div3;

import java.util.Scanner;

public class zadB {
    public static void zadB(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        int[] mas = new int[index];
        int currentIndex = 0;
        for (int i = 0; i < index; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a > b) {
                mas[currentIndex++] = find(a, b);
            } else {
                mas[currentIndex++] = find(b, a);
            }
        }

        for (int i = 0; i < index; i++) {
            System.out.println(mas[i]);
        }
    }


    public static int find(int a, int b) {
        int remainder = a - 2 * b;
        if (remainder >= b * 2) {
            return b;
        }
        return (a + b) / 4;
    }
}
