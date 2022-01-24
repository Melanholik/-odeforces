package round756Div3;

import java.util.Scanner;

public class ZadD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int length = scanner.nextInt();
            int[] ribs = createArr(length, scanner);
            int[] path = createArr(length, scanner);
            Vertex[] vertex = createVertexArr(length);
            int maxPath = 0;
            boolean isAllGood = true;
            for (int j = 1; j < length; j++) {
                int ancestor = ribs[path[j] - 1];
                int sumCurrent = vertex[ancestor - 1].sum;
                if (sumCurrent == 0 && ancestor != path[0]) {
                    isAllGood = false;
                    j = length;
                } else {
                    maxPath++;
                    vertex[path[j] - 1].sum = maxPath;
                    vertex[path[j] - 1].weight = maxPath - vertex[ancestor - 1].sum;
                }
            }
            if (isAllGood) {
                for (int j = 0; j < length; j++) {
                    System.out.print(vertex[j].weight + " ");
                }
                System.out.println();
            } else {
                System.out.println(-1);
            }

        }
    }

    public static int[] createArr(int length, Scanner scanner) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static Vertex[] createVertexArr(int length) {
        Vertex[] array = new Vertex[length];
        for (int i = 0; i < length; i++) {
            array[i] = new Vertex();
        }
        return array;
    }

    public static class Vertex {
        int weight;
        int sum;
    }
}
