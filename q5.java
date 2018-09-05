/*
Q5. Write a program to take an array of 10 numbers from the user and arrange the elements in a waveform. 
For example, if the array is {1,2,3,4,5,6,7,8,9,10} then it should become {2,1,4,3,6,5,8,7,10,9}.
*/

class q5
{
	public static void main(String[] x)
	{
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("The original array :-");
		for(int n : arr)
			System.out.print(n + " ");
		
		System.out.println();
		
		int i,size = 10;
		
		for(i=0;i<size;i = i+2)
		{
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
		
		System.out.println("\nThe resultant array :-");
		for(int n : arr)
			System.out.print(n + " ");
		
		System.out.println();
	}
}
