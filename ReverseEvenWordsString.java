package week1.day2.assignments;

import org.apache.poi.ss.util.SSCellRange;
import org.checkerframework.checker.units.qual.s;

public class ReverseEvenWordsString 
{

	public static void main(String[] args) 
	{
		String test = "I am a software tester";
		
		String[] arr = test.split(" ");
		
		for(String ss : arr)
		{
			System.out.println(ss);
		}
		
		for (int i=0; i<test.length(); i++)
		{
			if(i%2==0 || i==0)
			{
				System.out.println("The even words are "+arr[i]);
				
				char ch;
				
				for(int rev=0;rev<arr.length;rev++)
				
					{
					ch = arr.charAt(rev);//extract each character
					arr = ch+arr;	//add each character in front if the existing character
					}

				
			}
		}
		
	}

}
