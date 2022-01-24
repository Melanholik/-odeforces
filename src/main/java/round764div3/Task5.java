package round764div3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int lengthArr = scanner.nextInt();
            int lengthNumber = scanner.nextInt();
            char[][] chars = new char[lengthArr][lengthNumber];
            for (int j = 0; j < lengthArr; j++) {
                chars[j] = scanner.next().toCharArray();
            }
            char[] now = scanner.next().toCharArray();
        }
    }

    private static char[][] find(char[][] numbs, char[] numb, int lengthArr, int lengthNumber) {
        char[][] chars = new char[lengthArr / 2][lengthNumber];


        return chars;
    }


    private static int length(char[] need, char[] whereFind, int start) {
        int length = 0;
        int currentLength = 0;
        int actual = start;

        for (char c : whereFind) {
            if (c == need[actual]) {
                length++;
                actual++;
            } else {
                if (length > 1 && length > currentLength) {
                    currentLength = length;
                } else {
                    length = 0;
                    actual = start;
                }
            }
        }
        return currentLength;
    }

}
