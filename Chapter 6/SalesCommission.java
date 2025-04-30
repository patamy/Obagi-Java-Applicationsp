import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] counters = new int[9]; // for the 9 salary ranges

        while (true) {
            System.out.print("Enter salesperson's gross sales (-1 to end): ");
            double sales = input.nextDouble();
            if (sales == -1) break;

            int salary = (int)(200 + 0.09 * sales);
            int range = salary / 100 - 2;
            if (range >= 0 && range <= 7) {
                counters[range]++;
            } else {
                counters[8]++;
            }
        }

        System.out.println("Salary range:");
        System.out.println("$200-299: " + counters[0]);
        System.out.println("$300-399: " + counters[1]);
        System.out.println("$400-499: " + counters[2]);
        System.out.println("$500-599: " + counters[3]);
        System.out.println("$600-699: " + counters[4]);
        System.out.println("$700-799: " + counters[5]);
        System.out.println("$800-899: " + counters[6]);
        System.out.println("$900-999: " + counters[7]);
        System.out.println("$1000 and over: " + counters[8]);
    }
}
