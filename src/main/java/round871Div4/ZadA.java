package round871Div4;

import java.util.Scanner;

public class ZadA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            String s = scanner.next();
            find(s);
        }


    }
    private static void find(String str) {
        String needStr = "codeforces";
        char[] chars = str.toCharArray();
        char[] needChars = needStr.toCharArray();
        int count = 0;
        for (int i = 0; i < needChars.length; i++) {
            if (needChars[i] != chars[i]) {
                count++;
            }
        }
        System.out.println(count);
    }

}
