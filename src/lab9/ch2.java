package lab9;

public class ch2
{
	public static void main(String[] args)
	{
		int[] in = {1, 55, 3, 4, 5, 22, 7, 8, 9, 10};
		System.out.println(aMax(in));
	}
	
	public static int aMax(int[] arr)
	  {
	    return arraySumRec(arr, 0, arr.length - 1);
	  }
	  
	  /**
	   * Returns the sum of array elements from start to end, inclusive.
	   */
	  private static int arraySumRec(int[] arr, int start, int end)
	  {
	    if (start == end)
	    {
	      return arr[start];
	    }
	    else
	    {
	      int mid = (start + end) / 2;
	      int leftSum = arraySumRec(arr, start, mid);
	      int rightSum = arraySumRec(arr, mid + 1, end);
	      return Math.max(leftSum, rightSum);
	    }
	  }
}
