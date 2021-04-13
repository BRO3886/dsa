class Solution:
    
    def is_overlap(self,a,b):
        return a[0] <= b[1] and b[0] <= a[1]
    
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        if len(intervals) == 0:
            return []
        intervals = sorted(intervals, key=lambda i:i[0])
        
        res = [intervals[0]]
        
        for i in intervals[1:]:
            if res[-1][1] >= i[0]:
                res[-1][1] = max(res[-1][1],i[1])
            else:
                res.append(i)
                
        return res