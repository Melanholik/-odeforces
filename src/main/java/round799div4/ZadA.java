package round799div4;

import java.util.Scanner;

public class ZadA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int moreThanA = 0;
            int a = scanner.nextInt();
            moreThanA += moreThanA(a, scanner.nextInt());
            moreThanA += moreThanA(a, scanner.nextInt());
            moreThanA += moreThanA(a, scanner.nextInt());
            System.out.println(moreThanA);
        }

    }

    private static int moreThanA(int a, int b) {

        return b > a ? 1 : 0;
    }
}
