// { Driver Code Starts
import java.util.*;
public class MSP
{	
    public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while (t-- != 0)
		{
			int n=sc.nextInt();
			ArrayList<String> s = new ArrayList<String>(n);
			for (int i=0;i<n;i++)
			    s.add(sc.next());
			String tt;
			tt=sc.next();
			GfG g=new GfG();
			ArrayList<String> res =g.findMatchedWords(s, tt);
			Collections.sort(res);
			for (int i = 0;i < res.size();i++)
			    System.out.print(res.get(i)+" ");
			System.out.println();

		}
	}
}// } Driver Code Ends


/*Complete the provided function*/

class GfG{
    /* The function returns an array of strings 
    present in the dictionary which matches
    the string pattern.
    You are required to complete this method */
    public static ArrayList<String> findMatchedWords(ArrayList<String> dict, String pattern){
        ArrayList<String> ans = new ArrayList<>();
        
        String pHash = getHash(pattern);
        // System.out.println(pHash);
        
        for(int i = 0; i < dict.size(); i++){
            String word = dict.get(i);
            if(word.length() == pattern.length()){
                String wHash = getHash(word);
                if(wHash.equals(pHash)){
                    // System.out.println(wHash);
                    ans.add(word);
                }
            }
        }
        
        return ans;
	    
	}
	
	public static String getHash(String a){
	    Map<Character, Integer>  hm =  new HashMap<>();
	    String res = "";
	    
	    int i = 0;
	    for(int j = 0; j < a.length(); j++){
	        if(!hm.containsKey(a.charAt(j))){
	            hm.put(a.charAt(j),i++);
	        }
	        res+=hm.get(a.charAt(j));
	    }
	    
	    return res;
	}
	
}