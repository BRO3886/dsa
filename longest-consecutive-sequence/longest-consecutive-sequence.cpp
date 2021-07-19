class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        int maxLen = 0;
        unordered_set<int> s;
        
        for(int ele: nums){
            s.insert(ele);
        }
        
        for(int ele: nums){
            int prev = ele - 1;
            //prev (parent) exists
            if(s.find(prev) == s.end()){
                int count = 1;
                int n = ele+1;
                
                while(s.find(n) != s.end()){
                    count++;
                    n++;
                }
                
                maxLen = max(count,maxLen);
            }
        }
        
        return maxLen;
    }
};