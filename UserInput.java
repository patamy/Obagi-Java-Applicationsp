
import java.util.Scanner;





public class UserInput{
    public static void main(String[] arg){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		System.out.print("Enter gender (M/F): ");
		char gender = input.next().charAt(0);
		
		input.nextLine();
		
		System.out.print("Enter Your Address: ");
		String address = input.nextLine();
		
		System.out.print("Enter Your age: ");
		byte age = input.nextByte();
		
		System.out.print("Enter Your balance: ");
		double balance = input.nextDouble();
		
		System.out.print("Do You Love Java ? (True/False): ");
		boolean isJava = input.nextBoolean();
		
		
		
		System.out.println();
		System.out.printf("Hello %s, You are welcome to First bank%n", name);
		System.out.printf("You are living in %s%n", address);
		System.out.printf("You are %d years old%n", age);
		System.out.printf("Your account balance is %c%.2f%n", '$', balance);
		System.out.printf("%s, Do You Love Java %b%n",isJava,name);
		System.out.printf("Your gender is %c%n", gender);
	}
} 