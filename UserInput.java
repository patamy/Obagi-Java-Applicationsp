
import java.util.Scanner;





public class UserInput{
    public static void main(String[] arg){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		
		System.out.print("Enter Your Address: ");
		String address = input.nextLine();
		System.out.print("Enter Your age: ");
		byte age = input.nextByte();
		
		System.out.println();
		System.out.printf("Hello %s, You are welcome to First bank", name);
		System.out.printf("You are living in %s", address);
		System.out.printf("You are %d years old", age);
		
	}
} 