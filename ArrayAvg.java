package arrays;
import java.text.DecimalFormat; 
public class ArrayAvg 
{
	public static void main(String[] args)
	{
		//array stuff 
		double[] nums = {71.9, 84.3, 45.2, 98.3, 100, 75.8, 65.9, 82.3, 33.8, 75.8};
		System.out.println(printArr(nums)); 
	
		//personal format preference
		
			DecimalFormat df = new DecimalFormat("#.###"); 
		
		//some variables 
		double sum = 0, average; 
				
		//for loop 
		for(int i = 0; i < nums.length; i++)
		{ 
			sum = sum + nums[i]; 
		}
		average = sum/10; 
		System.out.println("The average is: " + df.format(average)); 
	}
	
	//method for printing array 
	public static double[] printArr(double[] arr)
	{
		//for loop part 2
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + "  ");
		}
		return arr;
	}
}
