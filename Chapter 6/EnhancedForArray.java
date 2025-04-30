public class EnhancedForArray {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10};

        System.out.println("Element\tValue");
        int count = 0;
        for (int value : array) {
            System.out.println(count + "\t" + value);
            count++;
        }
    }
}