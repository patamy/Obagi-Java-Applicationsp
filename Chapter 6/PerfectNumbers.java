public class PerfectNumbers {
    public static void main(String[] args) {
        for (int num = 2; num <= 1000; num++) {
            int sum = 0;
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (sum == num) {
                System.out.println(num + " is a perfect number.");
            }
        }
    }
}