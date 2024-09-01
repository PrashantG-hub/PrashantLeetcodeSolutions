//{ Driver Code Starts
import java.util.*;
import java.lang.Math;

class Sorting
{
	
	static void printArray(int arr[],int size)
	{
		int i;
		for(i=0;i<size;i++)
		System.out.print(arr[i]+" ");
	    System.out.println();
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
		
			for(int i=0;i<n;i++)
			a[i]= sc.nextInt();
			
			 new Solution().insertionSort(a,n);
			 printArray(a,n);
			
		t--;
		}
		
	}
}
// } Driver Code Ends

class Solution
{
  public void insertionSort(int arr[], int n)
  {
  if (n <= 1) {
            return;
        }

        // Sort the first n-1 elements
        insertionSort(arr, n - 1);

        // Insert the nth element into the sorted array of size n-1
        int last = arr[n - 1];
        int j = n - 2;

        // Move elements of arr[0..n-1], that are greater than last,
        // to one position ahead of their current position
        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = last;
  }
}