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