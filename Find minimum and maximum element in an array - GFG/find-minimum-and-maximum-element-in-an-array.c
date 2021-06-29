// { Driver Code Starts
// Initial Template for C

#include <stdio.h>

struct pair {
    long long int min;
    long long int max;
};

struct pair getMinMax(long long int arr[], long long int n) ;

int main() {
    long long int t, n, a[100002], i;
    struct pair minmax;

    scanf("%lld", &t);
    while (t--) {
        scanf("%lld", &n);

        for (i = 0; i < n; i++) scanf("%lld", &a[i]);
        minmax = getMinMax(a, n);
        printf("%lld %lld\n", minmax.min, minmax.max);
    }
    return 0;
}// } Driver Code Ends


// User function Template for C

struct pair getMinMax(long long int arr[], long long int n) {
    struct pair p;
    p.min = arr[0];
    p.max = arr[0];
    
    long long int i;
    for(i=0;i<n;i++){
        if(arr[i] < p.min){
            p.min = arr[i];
        }
        if(arr[i] > p.max){
            p.max = arr[i];
        }
    }
    
    
    return p;
}