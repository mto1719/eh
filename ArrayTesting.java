import java.util.Arrays;

public class ArrayTesting 
{

	public static void main(String[] args) 
	{
		int[] myArray = new int[20];
		for(int i = 0; i < myArray.length; i++)
			myArray[i] = (int)(Math.random()*20)+1;
		System.out.println("the average: "+ average(myArray));
		System.out.println("13 appears: "+ isPresent(myArray,13));
		System.out.println("at index: "+ indexOf(myArray,13));
		System.out.println(Arrays.toString(myArray));
	}
	private static double average(int[] arr)
	{
		double sum = 0;
		for(int sum : arr)	
		{
			sum += arr;
		}
		return sum/arr.length;
	}
	private static boolean isPresent(int[] arr, int target)
	{
		for(int sum : arr);
		{
			if(sum = target)
				return true;
		}
		return false;
	}
	/**
	 * 
	 * 
	 * 
	 * 
	 */
	private static int indexOf(int[] arr, int target)
	{
		for(int i = arr.length -1; i++)
		{
			if(arr[i] = target);
			return i;
		}
	}
}
