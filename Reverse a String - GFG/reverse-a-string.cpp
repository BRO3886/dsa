// { Driver Code Starts
//Initial Template for C++


#include<bits/stdc++.h>
using namespace std;


string reverseWord(string str);


int main() {
	
	int t;
	cin>>t;
	while(t--)
	{
	string s;
	cin >> s;
	
	cout << reverseWord(s) << endl;
	}
	return 0;
	
}

// } Driver Code Ends


//User function Template for C++

string reverseWord(string str){
    int n = str.length();
    int low = 0;
    int high = n-1;
    while(low<high){
        swap(str[low],str[high]);
        low++;
        high--;
    }
    
    return str;
}