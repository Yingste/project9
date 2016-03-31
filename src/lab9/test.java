package lab9;

public class test
{
	public static void main(String[] args)
	{
		System.out.println(recur(7));
	}
	
	public static int recur(int in)
	{
		int count = 0;
		
		
		
		if (in > 0)
		{
			count += recur(in - 1);
			count += in * in;
			
		}
		
		return count;
	}
}

