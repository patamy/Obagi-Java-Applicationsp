import java.util.Random;

public class RandomNumberGenerator{
	public static void main(String[] args){
		Random rand = new Random();
		
		Boolean option = rand.nextBoolean();
		System.out.printf("Do You Love Java? %b%n",option);
		
		int integer = rand.nextInt();
		System.out.printf("The Integer is %d%n",integer);
		
		int integerWithBound = rand.nextInt(100) + 1;
		System.out.printf("The intger is %d%n",integerWithBound);
		
		long number = rand.nextLong();
		System.out.printf("The integer is %d%n",number);
		
		long numberWithBound = rand.nextLong(8_000_000_000L);
		System.out.printf("The integer is %d%n",numberWithBound);
		
		float num = rand.nextFloat();
		System.out.printf("The number is %f%n",num);
		
		double average = rand.nextDouble();
		System.out.printf("The Number is %.2f%n",average);
		
	}
}