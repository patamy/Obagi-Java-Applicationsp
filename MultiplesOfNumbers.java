import java.util.Scanner;

public class MultiplesOfNumbers{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		
	int num = input.nextInt();
	int i = 1;
	while(i <= 15){
		System.out.println(num * i);
		i++;
	}
	}
}