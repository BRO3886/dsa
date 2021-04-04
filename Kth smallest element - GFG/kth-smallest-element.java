// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.kthSmallest(arr, 0, n-1, k));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    
    // public static int partition(int[] arr, int l, int h){
    //     //pivot at end of array
    //     int pivot = arr[h], i=l;
        
    //     for(int j = l; j <= h-1; j++){
    //         if(arr[j] < pivot){
    //             // swap(arr[i], arr[j])
    //             int temp = arr[i];
    //             arr[i] = arr[j];
    //             arr[j] = temp;
    //             //increment i
    //             i++;
    //         }
    //     }
    
    //     // swap(arr[i], arr[h])
    //     int temp = arr[i];
    //     arr[i] = arr[h];
    //     arr[h] = temp;
        
    //     return i;
    // }
    
    public static int kthSmallest(int[] arr, int l, int r, int k) { 
        if (k > 0 && k <= r - l + 1){
            // int pos = partition(arr,l,r);
            
            // if(pos - l == k - 1){
            //     return arr[pos];
            // }
            
            // if(pos - l > k - 1){
            //     // left subarray
            //     return kthSmallest(arr, l, pos-1, k);
            // }
            // //right subarray
            // return kthSmallest(arr, pos + 1, r, k - pos + l - 1);
            
            Arrays.sort(arr);
            
            return arr[k-1];
        }
        // If k is more than number of elements in array
        return Integer.MAX_VALUE;
    } 
}
