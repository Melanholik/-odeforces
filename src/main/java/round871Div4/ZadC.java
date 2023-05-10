package round871Div4;

import java.util.Scanner;

public class ZadC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int countBook = scanner.nextInt();
            int[] minutes = new int[countBook];
            int[] skills = new int[countBook];

            for (int j = 0; j < countBook; j++) {
                minutes[j] = scanner.nextInt();
                skills[j] = scanner.nextInt();
            }
            find(minutes, skills);
        }
    }

    private static void find(int[] minutes, int[] skills) {
        int minSkill1 = 0;
        int minSkill2 = 0;
        int nimSkill12 = 0;

        for (int i = 0; i < minutes.length; i++) {
            if (skills[i] > 0) {
                if (skills[i] == 1) {
                    if (minSkill1 == 0 || minSkill1 > minutes[i]) {
                        minSkill1 = minutes[i];
                    }
                } else {
                    if (skills[i] == 10) {
                        if (minSkill2 == 0 || minSkill2 > minutes[i]) {
                            minSkill2 = minutes[i];
                        }
                    } else {
                        if (skills[i] == 11) {
                            if (nimSkill12 == 0 || nimSkill12 > minutes[i]) {
                                nimSkill12 = minutes[i];
                            }
                        }
                    }
                }
            }
        }
        if (nimSkill12 == 0) {
            if (minSkill1 > 0 && minSkill2 > 0) {
                System.out.println(minSkill1 + minSkill2);
            } else {
                System.out.println(-1);
            }
        } else {
            if (minSkill1 < 1 || minSkill2 < 1) {
                System.out.println(nimSkill12);
            } else {
                System.out.println(Math.min(nimSkill12, minSkill1 + minSkill2));
            }
        }
    }
}
