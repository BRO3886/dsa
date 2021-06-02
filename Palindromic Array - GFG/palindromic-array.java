// { Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
    public static boolean isPalindromeNumber(int a){
        String num = Integer.toString(a);
        
        int len = num.length();
        
        for(int i = 0, j = len -1; i<len/2;i++, j--){
            if(num.charAt(i)!=num.charAt(j)) return false;
        }
        
        return true;
    }
    
	public static int palinArray(int[] a, int n)
           {
               for(int i: a){
                   if(!isPalindromeNumber(i)) return 0;
               }   
               return 1;
           }
}