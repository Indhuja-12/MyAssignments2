package week1.day2;

public class OddEven {

	public static void main(String[] args)
	{
	int[]num= {0,1,2,3,4,5,6};
	System.out.println("odd numbers are"+":-");
	for (int i = 0; i< num.length; i++) 
	{
		if(i%2!=0)
			System.out.println(i+"");
	}
	System.out.println("even numbers are"+":-");
		for (int j = 0; j <num.length; j++)
		{
			if(j%2==0)
		System.out.println(j+"");
		}
	}

	}