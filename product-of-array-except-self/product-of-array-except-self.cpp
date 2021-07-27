class Solution {
public:
    vector<int> productExceptSelf(vector<int>& arr) {
        //Create an output Array
        int n = arr.size();
        vector<int> output(n,1);

        vector<int> fromBegin(n);
        vector<int> fromEnd(n);
        
        fromBegin[0]=fromEnd[0]=1;
        
        for(int i=1;i<n;i++){
            fromBegin[i]=fromBegin[i-1]*arr[i-1];
            // printf("begin: %d=%d*%d\n",fromBegin[i],fromBegin[i-1],arr[i-1]);            
            fromEnd[i]=fromEnd[i-1]*arr[n-i];
            // printf("end: %d=%d*%d\n",fromEnd[i],fromEnd[i-1],arr[n-i]);
        }
        
        for(int i=0;i<n;i++){
            output[i]=fromBegin[i]*fromEnd[n-1-i];
        }
        
        /*
        for(int i:fromBegin){
            cout<<i<<" ";
        }
        cout<<endl;
        
        for(int i:fromEnd){
            cout<<i<<" ";
        }
        cout<<endl;
        */
        
        return output;
    }

};