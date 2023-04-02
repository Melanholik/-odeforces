package round799div4;

import java.util.Scanner;

public class ZadC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            char[][] a = new char[8][8];
            for (int j = 0; j < 8; j++) {
                String str = scanner.nextLine();
                while (str.length() < 3) {
                    str = scanner.nextLine();
                }
                a[j] = str.toCharArray();
            }
            SizeASizeB sizeASizeB = find(a);
            if (sizeASizeB != null) {
                System.out.println(sizeASizeB.sizeA + " " + sizeASizeB.sizeB);
            }
        }

    }

    private static class SizeASizeB {
        int sizeA = 0;
        int sizeB = 0;
    }

    private static SizeASizeB find(char[][] a) {
        for (int i = 0; i < 8; i++) {
            int start = 0;
            int end = 0;
            boolean isFind = false;
            for (int j = 0; j < 8; j++) {
                if (a[i][j] == '#') {
                    if (!isFind) {
                        start = j;
                        isFind = true;
                    } else {
                        end = j;
                        SizeASizeB sizeASizeB = new SizeASizeB();
                        sizeASizeB.sizeA = i + (end - start) / 2 + 1;
                        sizeASizeB.sizeB = (start + end) / 2 + 1;
                        return sizeASizeB;
                    }
                }
            }
        }
        return null;
    }
}




