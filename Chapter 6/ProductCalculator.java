public class ProductCalculator {
    public static int product(int... numbers) {
        int result = 1;
        for (int n : numbers) {
            result *= n;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(product(1, 2, 3)); // 6
        System.out.println(product(4, 5));    // 20
        System.out.println(product(7));       // 7
    }
}