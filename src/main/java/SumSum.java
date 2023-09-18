public class SumSum {
    public int calculateSum(int m, int n, int a, int b, int c) {
        int result = 0;
        if (n <= a || m <= b) {
            throw new IllegalArgumentException("не підходять значення");
        }
        for (int i = a; i < n; i++) {
            for (int j = b; i <= m; i++) {
                if (c == i) {
                    throw new IllegalArgumentException("ділення на 0 в знаменнику(і=а)");
                }
                 result += (i + j) /( i - c);
            }
        }




        return  result;
    }
}
