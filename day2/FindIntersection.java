package week1.day2;

public class FindIntersection {

	public static void main(String[] args)
	{
		int firstArray[] = {3,2,11,4,6,7};
		int secondArray[] = {1,2,8,4,9,7};
		for (int i = 0; i < firstArray.length; i++) 
		{
			for (int j = 0; j < secondArray.length; j++)
			{
				if(firstArray[i]==secondArray[j]) //2==1 2==2
				{
					System.out.println(firstArray[i]);
				}
			}
		}
	}
}
