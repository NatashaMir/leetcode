public class PrimeExample {

    static void checkPrime(int n) {

        int i;
        boolean isPrime = false;

        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = true;
                break;
            }
        }

        if (isPrime) {
            System.out.println(n + " is not prime number");
        } else {
            System.out.println(n + " is prime number");
        }

    }
}