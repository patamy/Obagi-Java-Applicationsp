public class SingleDimensionalArrays{
	public static void main(String[] args){
		int[] numbers = {17,15,18,29,14};
		
		String[] names = {"Nelly","Precious","Benjamin","Patience","ThankGod"};
		
			for(int i = 0; i < 5; i++){
				System.out.printf("%s %s%d years old %n",names[i],numbers[i]);
			}
	}
}