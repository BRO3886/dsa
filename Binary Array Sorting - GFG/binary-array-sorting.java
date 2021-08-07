// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
        	int n = sc.nextInt();
        	int array[] = new int [n];
        	for(int i=0; i<n; i++)
        		array[i] = sc.nextInt();

            Solution ob = new Solution();
            int result[] = new int[n];
            result =  ob.SortBinaryArray(array,n);

            for(int i=0; i<n; i++)
            	System.out.print(result[i]+" "); 
            System.out.println();
            t--;
        }
    } 
}


// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
	static int[] SortBinaryArray(int arr[], int n) { 
	    int low = 0;
	    int high = 0;
        while(high < n){
            if(arr[high] == 0){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high++;
            } else {
                high++;
            }
        }
        
        return arr;
	} 
} 
