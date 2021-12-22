package tasks.dif800;

/*
G. Ложные Новости (простая)
ограничение по времени на тест1 секунда
ограничение по памяти на тест256 мегабайт
ввод стандартный ввод
вывод стандартный вывод
Поскольку сегодня первое апреля, Хайди подозревает, что новости, о которых она сегодня читает, являются ложными.
Она не хочет выглядеть глупо перед другими участниками.
Она знает, что новость является ложной, если в ней содержится строка «heidi» в качестве подпоследовательности.
Помогите Хайди определить, является ли данный фрагмент новости истинным, но, пожалуйста, будьте предельно осторожны...

Входные данные
В первой и единственной строке содержится непустая строка s длиной не более чем 1000,
состоящая из строчных букв латинского алфавита (a-z).

Выходные данные
Выведите «YES» (без кавычек), если строка s содержит последовательность «heidi» в качестве подпоследовательности.
В противном случае выведите «NO» (без кавычек).

Примеры
входные данные
abcheaibcdi
выходные данные
YES
входные данные
hiedi
выходные данные
NO
*/


import java.util.Scanner;

public class task802G {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.nextLine().toCharArray();
        char[] expected = new char[]{'h', 'e', 'i', 'd', 'i'};
        int indexExpected = 0;
        boolean isFind = false;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == expected[indexExpected]) {
                indexExpected++;
                if (indexExpected == expected.length) {
                    System.out.println("YES");
                    i = chars.length;
                    isFind = true;
                }
            }
        }
        if (!isFind) {
            System.out.println("NO");
        }
    }
}
