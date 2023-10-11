package week1.day2;

public class PositiveOrNegativeArray 
{
	public static void main(String[] args) 
	{
		int tobeCheckedNumbers[] = {10,-20,0,30,-3,0,4,-56};
		for(int i=0;i<tobeCheckedNumbers.length;i++)
		{
			PositiveOrNegativeArray.checkPositiveNegative(tobeCheckedNumbers[i]);
		}
	}
	static void checkPositiveNegative(int number)
	{
		if(number <0)
		{
			System.out.println("The number is negative");
		}
		else if(number>0)
		{
			System.out.println("The number is positive");
		}
		else
		{
			System.out.println("The number is neither positive nor negative");
		}
	}
}
