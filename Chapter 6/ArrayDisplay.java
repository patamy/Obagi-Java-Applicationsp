public class ArrayDisplay {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10};

        System.out.println("Index\tValue");
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + "\t" + array[i]);
        }
    }
}