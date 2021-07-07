class Solution {
public:
    vector<string> fizzBuzz(int n) {
        vector<string> data;
        for(int i=1;i<=n;i++){
            string s = "";
            bool found = false;
        
            if(i%3 == 0){
                found = true;
                s.append("Fizz");
            }
            
            if(i%5 == 0){
                found = true;
                s.append("Buzz");
            }

            if(!found){
                s.append(to_string(i));
            }
            
            data.push_back(s);
        }
    
        return data;
    }
};