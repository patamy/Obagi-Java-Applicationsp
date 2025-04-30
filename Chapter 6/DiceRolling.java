import java.util.Random;

public class DiceRolling {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] counts = new int[13];

        for (int i = 0; i < 36000000; i++) {
            int die1 = 1 + rand.nextInt(6);
            int die2 = 1 + rand.nextInt(6);
            counts[die1 + die2]++;
        }

        System.out.println("Sum\tFrequency");
        for (int sum = 2; sum <= 12; sum++) {
            System.out.println(sum + "\t" + counts[sum]);
        }
    }
}