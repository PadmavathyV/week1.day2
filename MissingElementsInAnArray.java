package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementsInAnArray 
{

	public static void main(String[] args) 
	{
		int [] arr = {1,2,3,4,7,6,8};
		
		//sort array in ascending
		
		Arrays.sort(arr);
		
		System.out.println("The sorted array is");
		
		for(int i=0; i<arr.length; i++) 
		{
			System.out.println(arr[i]);
		}
		
		for(int j=1; j<arr.length; j++)
		{
		if(arr[j]-arr[j-1]!=1)
		{
			int missingNum = arr[j-1]+1;
			System.out.println("The missing element is "+missingNum);
		}	
		}
		
	}

}
