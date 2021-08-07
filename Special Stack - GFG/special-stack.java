// { Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SpeStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			Stack<Integer> s=new Stack<>();
			GfG g=new GfG();
			while(!g.isEmpty(s)){
			    g.pop(s);
			}
			while(!g.isFull(s,n)){
				g.push(sc.nextInt(),s);
			}
		System.out.println(g.min(s));
		}
	}
}// } Driver Code Ends


/*Complete the function(s) below*/
class GfG{
	public void push(int a,Stack<Integer> s){
	    s.push(a);
	}
	public int pop(Stack<Integer> s){
        return s.pop();
	}
	public int min(Stack<Integer> s){
	    int min = Integer.MAX_VALUE;
	    
	    while(s.size() != 0){
	        int ele = s.pop();
	        if(ele < min){
	            min = ele;
	        }
	    }
	    
	    return min;
	}
	public boolean isFull(Stack<Integer>s, int n){
	    return s.size() == n;
	}
	public boolean isEmpty(Stack<Integer>s){
        return s.empty();
	}
}