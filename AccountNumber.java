import java.util.Random;

public class AccountNumber{
	public static void main(String[] args){
	Random rand = new Random();
	
	int AccountNumber = rand.nextInt();
	System.out.printf("Your Account Number is %d%n",AccountNumber);
	
	int AccountNumberWithBound = rand.nextInt(10);
	System.out.printf("Your Account Number is %d%n",AccountNumber);
	}
}