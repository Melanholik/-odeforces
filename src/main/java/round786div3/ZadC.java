package round786div3;

import java.util.Scanner;

public class ZadC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            String a = scanner.next();
            String b = scanner.next();
            printCount(a, b);
        }
    }

    static private void printCount(String a, String b) {
        if (b.length() == 1) {
            if (b.equals("a")) {
                System.out.println(1);
            } else {
                System.out.println(a.length() + 1);
            }
        } else if (b.contains("a")) {
            System.out.println(-1);
        } else {
            System.out.println(a.length() + 1);
        }
    }
}
