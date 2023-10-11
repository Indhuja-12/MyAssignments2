package week1.day2;

 class Duplicate {

	public static void main(String[] args) 
	{
		int[]num= {2,3,7,3,8,2,8,5,1,9};
		System.out.println("The duplicate numbers are"+":");
		{
			for (int i = 0; i < num.length; i++) 
			{
				for (int j = i+1; j <num.length; j++)
				{
				if(num[i]==num[j])
					System.out.println(num[i]);
					
					
				}
			}
		}
		

	}

}
