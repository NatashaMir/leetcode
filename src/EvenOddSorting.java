public class EvenOddSorting {

    public static int evenOddSorting(int[] s) {

        int i = 0;
        int j = s.length - 1;
        int tmp;
        int result = 0;

        while (i < j) {

            while (s[i] % 2 != 0) {
                i++;
            }

            while (s[j] % 2 == 0){
                j--;
            }

            if (i < j) {
                tmp = s[i];
                s[i] = s[j];
                s[j] = tmp;
                result++;
            }
        }

        return result;
    }

}
