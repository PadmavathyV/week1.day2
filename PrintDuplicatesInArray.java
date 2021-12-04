package week1.day2.assignments;

import java.util.Arrays;

public class PrintDuplicatesInArray 
{

	public static void main(String[] args) 
	{
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int count = 0;
		//sort array
		Arrays.sort(arr);
		//System.out.println("Sorted array is ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==arr[i+1]) 
			{
				count=count+1;
				System.out.println("Duplicate number: "+arr[i]);
				System.out.println("The number of duplicates is "+count);
			}
		}
		
		
	}

}
