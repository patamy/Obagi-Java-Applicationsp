public class TemperatureConversion {
    public static void main(String[] args) {
        System.out.println("Fahrenheit\tCelsius");
        for (int f = 0; f <= 212; f += 10) {
            double c = (5.0 / 9.0) * (f - 32);
            System.out.printf("%d\t\t%.2f%n", f, c);
        }
    }
}