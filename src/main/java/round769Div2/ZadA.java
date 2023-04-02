package round769Div2;

import java.util.Scanner;

public class ZadA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int length = scanner.nextInt();
            String str = scanner.next();
            if (length > 2) {
                System.out.println("NO");
            } else if (length < 2) {
                System.out.println("YES");
            } else {
                System.out.println(str.charAt(0) == str.charAt(1) ? "NO" : "YES");
            }
        }
    }
}
