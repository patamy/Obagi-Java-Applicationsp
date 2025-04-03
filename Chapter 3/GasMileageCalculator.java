import java.util.Scanner;

public class GasMileageCalculator{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
int miles, gallons;
double mpg;

System.out.println("Enter miles and gallons (enter -1 to stop):");
while ((miles = input.nextInt()) != -1) {
    gallons = input.nextInt();
    mpg = (double) miles / gallons;
    System.out.println("MPG: " + mpg);
}


	}
}