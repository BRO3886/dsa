// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class PhoneDigit
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//testcases
        
        
        while(t-- > 0)
        {
            int n = sc.nextInt(); // input size of array
            int arr[] = new int[n]; //input the elements of array that are keys to be pressed
            
            for(int i = 0; i < n; i++)
               arr[i] = sc.nextInt();//input the elements of array that are keys to be pressed
            ArrayList <String> res = new Solution().possibleWords(arr, n);
            for (String i : res) System.out.print (i + " ");
             System.out.println();
              
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static List<String> keypad = Arrays.asList("","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz");
    //Function to find list of all words possible by pressing given numbers.
    static ArrayList <String> possibleWords(int a[], int N)
    {
        ArrayList<String> ans = new ArrayList<>();
        
        recur(a,0,N,"", ans);
        
        return ans;
    }
    
    static void recur(int a[], int i, int N, String output, List<String> ans){
        if (i == N){
            ans.add(output);
            return;
        }
        
        // 0 or 1
        if(a[i] == 0 || a[i]==1){
            recur(a,i+1,N,output,ans);
        }
        
        int val = a[i];
        String keyVal = keypad.get(val);
        
        for(int k = 0; k < keyVal.length(); k++){
            recur(a,i+1,N,output+keyVal.charAt(k),ans);
        }
    }
}


