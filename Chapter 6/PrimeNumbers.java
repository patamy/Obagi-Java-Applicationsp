public class PrimeNumbers {
    public static void main(String[] args) {
        for (int number = 2; number <= 100; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}