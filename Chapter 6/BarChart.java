public class BarChart {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 2, 9, 4};

        for (int number : numbers) {
            for (int i = 0; i < number; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}