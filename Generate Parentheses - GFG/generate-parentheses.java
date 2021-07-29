// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.next());
        while(t>0)
        {
            int n = Integer.parseInt(sc.next());
            Solution T = new Solution();
            List<String> ans = T.AllParenthesis(n);
            String[] sequences = ans.toArray(new String[0]);
            Arrays.sort(sequences);
            int k = sequences.length;
            for(int i=0;i<k;i++)
            {
                System.out.println(sequences[i]);
            }
            
            t--;
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public List<String> AllParenthesis(int n) 
    {
        List<String> ans=new ArrayList<>();  
        
        //do something
        recur(ans,"",n,0,0,0);
        
        return ans;
        
    }
    
    public void recur(List<String> ans, String output, int n, int open, int close, int i){
        if(i == 2*n){
            ans.add(output);
            return;
        }
        
        //open case
        if(open < n){
            recur(ans,output+"(",n,open+1,close,i+1);
        }
        
        // close case
        if (close < open){
            recur(ans,output+")",n,open,close+1,i+1);
        }
    }
}