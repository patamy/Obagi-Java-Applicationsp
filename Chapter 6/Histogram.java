public class Histogram {
    public static void main(String[] args) {
        int[] scores = {3, 5, 7, 2, 9};

        for (int score : scores) {
            for (int i = 0; i < score; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}