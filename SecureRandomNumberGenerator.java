import java.security.SecureRandom;

public class SecureRandomNumberGenerator{
	public static void main(String[] args){
		SecureRandom secureRand = new SecureRandom();
		
		Boolean option = secureRand.nextBoolean();
		System.out.printf("Do You Love Java? %b%n",option);
		
		int integer = secureRand.nextInt();
		System.out.printf("The Integer is %d%n",integer);
		
		int integerWithBound = secureRand.nextInt(100) + 1;
		System.out.printf("The intger is %d%n",integerWithBound);
		
		long number = secureRand.nextLong();
		System.out.printf("The integer is %d%n",number);
		
		long numberWithBound = secureRand.nextLong(8_000_000_000L);
		System.out.printf("The integer is %d%n",numberWithBound);
		
		float num = secureRand.nextFloat();
		System.out.printf("The number is %f%n",num);
		
		double average = secureRand.nextDouble();
		System.out.printf("The Number is %.2f%n",average);
		
	}
}