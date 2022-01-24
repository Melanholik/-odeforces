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
            FromTo[] indexes = find(chars, now, lengthArr, lengthNumber);
            int index = 0;
            for (int j = 0; j < indexes.length; j++) {
                if (indexes[j].numberNumber != -1) {
                    index++;
                } else {
                    j = indexes.length;
                }
            }

            if (index == 0) {
                System.out.println(-1);
            } else {
                System.out.println(index);
                for (int j = 0; j < index; j++) {
                    System.out.println(indexes[j].from + 1 + " " + indexes[j].to + " " + (indexes[j].numberNumber + 1));
                }
            }
        }
    }

    private static FromTo[] find(char[][] numbs, char[] numb, int lengthArr, int lengthNumber) {
        FromTo[] fromTos = new FromTo[lengthNumber / 2];
        for (int i = 0; i < fromTos.length; i++) {
            fromTos[i] = new FromTo();
            fromTos[i].numberNumber = -1;
        }
        int index = 0;
        int start = 0;
        boolean isFind = false;
        do {
            for (int i = 0; i < lengthArr; i++) {
                FromTo correctLength = length(numb, numbs[i], start);
                if (correctLength.different() > 1) {
                    fromTos[index] = correctLength;
                    fromTos[index].numberNumber = i;
                    index++;
                    start += correctLength.different();
                    isFind = true;
                    i = lengthArr;
                }
            }
            if (!isFind) {
                while (index > 0 && (fromTos[index - 1].isChange || fromTos[index - 1].different() == 2)) {
                    index--;
                    start -= fromTos[index].different();
                    fromTos[index] = new FromTo();
                }
                if (index == 0) {
                    return fromTos;
                } else {
                    start--;
                    fromTos[index - 1].isChange = true;
                    fromTos[index - 1].to = fromTos[index - 1].to - 1;
                }
            }
            isFind = false;
        } while (start > 0 && start < lengthNumber);
        return fromTos;
    }


    private static FromTo length(char[] need, char[] whereFind, int start) {
        int length = 0;
        FromTo currentLength = new FromTo();
        int actual = start;
        int endFind = 0;

        for (int i = 0; i < whereFind.length && actual < whereFind.length; i++) {
            endFind = i;
            char c = whereFind[i];
            if (c == need[actual]) {
                length++;
                actual++;
            } else {
                if (length > 1 && length > currentLength.different()) {
                    currentLength.from = i - length;
                    currentLength.to = i;
                    length = 0;
                } else {
                    length = 0;
                    actual = start;
                }
            }
        }
        if (length > 1 && length > currentLength.different()) {
            currentLength.from = endFind - length + 1;
            currentLength.to = endFind + 1;
        }
        return currentLength;
    }

    private static class FromTo {
        int numberNumber = -1;
        private int from;
        private int to;
        boolean isChange;

        public int different() {
            return to - from;
        }
    }

}
