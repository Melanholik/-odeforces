package round862Div2;

import java.util.*;

public class ZadB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int length = scanner.nextInt();
            String str = scanner.next();
            System.out.println(findNewLine(str, length));
        }
    }

    public static String findNewLine(String str, int length) {
        int index = 0;
        char minChar = str.charAt(0);
        for (int i = 1; i < length; i++) {
            if (minChar >= str.charAt(i)) {
                minChar = str.charAt(i);
                index = i;
            }
        }
        StringBuilder builder = new StringBuilder();
        builder.append(str.charAt(index));
        for (int i = 0; i < length; i++) {
            if (i != index) {
                builder.append(str.charAt(i));
            }
        }
        return builder.toString();
    }
}
