package round786div3;

import java.util.Scanner;

public class ZadA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            print(a, b);
        }
    }

    private static void print(int x, int y) {
        if ((y % x) > 0) {
            System.out.println("0 0");
        } else {
            System.out.println("1 " + y / x);
        }
    }
}
