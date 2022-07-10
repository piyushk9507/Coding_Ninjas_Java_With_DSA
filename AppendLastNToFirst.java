/*

AppendLastNToFirst
Send Feedback
You have been given a singly linked list of integers along with an integer 'N'. Write a function to append the last 'N' nodes towards the front of the singly linked 
list and returns the new head to the list.

Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains the elements of the singly linked list separated by a single space. 

The second line contains the integer value 'N'. It denotes the number of nodes to be moved from last to the front of the singly linked list.
Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
Output format :
For each test case/query, print the resulting singly linked list of integers in a row, separated by a single space.

Output for every test case will be printed in a seperate line.
Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
0 <= N < M
Time Limit: 1sec

Where 'M' is the size of the singly linked list.
Sample Input 1 :
2
1 2 3 4 5 -1
3
10 20 30 40 50 60 -1
5
Sample Output 1 :
3 4 5 1 2
20 30 40 50 60 10
Sample Input 2 :
1
10 6 77 90 61 67 100 -1
4
Sample Output 2 :
90 61 67 100 10 6 77 
 Explanation to Sample Input 2 :
We have been required to move the last 4 nodes to the front of the list. Here, "90->61->67->100" is the list which represents the last 4 nodes. When we move this list 
to the front then the remaining part of the initial list which is, "10->6->77" is attached after 100. Hence, the new list formed with an updated head pointing to 90.


*/

/*

	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*/


public class Solution {
    
    public static int countElement(LinkedListNode<Integer> head)
    {
        int count = 0;
        LinkedListNode<Integer> temp = head;
        
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }

	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
		//Your code goes here
        
        LinkedListNode<Integer> temp = head;
        LinkedListNode<Integer> temp1 = null, newHead = null;
        
        int count = countElement(head);
        
        if(n == 0)
        {
            return head;
        }
        if(count < n)
        {
            return head;
        }
        n = count - n;
        int i = 0;
        while(i < n-1)
        {
            temp = temp.next;
            i++;
        }
        temp1 = temp.next;
        temp.next = null;
        newHead = temp1;
        while(temp1.next != null)
        {
            temp1 = temp1.next;
        }
        temp1.next = head;
        head = newHead;
        return head;    
  }
}

