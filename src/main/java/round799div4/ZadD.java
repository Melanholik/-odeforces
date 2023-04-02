package round799div4;

import java.util.Scanner;

public class ZadD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[24];
        a[0] = 0;
        a[1] = 10;
        a[2] = 20;
        a[3] = 30;
        a[4] = 40;
        a[5] = 50;
        a[6] = -1;
        a[7] = -1;
        a[8] = -1;
        a[9] = -1;
        a[10] = 1;
        a[11] = 11;
        a[12] = 21;
        a[13] = 31;
        a[14] = 41;
        a[15] = 51;
        a[16] = -1;
        a[17] = -1;
        a[18] = -1;
        a[19] = -1;
        a[20] = 2;
        a[21] = 12;
        a[22] = 22;
        a[23] = 32;

        int count = scanner.nextInt();
        for (int i = 0; i <= count; i++) {
            String str = scanner.nextLine();
            if (str.length() > 3) {
                char[] chars = str.toCharArray();
                int hh = chars[1] - '0' + 10 * (chars[0] - '0');
                int mm = chars[4] - '0' + 10 * (chars[3] - '0');
                int minute = 0;
                int k = 1;
                for (int j = str.length() - 1; j > 5; j--) {
                    minute += k * (chars[j] - '0');
                    k *= 10;
                }
                System.out.println(findPoli(a, hh, mm, minute));
            }
        }
    }

    private static int findPoli(int[] a, int hh, int mm, int minute) {
        int count = 0;
        int plusHour = 0;
        int plusMinute = minute;
        if (minute > 59) {
            plusHour = minute / 60;
            plusMinute = minute % 60;
        }

        int newHH = hh;
        int newMM = mm;
        do {
            if (a[newHH] == newMM) {
                count++;
            }
            newMM = newMM + plusMinute;
            int k = 0;
            if (newMM > 59) {
                k = newMM / 60;
                newMM = newMM % 60;

            }

            newHH = newHH + plusHour + k;

            if (newHH > 23) {
                newHH = newHH % 24;
            }
        } while (newHH != hh || newMM != mm);
        return count;
    }
}
