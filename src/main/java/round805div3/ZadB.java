package round805div3;

import java.util.Scanner;

public class ZadB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            String str = scanner.next();
            System.out.println(findDay(str.toCharArray()));
        }
    }


    private static int findDay(char[] chars) {
        int day = 1;
        int length = chars.length;
        if (length < 4) {
            return day;
        }
        char a = chars[0];
        Character b = null;
        Character c = null;
        for (int i = 1; i < length; i++) {
            if (chars[i] != a) {
                if (b == null) {
                    b = chars[i];
                } else if (chars[i] != b) {
                    if (c == null) {
                        c = chars[i];
                    } else if (chars[i] != c) {
                        day++;
                        a = chars[i];
                        b = null;
                        c = null;
                    }
                }
            }
        }
        return day;
    }
}
