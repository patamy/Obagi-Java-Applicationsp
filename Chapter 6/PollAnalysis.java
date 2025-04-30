import java.util.Scanner;

public class PollAnalysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ratings = new int[11]; // 0–10
        
        System.out.println("Enter ratings (0-10). Enter -1 to finish:");
        while (true) {
            int rate = input.nextInt();
            if (rate == -1) break;
            if (rate >= 0 && rate <= 10) {
                ratings[rate]++;
            } else {
                System.out.println("Invalid rating.");
            }
        }
        
        System.out.println("Rating\tFrequency");
        for (int i = 0; i < ratings.length; i++) {
            System.out.println(i + "\t" + ratings[i]);
        }
    }
}