class Solution {
public:
    int trap(vector<int>& height) {
        int n = height.size();
        
        if(n<=2){
            return 0;
        }
        
        vector<int> left(n,0);
        vector<int> right(n,0);
        
        int maxL = height[0],j=0;
        for(int elem: height){
            if(elem > maxL){
                maxL = elem;
            }
            left[j++]=maxL;
            
        }
        
        int maxR = height[n-1];
        for(int i=n-1; i>=0; i--){
            if(height[i] > maxR){
                maxR = height[i];
            }
            right[i]=maxR;
        }
        
//         for(int j: left){
//             cout<<j<<" ";
//         }
        
//         cout<<"\n";
        
//         for(int j: right){
//             cout<<j<<" ";
//         }
        
        int sum = 0;
        for(int i =0; i < n; i++){
            int pos = min(left[i],right[i])-height[i];
            sum+=pos;
        }
        
        return sum;
    }
};