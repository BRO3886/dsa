// { Driver Code Starts
#include<bits/stdc++.h>
using namespace std;



 // } Driver Code Ends
class Solution
{
    public:
    void sort012(int arr[], int n){
        /**
         * intuition:
         * the array is divided into 3 parts, low med, high
         * 
         * whenever we see a 0, we move the mid and low 
         * pointers ahead we also swap the current 
         * element (mid) with arr[low]
         * 
         * whenever we see 1, we ignore and just move mid ahead
         * 
         * whenever we see 2, we swap arr[mid] and arr[high] 
         * and decrement high
         * 
         * In this way, we keep adjusting the low, mid and high 
         * such that mid keeps the count of 1s, low for 0s and 
         * high for 2s.
        */
        int mid = 0, low = 0, high = n-1;
        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr[mid],arr[low]);
                mid++;
                low++;
            } else if(arr[mid] == 1){
                mid++;
            } else if(arr[mid] == 2){
                swap(arr[mid],arr[high]);
                high--;
            }
        }
    }
    
};

// { Driver Code Starts.
int main() {

    int t;
    cin >> t;

    while(t--){
        int n;
        cin >>n;
        int a[n];
        for(int i=0;i<n;i++){
            cin >> a[i];
        }

        Solution ob;
        ob.sort012(a, n);

        for(int i=0;i<n;i++){
            cout << a[i]  << " ";
        }

        cout << endl;
        
        
    }
    return 0;
}

  // } Driver Code Ends