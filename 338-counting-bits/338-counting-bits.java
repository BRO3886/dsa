class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        
        for(int i=0; i <= n; i++){
            arr[i] = findOnes(i);
        }
        
        return arr;
    }

    private int findOnes(int n) {
        int count = 0;
        while(n != 0) {
            n = n&(n-1);
            count++;
        }
        
        return count;
    } 
}
