package week1.day2.assignments;

public class CharOccuranceString 
{

	public static void main(String[] args) 
	{
		//check num of times e has occured in the given string
		String str = "welcome to chennai";
		
		int count = 0;
		//creating a character array from the string 
		
		char c[] = str.toCharArray();
		
		for (int i = 0; i<str.length(); i++)
		{
			if(c[i]=='e')
				{count++;}
		}
		
		System.out.println("The number of times 'e' has occured is "+count);
	}

}
