from collections import OrderedDict
class Solution:
    def firstUniqChar(self, s: str) -> int:
        d = OrderedDict()
        for i in s:
            if i in d:
                d[i]+=1
            else:
                d[i] = 1
        
        found = False
        for k in d.keys():
            if d[k] == 1:
                found = True
                return s.index(k)
        
        if found == False:
            return -1