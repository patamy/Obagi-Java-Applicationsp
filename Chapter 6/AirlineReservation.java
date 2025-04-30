import java.util.Scanner;

public class AirlineReservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean[] seats = new boolean[10];

        while (true) {
            System.out.print("Please type 1 for First Class or 2 for Economy: ");
            int choice = input.nextInt();
            
            if (choice == 1) {
                if (assignSeat(seats, 0, 4)) {
                    System.out.println("First Class seat assigned.");
                } else if (assignSeat(seats, 5, 9)) {
                    System.out.println("Economy seat assigned.");
                } else {
                    System.out.println("Flight is fully booked!");
                    break;
                }
            } else if (choice == 2) {
                if (assignSeat(seats, 5, 9)) {
                    System.out.println("Economy seat assigned.");
                } else if (assignSeat(seats, 0, 4)) {
                    System.out.println("First Class seat assigned.");
                } else {
                    System.out.println("Flight is fully booked!");
                    break;
                }
            }
        }
    }

    private static boolean assignSeat(boolean[] seats, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (!seats[i]) {
                seats[i] = true;
                return true;
            }
        }
        return false;
    }
}
