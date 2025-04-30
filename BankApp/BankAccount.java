public class BankAccount{
	private String firstName;
	private String lastName;
	private String accountNumber;
	private char gender;
	private double balance;
	private AccountType accountType;
	private String SSN;
	
	public String getFirstName(){
		return firstName;
	}
	public String LastName(){
		return lastName;
	}
	public String getAccountNumber(){
		return accountNumber;
	}
	public char getGender(){
		return gender;
	}
	public double getBalance(){
		return balance;
	}
	public AccountType getAccountType(){
		return accountType;
	}
	public String getSSN(){
		return SSN;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public void setBalance(double balance){
		this.accountType = accountType;
	}
	void withdraw(){
	}
	void deposit(){
	}
	void transferFund(){
	}
	void checkBalance(){
	}
}