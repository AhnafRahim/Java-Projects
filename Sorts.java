package arrays;
import java.util.*; 
public class BubbleSort 
{
	public static void main(String[] args)
	{
		Scanner sca = new Scanner(System.in); 
		int choice; 
		System.out.println("Choose: \n1: Bubble Sort \n2: Exchange Sort \n3: Insertion Sort \n4: Selection Sort \n5: Exit"); 
		choice = sca.nextInt(); 
		sca.close(); 
			
			switch(choice)
			{
			case 1: 
				double[] nums1 = {71.9, 84.3, 45.2, 98.3, 100, 75.8, 65.9, 82.3, 33.8, 75.8};
				System.out.println("The dataset is: ");
				System.out.println(printArr(nums1));
				bubblesort(nums1); 
				System.out.println("Bubble sorted: "); 
				System.out.println(printArr(nums1));
				break;
		
			case 2: 
				double[] nums2 = {71.9, 84.3, 45.2, 98.3, 100, 75.8, 65.9, 82.3, 33.8, 75.8};
				System.out.println("The dataset is: ");
				System.out.println(printArr(nums2));
				exchangesort(nums2); 
				System.out.println("Exchange sorted: ");
				System.out.print(printArr(nums2));
				break; 
		
			case 3: 
				double[] nums3 = {71.9, 84.3, 45.2, 98.3, 100, 75.8, 65.9, 82.3, 33.8, 75.8};
				System.out.println("The dataset is: ");
				System.out.println(printArr(nums3));
				insertionsort(nums3); 
				System.out.println("Insertion sorted: ");
				System.out.println(printArr(nums3));
				break; 
				
			case 4: 
				double [] nums4 = {71.9, 84.3, 45.2, 98.3, 100, 75.8, 65.9, 82.3, 33.8, 75.8};
				System.out.println("The dataset is: ");
				System.out.println(printArr(nums4));
				selectionsort(nums4); 
				System.out.println("Selection sorted: ");
				System.out.println(printArr(nums4));
				break; 
				
			case 5: 
				System.out.println("Yeet");
				break; 
			}
	}
	
	//method for bubble sort 
	public static void bubblesort(double[] arr)
	{
		for(int i = 0; i < arr.length-1; i++)
		{
			for(int x = 0; x < arr.length - i - 1; x++)
			{
				if(arr[x] > arr[x+1])
				{
					double temp; 
					temp = arr[x];
					arr[x] = arr[x + 1]; 
					arr[x + 1] = temp; 
				}
			}
		}
	}
	
	//method for exchange sort 
	public static void exchangesort(double[] arr)
	{
		double temp; 
		for(int i = 0; i < arr.length -1; i++)
		{
			for(int j = i + 1; j < arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j]; 
					arr[j] = temp; 
				}
			}
		}
	}
	
	//method for insertion sort
	public static void insertionsort(double[] arr)
	{
		for(int i = 1; i < arr.length; i++)
		{
			double key = arr[i]; 
			int j = i-1; 
			while(j >= 0 && arr[j] > key)
			{
				arr[j + 1] = arr[j];
				j--; 
			}
			arr[j+1] = key; 
		}
	}
	
	//method for selection sorting 
	public static void selectionsort(double[] arr)
	{
		for(int i = 0; i < arr.length - 1; i++)
		{
			double temp; 
			int min = i; 
			for(int j = i + 1; j< arr.length; j++)
			{
				if(arr[j] < arr[min])
				{
					min = j; 
				}
			}
			temp = arr[min]; 
			arr[min] = arr[i]; 
			arr[i] = temp; 
		}
	}
	
	//method for printing 
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
