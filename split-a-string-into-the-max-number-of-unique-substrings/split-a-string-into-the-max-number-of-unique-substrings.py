class Solution:
    def maxUniqueSplit(self, s: str) -> int:
        storage = set()
        return self.dfs(s,storage)
    
    def dfs(self, s:str,sett:set) -> int:
        maxx = 0
        for i in range(1,len(s)+1):
            candidate = s[:i]
            if candidate not in sett:
                sett.add(candidate)
                maxx = max(maxx,1 + self.dfs(s[i:],sett))
                sett.remove(candidate)
        
        
        return maxx