package round764div3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if (isHas(a, 2 * b - c) || isHas(c, 2 * b - a)) {
                System.out.println("YES");
            } else {
                if ((c - a) % 2 == 0) {
                    if (isHas(b, a + (c - a) / 2)) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

    public static boolean isHas(int a, int b) {
        return (b > 0) && ((b % a) == 0);
    }
}
