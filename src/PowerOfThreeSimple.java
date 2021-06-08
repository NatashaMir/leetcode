public class PowerOfThreeSimple {

    public boolean isPowerOfThree(int n) {

        if (n == 0){
            return false;
        }

        if (n == 1){
            return true;
        }

        while (n > 0){
            int rem = n % 3;
            if (rem == 0){
                n = n/3;
                if (n == 1){
                    return true;
                }
            }
            else {
                return false;
            }

        }

        return false;

    }
}
