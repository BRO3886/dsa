class Solution {
public:
    int longestMountain(vector<int>& arr) {
        int n = arr.size();
        int largest = 0;
        for(int i=1;i<=n-2;){
            // if we have peak
            if(arr[i] > arr[i-1] and arr[i] > arr[i+1]) {
                int count = 1,j=i;
                
                while(j>=1 and arr[j-1] < arr[j]) {
                    j--;
                    count++;
                }
                
                while(i <= n-2 and arr[i] > arr[i+1]) {
                    i++;
                    count++;
                }
                
                largest = max(largest,count);
                
            } else {
                i++;
            }
        }
        
        return largest;
    }
};