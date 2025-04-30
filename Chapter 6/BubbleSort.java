import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] data = {9, 4, 6, 2, 10, 3};
        
        for (int pass = 0; pass < data.length - 1; pass++) {
            for (int i = 0; i < data.length - pass - 1; i++) {
                if (data[i] > data[i + 1]) {
                    int temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(data));
    }
}