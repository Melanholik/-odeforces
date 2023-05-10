package round871Div4;

import java.util.Objects;
import java.util.Scanner;

public class ZadD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            System.out.println(find(n, m));
        }
    }

    private static String find(int n, int m) {
        if (m > n) {
            return "NO";
        }
        if (m == n) {
            return "Yes";
        }
        while (n % 3 == 0) {
            n = n / 3;
            if (Objects.equals(find(n, m), "NO")) {
                return find(2 * n, m);
            } else {
                return "YES";
            }
        }
        return "NO";
    }
}
