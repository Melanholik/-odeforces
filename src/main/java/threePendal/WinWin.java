package threePendal;


public class WinWin {
    public static void main(String[] args) {
        int[] a = new int[]{-9, 0, -5, -7, 10, 6, 1, -8, -4};
        int[] b = new int[]{7, 0, -5, 4, 7, 8, 1, -7, 6};

        System.out.println(maxAbsValExpr(a, b));
    }

    //|a[i] - a[j]| + |b[i] - b[j]| + |i - j|

    public static int maxAbsValExpr(int[] a, int[] b) {
        int sum = 0;
        int length = a.length;
        int aMax =-9;
        int aMin = -9;
        for (int i = 0; i < length && (a[i] >= aMax || a[i] < aMin); i++) {
            for (int j = i + 1; j < length; j++) {
                int actualSum = Math.abs(a[i] - a[j]) + Math.abs(b[i] - b[j]) + j - i;
                if (actualSum > sum) {
                    sum = actualSum;
                    if (a[i] > aMax) {
                        aMax = a[i];
                    } else {
                        aMin = a[i];
                    }
                }
            }
        }
        return sum;
    }
}


