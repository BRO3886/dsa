class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int idx=0;
        switch(ruleKey){
            case "type":{
                idx = 0;
                break;
            }
            case "color":{
                idx = 1;
                break;
            }
            case "name":{
                idx = 2;
                break;
            }
        }
        
        for(List<String> itemRow: items){
            if (itemRow.get(idx).equals(ruleValue)){
                count++;
            }
        }
        
        return count;
    }
}