public class Fibonacci {

    public static int[] fibMemo = new int[20];

    public static int fibByRecMemo(int num) {

        if (num == 0) {
            fibMemo[0] = 0;
            return 0;
        }

        if (num == 1 || num == 2) {
            fibMemo[num] = 1;
            return 1;
        }

        if (fibMemo[num] == 0) {
            fibMemo[num] = fibByRecMemo(num - 1) + fibByRecMemo(num - 2);
            return fibMemo[num];
        } else {
            return fibMemo[num];
        }

    }
}