// { Driver Code Starts
import java.io.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling maxSubarraySum() function
		    System.out.println(obj.maxSubarraySum(arr, n));
		}
	}
}

// } Driver Code Ends


/*
Initialize:

    max_so_far = INT_MIN

    max_ending_here = 0


Loop for each element of the array

  (a) max_ending_here = max_ending_here + a[i]

  (b) if(max_so_far < max_ending_here)

            max_so_far = max_ending_here

  (c) if(max_ending_here < 0)

            max_ending_here = 0

return max_so_far
*/


class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int arr[], int n){
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;
        
        for(int i = 0; i < n; i++){
            maxEndingHere = maxEndingHere + arr[i];
            
            if(maxSoFar < maxEndingHere){
                maxSoFar = maxEndingHere;
            }
            
            if(maxEndingHere < 0){
                maxEndingHere = 0;
            }
        }
        
        return maxSoFar;
    }
    
}

