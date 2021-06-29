// { Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

 // } Driver Code Ends
class Solution{
    public:
    void segregateElements(int arr[],int n)
    {
        int pos[n],neg[n];
        int j=0, k=0, t;
        for(int i = 0; i<n;i++){
            if(arr[i] > 0){
                pos[j++] = arr[i];
            } else {
                neg[k++] = arr[i];
            }
        }
        int i = 0;
        t = 0;
        while(i<j){
            arr[i++] = pos[t++];
        }
        t = 0;
        while(t<k){
            arr[i++] = neg[t++];
        }
    }
    void printArr(int arr[], int n){
        for(int i=0;i<n;i++){
            printf("%d ",arr[i]);
        }
        printf("\n");
    }
};

// { Driver Code Starts.
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;
		int a[n];
		for(int i=0;i<n;i++)
		cin>>a[i];
		Solution ob;
		ob.segregateElements(a,n);
		
        for(int i=0;i<n;i++)
        cout<<a[i]<<" ";
		cout<<endl;
	}
}
  // } Driver Code Ends