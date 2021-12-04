package week1.day2.assignments;

import java.util.Scanner;

public class Negative2Positive 
{

	public static void main(String[] args) 
	{
		int i = 50;
		//Scanner orgStr = new Scanner(System.in); // to get data enter java code
		//System.out.println("The entered string is"+orgStr);
		
		if(i<0)
		{
			int j=1;
			j=-1*i;
			System.out.println("The changed positive number is "+j);
			
		}else if(i==0) {System.out.println("The number is 0");}
		else {System.out.println("The number is Already Positive");}
		
	}

}
