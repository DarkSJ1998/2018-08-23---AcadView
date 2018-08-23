import java.util.Scanner;

class q4
{
	public static void main(String[] x)
	{
		int arr[] = new int[10];
		int i,size = 10,max,secondMax,pos = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Start entering the elements of the array :-");
		for(i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		max = arr[0];
		for(i=0;i<size;i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
				pos = i;
			}
		}
		arr[pos] = -999;
		
		secondMax = arr[0];
		for(i=0;i<size;i++)
		{
			if(secondMax < arr[i])
			{
				secondMax = arr[i];
			}
		}
		arr[pos] = max;
		System.out.println("\nThe Array :-");
		for(int n : arr)
			System.out.print(n + " ");
		
		System.out.println();
		System.out.println("Second Largest Element : " + secondMax);
	}
}