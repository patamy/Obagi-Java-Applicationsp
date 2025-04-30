import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] unique = new int[5];
        int count = 0;

        while (count < 5) {
            System.out.print("Enter number between 10 and 100: ");
            int num = input.nextInt();
            boolean duplicate = false;

            for (int i = 0; i < count; i++) {
                if (unique[i] == num) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                unique[count] = num;
                count++;
            }

            System.out.println("Unique values:");
            for (int i = 0; i < count; i++) {
                System.out.print(unique[i] + " ");
            }
            System.out.println();
        }
    }
}