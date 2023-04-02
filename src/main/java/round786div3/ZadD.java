package round786div3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ZadD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int length = scanner.nextInt();
            classPosition[] a = new classPosition[length];
            int index = 0;
            for (int j = 0; j < length; j++) {
                a[index] = new classPosition(scanner.nextInt(), index);
                index++;
            }
            Arrays.sort(a, Comparator.comparingInt(o -> o.value));
            print(a);
        }
    }

    static private void print(classPosition[] a) {
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if ( (a.length - i) % 2  > 0){
                if (a[i].position == index) {
                    index++;
                } else {
                    System.out.println("No");
                    return;
                }
            } else {
                if (a[i].position == index || a[i].position == index +1){
                    index++;
                } else {
                    System.out.println("No");
                    return;
                }
            }
        }

        System.out.println("Yes");
    }

    private static class classPosition {
        int value;
        int position;

        public classPosition(int value, int position) {
            this.value = value;
            this.position = position;
        }
    }
}
