package round786div3;

import java.util.Scanner;

public class ZadB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            String str = scanner.next();
            printPosition(str);
        }
    }

    public static void printPosition(String str) {
        char first = str.charAt(0);
        char second = str.charAt(1);
        int a = first - 97;
        int b = second - 97;

        if (b > a) {
            System.out.println((first - 97) * 25 + (second - 97));
        } else {
            System.out.println((first - 97) * 25 + (second - 97) + 1);
        }
    }
}
