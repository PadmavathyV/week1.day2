package week1.day2.assignments;

public class FindIntersectionArray 
{

	public static void main(String[] args) 
	{
		int a[] = {3,2,11,4,6,7};
		int b[] = {1,2,8,4,9,7};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("The array is ");
			//for(int i=a[];i<a.length;i++)
		{
			for(int j=b[0];j<b.length;j++)
			{
				if(i==j)
				{
					System.out.println("The intersection number is "+a[i]);
					System.out.println("The intersection position is "+i);
				}
			}
				
		}
		
		}
	}

}
