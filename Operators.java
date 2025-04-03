public class Operators{
	public static void main(String[] args){
	
	//Assignment Operators(=)
	int num1,num2;
	num1 = 19;
	num2 = 5;
	
	num1 += num2; //(num1 = num1 + num2)

	
	
	//Arithmetic Operators(+,*,-,/,%);
	int sum = num1 + num2;
	
	int product = num1 * num2;
	
	int difference = num1 - num2;
	
	double quotient = (double)num1 / num2;
	
	int modulus = num1%num2;
	
	
	//Relational Operators(>,<,>=,<=,==,!=)
	boolean isLessThan = num1 < num2;
	boolean isGreaterThan = num1 > num2;
	boolean isGreaterThanOrEqualTo = num1 >= num2;
	boolean isLessThanOrEqualTo = num1 <= num2;
	boolean isEqualTo = num1 == num2;
	boolean isNotEqualTo = num1 != num2; 
	
	//Logical Operators(Used for Decision making, they are used along with relational operators).
	//(&&,||, ! ( for AND, OR, NOT))
	
	boolean isAndOperator = num1 > num2 && num1 >= num2;
	
	//OR Operator
	boolean isOrOperator = num1 > num2 || num1 >= num2;
	//Not Operator
	boolean isNotOperator = !(num1 == num2 || num1 >= num2);
	
	System.out.printf("The sum of the numbers is: %d%n", sum);
   System.out.printf("The product of the numbers is: %d%n", product);
   System.out.printf("The difference between %d and %d is: %d%n", num1, num2, difference);
   System.out.printf("The quotient of num1 and num2 is: %f%n", quotient);
   System.out.printf("The remainder between num1 and num2 is %d%n", modulus);
   
   System.out.println("==================================================================================");
   System.out.printf("Is %d < %d? %b%n", num1,num2, isLessThan);
   System.out.printf("Is %d > %d? %b%n", num1,num2, isGreaterThan);
   System.out.printf("Is %d >= %d? %b%n", num1,num2, isGreaterThanOrEqualTo);
   System.out.printf("Is %d <= %d? %b%n", num1,num2, isLessThanOrEqualTo);
   System.out.printf("Is %d == %d? %b%n", num1,num2, isEqualTo);
   System.out.printf("Is %d != %d? %b%n", num1,num2, isNotEqualTo);
   
   System.out.println("==================================================================================");
   System.out.printf("is %d > %d && %d >= %d? %b%n", num1,num2,num1,num2,isAndOperator);
   System.out.printf("is %d == %d || %d >= %d? %b%n", num1,num2,num1,num2,isOrOperator);
  System.out.printf("(is ! %d == %d && %d >= %d? %b%n", num1,num2,num1,num2,isNotOperator);
	}
}