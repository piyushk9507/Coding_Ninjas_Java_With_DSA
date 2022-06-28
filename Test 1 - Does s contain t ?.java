/*

Does s contain t ?
Send Feedback
Given two string s and t, write a function to check if s contains all characters of t (in the same order as they are in string t).
Return true or false.
Do it recursively.
E.g. : s = “abchjsgsuohhdhyrikkknddg” contains all characters of t=”coding” in the same order. So function will return true.
Input Format :
Line 1 : String s
Line 2 : String t
Output Format :
true or false
Sample Input 1 :
abchjsgsuohhdhyrikkknddg
coding
Sample Output 1 :
true
Sample Input 2 :
abcde
aeb
Sample Output 2 :
false

*/


public class Solution {
    
    public static boolean recursiveCall(String str1, String str2, int m, int n)
    {
        if(n==0)
        {
            return true;
        }
        if(m == 0)
        {
            return false;
        }
        
        if(str1.charAt(m-1) == str2.charAt(n-1))
        {
            return recursiveCall(str1, str2, m-1, n-1);
        }
        else
        {
            return recursiveCall(str1, str2, m-1, n);
        }
    }
    
	public static boolean checkSequence(String a, String b) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
        
        if(b.length() == 0)
        {
            return true;
        }       
        return recursiveCall(a, b, a.length(), b.length());
	}
}
