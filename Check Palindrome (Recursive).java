/*

Check Palindrome (recursive)
Send Feedback
Check whether a given String S is a palindrome using recursion. Return true or false.
Input Format :
String S
Output Format :
'true' or 'false'
Constraints :
0 <= |S| <= 1000
where |S| represents length of string S.
Sample Input 1 :
racecar
Sample Output 1:
true
Sample Input 2 :
ninja
Sample Output 2:
false

*/


public class solution {
    
    public static boolean isStringPalindrome(String input, int i, int j)
    {
        if(i >= j)
        {
            return true;
        }
        
        if(input.charAt(i) != input.charAt(j))
        {
            return false;
        }
        
        return isStringPalindrome(input, i+1, j-1);
        
    }
    

	public static boolean isStringPalindrome(String input) {
		// Write your code here
  
        return isStringPalindrome(input, 0, input.length() - 1);

	}
}
