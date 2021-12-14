package round756Div3;

import java.util.Scanner;

public class Zad1 {
    public static void zadA() {
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        int[] mas = new int[index];
        for (int i = 0; i < mas.length; i++) {
            int number = scanner.nextInt();
            int current = 1;
            int indexNumber = 0;
            boolean isFirstHonest = false;
            while (number != 0) {
                int lastNumber = number % 10;
                if ((lastNumber % 2) == 0) {
                    indexNumber = current;
                    if (current == 1) {
                        number = 0;
                    }
                    isFirstHonest = true;
                } else {
                    isFirstHonest = false;
                    current++;
                }
                number = number / 10;
            }

            if (indexNumber == 0) {
                mas[i] = -1;
            }
            if (indexNumber == 1) {
                mas[i] = 0;
            }
            if (indexNumber > 1) {
                if (isFirstHonest) {
                    mas[i] = 1;
                } else {
                    mas[i] = 2;
                }
            }
        }
        for (int ma : mas) {
            System.out.println(ma);
        }

    }
}
