
/*


Count Zeros
Send Feedback
Given an integer N, count and return the number of zeros that are present in the given integer using recursion.
Input Format :
Integer N
Output Format :
Number of zeros in N
Constraints :
0 <= N <= 10^9
Sample Input 1 :
0
Sample Output 1 :
1
Sample Input 2 :
00010204
Sample Output 2 :
2
Explanation for Sample Output 2 :
Even though "00010204" has 5 zeros, the output would still be 2 because when you convert it to an integer, it becomes 10204.
Sample Input 3 :
708000
Sample Output 3 :
4




*/




public class solution {
    
    public static int countZerosRec(int input, int a)  // Here, a is not of any use. 
    {
        if(input == 0)
        {
            return 0;
        }
        
        
        int smallOutput = countZerosRec(input/10, 1);
        
        if(input%10 == 0)
        {
            return smallOutput+1;
        }
        else
        {
            return smallOutput;
        }
        
        
    }
    

	public static int countZerosRec(int input){
		// Write your code here
        
        if(input == 0)          // if input is 0, then output should be 1. so I have written this condition and and then called a new function.
        {
            return 1;
        }
        
        return countZerosRec(input, 1);      //  1 is passed as dummy and of no use.
        
        
	}
}
