package round805div3;

import java.util.Scanner;

public class ZadA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int m = scanner.nextInt();
            System.out.println(find(m));
        }
    }

    private static int find(int b) {
        int a = b;
        int length = 1;
        while (a / 10 != 0) {
            length *= 10;
            a = a / 10;
        }
        int first = a;
        if (first == 1) {
            return b - a * length;
        } else {
            return b - length;
        }
    }
}
