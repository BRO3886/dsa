// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N){
        long[] temp = new long[(int)N];
        return countMergeSort(arr,temp,0,(int)N-1);
    }
    
    static long countMergeSort(long arr[], long temp[], int left, int right){
        int mid;
        
        long invCount = 0;
        if(right > left){
            mid = (right+left)/2;
            invCount += countMergeSort(arr,temp,left,mid);
            invCount += countMergeSort(arr,temp,mid+1,right);
            
            //merge
            invCount+= merge(arr,temp,left,mid+1,right);
        }
        return invCount;
    }
    
    static long merge(long arr[], long temp[], int left, int mid, int right){
        int i=left,j=mid,k=left;
        
        long invCount = 0;
        
        while(i<= mid-1 && j <= right){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            } else{
                temp[k++] = arr[j++];
                
                //if a[i] > a[j] then a[i]...a[mid] > a[j]
                invCount += (mid - i);
            }
        }
        
        while(i <= mid -1){
            temp[k++] = arr[i++];
        }
        
        while(j <= right){
            temp[k++] = arr[j++];
        }
        
        //copying merged elements??
        for(i = left; i <= right; i++){
            arr[i] = temp[i];
        }
        
        return invCount;
    }
}