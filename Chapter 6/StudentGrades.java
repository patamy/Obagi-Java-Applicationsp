public class StudentGrades {
    public static void main(String[] args) {
        int[][] grades = {
            {87, 96, 70},
            {68, 87, 90},
            {94, 100, 90},
            {100, 81, 82},
            {83, 65, 85}
        };

        for (int i = 0; i < grades.length; i++) {
            double total = 0;
            for (int j = 0; j < grades[i].length; j++) {
                total += grades[i][j];
            }
            double average = total / grades[i].length;
            System.out.printf("Student %d average: %.2f%n", i + 1, average);
        }
    }
}
