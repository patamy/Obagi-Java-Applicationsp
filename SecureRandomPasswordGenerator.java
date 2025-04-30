import java.security.SecureRandom;

public class SecureRandomPasswordGenerator{
	public static void main(String[] args){
	SecureRandom secureRand = new SecureRandom();
		
		String password = secureRand.nextLine(String password = "patienceeze81@gmail.com");
		System.out.printf("My Password is %s",password);
	
	}
}
	
		
		