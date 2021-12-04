package week1.day2.assignments;

import java.util.Scanner;

public class PalindromeString 
{

	public static void main(String[] args) 
	{
		//System.out.println("Enter a string to check a palindrome: ");
		//Scanner orgStr = new Scanner(System.in); // to get data enter java code
		//System.out.println("The entered string is"+orgStr);
		
		String str = "madam";
		String nstr = "";
		
		System.out.println("The given string is "+str);
		char ch;
		
		for(int i=0;i<str.length();i++)
		
			{
			ch = str.charAt(i);//extract each character
			nstr = ch+nstr;	//add each character in front if the existing character
			}
		
		System.out.println("The reversed string is "+nstr);
		
		if(str==nstr)
		{
			System.out.println("The string is a palindrome "+str);
		}
		else {System.out.println("The String is not a palindrome "+str);}
		
	}

}
