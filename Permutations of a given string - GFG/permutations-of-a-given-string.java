// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
                        
        }
	}
}

// } Driver Code Ends


class Solution {
    public List<String> find_permutation(String S) {
        ArrayList<String> ans = new ArrayList<>();
        
        int n = S.length();
        
        recur(0,n,ans,S.toCharArray());
        
        Collections.sort(ans);
        
        return ans;
    }
    
    public static void recur(int idx,int N, List<String> arr, char[] sArr){
        if(idx == N){
            String str = String.valueOf(sArr);
            arr.add(str);
            return;
        }
        
        for(int i=idx;i<N;i++){
            // swap elements to generate all possible outcomes
            char temp = sArr[idx];
            sArr[idx] = sArr[i];
            sArr[i] = temp;
            
            recur(idx+1,N,arr,sArr);
            
            // backtrack to prevent list from going brr
            temp = sArr[idx];
            sArr[idx] = sArr[i];
            sArr[i] = temp;
        }
        
    }
    
}