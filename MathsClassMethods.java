import java.util.Scanner;

public class MathsClassMethods{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Enter a number: ");
		double num = scan.nextDouble();
		
		System.out.printf("The absolute value is %f%n", Maths.abs(num));
		System.out.printf("The rounded value is %f%n", Maths.round(num));
	}
}