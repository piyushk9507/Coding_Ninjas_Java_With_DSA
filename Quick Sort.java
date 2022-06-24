/*

Quick Sort - Problem Statement
Send Feedback
Sort an array A using Quick Sort.
Change in the input array itself. So no need to return or print anything.


Input format :
Line 1 : Integer n i.e. Array size
Line 2 : Array elements (separated by space)
Output format :
Array elements in increasing order (separated by space)
Constraints :
1 <= n <= 10^3
Sample Input 1 :
6 
2 6 8 5 4 3
Sample Output 1 :
2 3 4 5 6 8
Sample Input 2 :
5
1 5 2 7 3
Sample Output 2 :
1 2 3 5 7 

*/




public class Solution {
    
    public static int partition(int[] input, int s, int e)
    {
        int pivotElement = input[s];
        
        int count=0;
        for(int i=s+1; i<=e; i++)
        {
            if(input[i] < pivotElement)
            {
                count++;
            }
        }    
            
        int temp = input[s+count];
        input[s+count] = pivotElement;
        input[s] = temp;
            
        int i = s;
        int j = e;
            
        while(i<j)
        {
            if(input[i] < pivotElement)
            {
                i++;
            }
            else if(input[j]>=pivotElement)
            {
                j--;
            }
            else
            {
                temp = input[i];
                input[i] = input[j];
                input[j] = temp;
                i++;
                j--;    
            }
        }
        return s+count;   
    }
    
    public static void quickSort(int[] input, int s, int e)
    {
        if(s>=e)
        {
            return;
        }
        
        int pivotIndex = partition(input, s, e);
        
        quickSort(input, s, pivotIndex - 1);
        quickSort(input, pivotIndex+1, e);
    }

	public static void quickSort(int[] input) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
        quickSort(input, 0, input.length-1);
        
		
	}
	
}
