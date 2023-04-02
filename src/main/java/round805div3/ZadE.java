package round805div3;

import java.util.ArrayList;
import java.util.Scanner;

public class ZadE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int ribs = scanner.nextInt();
            ArrayList<Integer>[] friends = new ArrayList[ribs];
            int index = 0;
            for (int j = 0; j < ribs; j++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                if (friends[a] == null) {
                    friends[a] = new ArrayList<>();
                    friends[a].add(b);
                }
            }
        }
    }
}
