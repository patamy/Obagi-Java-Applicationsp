public class MultiDimensionalArrays{
	public static void main(String[] args){
	
	int[][] numbers = {
					{31, 15,20,16},
					{45,12,34,35},
					{18,17,54,28},
					};
		int firstsum = 0;
		int secondsum = 0;
		for(int row = 0; row < 3; row++){
			for(int col = 0; col < 4; col++){
				
				firstsum += numbers[row][col];
			}	
		}
		 System.out.printf("The sum of all the numbers is %d%n",firstsum);
		 System.out.println("===================================================");
		 for(int row[] : numbers){
			 for(int num: row){
				 secondsum += num;
			 }
		 }
		 System.out.printf("The sum of all the numbers is %d%n",secondsum);
	}
}